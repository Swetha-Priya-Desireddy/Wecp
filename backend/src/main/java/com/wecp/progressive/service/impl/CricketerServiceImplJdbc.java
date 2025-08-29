package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.dao.CricketerDAO;
import com.wecp.progressive.entity.Cricketer;

public class CricketerServiceImplJdbc  {
    private CricketerDAO cricketerDAO;
    public List<Cricketer>getAllCricketers()
    {
        return new ArrayList<>();
    }
    public int addCricketer(Cricketer cricketer)
    {
        return -1;
    }
    public List<Cricketer>getAllCricketersSortedByExperience()
    {
        return new ArrayList<>();
    }
    public void updateCricketer(Cricketer cricketer)
    {
        
    }
    public void deleteCricketer(int cricketerId)
    {

    }
    public Cricketer getCricketerById(int cricketerId)
    {
        return null;
    }

}