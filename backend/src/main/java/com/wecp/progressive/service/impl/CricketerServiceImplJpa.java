package com.wecp.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
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
        return cricketerRepository.findAll();
    }

    @Override
    public Integer addCricketer(Cricketer cricketer) throws SQLException {
      return cricketerRepository.save(cricketer).getCricketerId();
    }

    @Override
    public List<Cricketer> getAllCricketersSortedByExperience() throws SQLException {
        List<Cricketer>sortedCricketer=cricketerRepository.findAll();
        sortedCricketer.sort(Comparator.comparing(Cricketer::getExperience));
        return sortedCricketer;
    }
    @Override
    public void updateCricketer(Cricketer cricketer)throws SQLException
    {
       cricketerRepository.save(cricketer);
    }
    @Override

    public void deleteCricketer(int cricketerId)throws SQLException
    {
        cricketerRepository.deleteById(cricketerId);
    }
    @Override
    public Cricketer getCricketerById(int cricketerId)throws SQLException
    {
        return cricketerRepository.findByCricketerId(cricketerId);
    }
    @Override
    public List<Cricketer> getCricketersByTeam(int teamId) throws SQLException
    {
        return cricketerRepository.findByTeam_TeamId(teamId);
    }


}