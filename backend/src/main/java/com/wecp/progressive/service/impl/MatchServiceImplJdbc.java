package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;
import com.wecp.progressive.dao.MatchDAO;
import com.wecp.progressive.entity.Match;
import com.wecp.progressive.service.MatchService;

public class MatchServiceImplJdbc implements MatchService {
    private MatchDAO matchDAO;
    public MatchServiceImplJdbc(MatchDAO matchDAO) {
        this.matchDAO = matchDAO;
    }

    @Override

    public List<Match>getAllMatches()
    {
        return List.of();

    }
    @Override

    public Match getMatchById(int MatchId)
    {
        return null;
    }
    @Override

    public Integer addMatch(Match match)
    {
        return -1;
    }
    @Override

    public void updateMatch(Match match)
    {
        
    }
    @Override

    public void deleteMatch(int matchId)
    {

    }
    

}