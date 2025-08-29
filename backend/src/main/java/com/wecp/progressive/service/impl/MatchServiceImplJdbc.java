package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;
import com.wecp.progressive.dao.MatchDAO;
import com.wecp.progressive.entity.Match;

public class MatchServiceImplJdbc  {
    private MatchDAO matchDAO;
    public List<Match>getAllMatches()
    {
        return new ArrayList<>();
    }
    public Match getMatchById(int MatchId)
    {
        return null;
    }
    public int addMatch(Match match)
    {
        return -1;
    }
    public void updateMatch(Match match)
    {
        
    }
    public void deleteMatch(int matchId)
    {

    }
    

}