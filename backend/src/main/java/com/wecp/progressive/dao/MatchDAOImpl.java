package com.wecp.progressive.dao;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.entity.Match;

public class MatchDAOImpl implements MatchDAO {

    @Override
    public int addMatch(Match match) {
       return -1;
    }

    @Override
    public Match getMatchById(int matchId) {
        return null;
    }

    @Override
    public void updateMatch(Match match) {
       
    }

    @Override
    public void deleteMatch(int matchId) {
       
    }

    @Override
    public List<Match> getAllMatches() {
        return new ArrayList<>();
    }

}
