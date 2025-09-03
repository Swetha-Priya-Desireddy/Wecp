package com.wecp.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.entity.Match;
import com.wecp.progressive.repository.MatchRepository;
import com.wecp.progressive.service.MatchService;

public class MatchServiceImplJpa implements MatchService  {
    private MatchRepository matchRepository;
    
    public MatchServiceImplJpa(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    @Override
    public List<Match> getAllMatches() throws SQLException {
        return new ArrayList<>();
    }

    @Override
    public Match getMatchById(int matchId) throws SQLException {
       return null;
    }

    @Override
    public Integer addMatch(Match match) throws SQLException {
       return -1;
    }

    @Override
    public void updateMatch(Match match) throws SQLException {
        
    }

    @Override
    public void deleteMatch(int matchId) throws SQLException {
       
    }
    @Override
    public List<Match> getAllMatchesByStatus(String status) 
    {
        return null;
    }
}