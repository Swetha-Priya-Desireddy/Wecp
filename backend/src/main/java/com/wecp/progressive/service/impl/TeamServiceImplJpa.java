
package com.wecp.progressive.service.impl;

import com.wecp.progressive.entity.Team;
import com.wecp.progressive.exception.TeamAlreadyExistsException;
import com.wecp.progressive.exception.TeamDoesNotExistException;
import com.wecp.progressive.repository.*;
import com.wecp.progressive.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

@Service
public class TeamServiceImplJpa  implements TeamService {

    private TeamRepository teamRepository;

    @Autowired
    TicketBookingRepository ticketBookingRepository;

    @Autowired
    CricketerRepository cricketerRepository;

    @Autowired
    MatchRepository matchRepository;

    @Autowired
    VoteRepository voteRepository;

    @Autowired
    public TeamServiceImplJpa(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @Override
    public List<Team> getAllTeams() throws SQLException {
        return teamRepository.findAll();
    }

    @Override
    public int addTeam(Team team) throws TeamAlreadyExistsException {
        Team sameNameTeam = teamRepository.findByTeamName(team.getTeamName());
        if (sameNameTeam != null) {
            throw new TeamAlreadyExistsException("Team with the same name already exists, TeamName = " + team.getTeamName());
        }
        return teamRepository.save(team).getTeamId();
    }

    @Override
    public List<Team> getAllTeamsSortedByName() throws SQLException {
        List<Team> sortedTeam = teamRepository.findAll();
        sortedTeam.sort(Comparator.comparing(Team::getTeamName));
        return sortedTeam;
    }

    @Override
    public Team getTeamById(int teamId) throws TeamDoesNotExistException {
        Team team = teamRepository.findByTeamId(teamId);
        if (team != null) {
            return team;
        }
        throw new TeamDoesNotExistException("Team with teamId = " + teamId + " does not exist");
    }

    @Override
    public void updateTeam(Team team) throws TeamAlreadyExistsException {
        Team sameNameTeam = teamRepository.findByTeamName(team.getTeamName());
        if (sameNameTeam != null && sameNameTeam.getTeamId() != team.getTeamId()) {
            throw new TeamAlreadyExistsException("Team with the same name already exists, TeamName = " + team.getTeamName());
        }
        teamRepository.save(team);
    }

    @Override
    public void deleteTeam(int teamId) throws SQLException {
        voteRepository.deleteByTeamId(teamId);
        ticketBookingRepository.deleteByTeamId(teamId);
        matchRepository.deleteByTeamId(teamId);
        cricketerRepository.deleteByTeamId(teamId);
        teamRepository.deleteById(teamId);
    }
}
