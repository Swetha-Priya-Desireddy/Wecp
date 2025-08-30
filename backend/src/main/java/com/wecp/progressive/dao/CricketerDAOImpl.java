package com.wecp.progressive.dao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.wecp.progressive.entity.Cricketer;
public class CricketerDAOImpl implements CricketerDAO {

  @Override
  public int addCricketer(Cricketer cricketer) throws SQLException {
    return -1;
  }

  @Override
  public Cricketer getCricketerById(int cricketerId) throws SQLException {
    return null;
  }

  @Override
  public void updateCricketer(Cricketer cricketer) throws SQLException {
   
  }

  @Override
  public void deleteCricketer(int cricketerId) throws SQLException {
    
  }

  @Override
  public List<Cricketer> getAllCricketers() throws SQLException {
    return new ArrayList<>();
  }
   
}
