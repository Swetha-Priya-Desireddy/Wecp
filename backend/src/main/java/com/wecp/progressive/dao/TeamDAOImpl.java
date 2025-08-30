package com.wecp.progressive.dao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.wecp.progressive.entity.Team;
public class TeamDAOImpl implements TeamDAO {

    @Override
    public int addTeam(Team team) throws SQLException {
       return -1;
    }

    @Override
    public Team getTeamById(int teamId) throws SQLException {
       return null;
    }

    @Override
    public void updateTeam(Team team) throws SQLException {
       
    }

    @Override
    public void deleteTeam(int teamId) throws SQLException {
       
    }

    @Override
    public List<Team> getAllTeams() throws SQLException {
       return new ArrayList<>();
    }

    


}
