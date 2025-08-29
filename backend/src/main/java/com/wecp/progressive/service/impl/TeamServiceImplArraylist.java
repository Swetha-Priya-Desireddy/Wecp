package com.wecp.progressive.service.impl;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.wecp.progressive.entity.Team;
import com.wecp.progressive.service.TeamService;
public class TeamServiceImplArraylist implements TeamService {
    private List<Team> teams=new ArrayList<>();
    @Override
    public List<Team> getAllTeams() {
        return teams;
    }
    @Override
    public int addTeam(Team team) {
        teams.add(team);
        return teams.size();
    }
    @Override
    public List<Team> getAllTeamsSortedByName() throws SQLException {
         List<Team> sortedList=teams;
        sortedList.sort(Comparator.comparing(Team::getTeamName));
        return sortedList;
    }
    public void emptyArrayList()
    {
        teams=new ArrayList<>();

    }
}