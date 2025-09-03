package com.wecp.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.wecp.progressive.entity.Cricketer;
import com.wecp.progressive.entity.Team;
import com.wecp.progressive.repository.CricketerRepository;
import com.wecp.progressive.service.CricketerService;

public class CricketerServiceImplJpa implements CricketerService  {
    private CricketerRepository cricketerRepository;
    
    public CricketerServiceImplJpa(CricketerRepository cricketerRepository) {
        this.cricketerRepository = cricketerRepository;
    }

    @Override
    public List<Cricketer> getAllCricketers() throws SQLException {
        return new ArrayList<>();
    }

    @Override
    public int addCricketer(Cricketer cricketer) throws SQLException {
      return -1;
    }

    @Override
    public List<Cricketer> getAllCricketersSortedByExperience() throws SQLException {
        return new ArrayList<>();
    }
    @Override
    public void updateCricketer(Cricketer cricketer)throws SQLException
    {
       
    }
    @Override

    public void deleteCricketer(int cricketerId)throws SQLException
    {
       
    }
    @Override
    public Cricketer getCricketerById(int cricketerId)throws SQLException
    {
        return null;
    }
    public Cricketer getCricketerByTeam(int TeamId) throws SQLException
    {
        return null;
    }


}