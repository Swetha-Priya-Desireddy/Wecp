package com.wecp.progressive.service.impl;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import com.wecp.progressive.entity.Cricketer;
import com.wecp.progressive.service.CricketerService;
public class CricketerServiceImplArraylist implements CricketerService {
    private static List<Cricketer> cricketerList=new ArrayList<>();

    @Override
    public List<Cricketer> getAllCricketers() throws SQLException {
        return cricketerList;
    }

    @Override
    public int addCricketer(Cricketer cricketer) throws SQLException {
        cricketerList.add(cricketer);
       return cricketerList.size();
    }

    @Override
    public List<Cricketer> getAllCricketersSortedByExperience() throws SQLException {
        List<Cricketer> sortedCricketer=cricketerList;
        sortedCricketer.sort(Comparator.comparing(Cricketer::getExperience));
        return sortedCricketer;
    }
    @Override
    public void emptyArrayList()
    {
        cricketerList=new ArrayList<>();
    }

}