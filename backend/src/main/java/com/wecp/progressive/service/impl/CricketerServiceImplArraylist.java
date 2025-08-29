package com.wecp.progressive.service.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.wecp.progressive.entity.Cricketer;
import com.wecp.progressive.service.CricketerService;
public class CricketerServiceImplArraylist implements CricketerService {
    private static List<Cricketer> cricketers=new ArrayList<>();

    @Override
    public List<Cricketer> getAllCricketers() throws SQLException {
        return cricketers;
    }

    @Override
    public int addCricketer(Cricketer cricketer) throws SQLException {
       cricketers.add(cricketer);
       return cricketers.size();
    }

    @Override
    public List<Cricketer> getAllCricketersSortedByExperience() throws SQLException {
        List<Cricketer> sortedList=cricketers;
        sortedList.sort(Comparator.comparing(Cricketer::getExperience));
        return sortedList;
    }
    public void emptyArrayList()
    {
        cricketers=new ArrayList<>();
    }

}