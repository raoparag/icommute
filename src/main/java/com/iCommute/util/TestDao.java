package com.iCommute.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

import java.sql.SQLException;

public class TestDao {
  
  private DataSource dataSource;
  
  public void setDataSource(DataSource dataSource) {
      this.dataSource = dataSource;
  }
  
  String sql = "select * from test";
  
public void testConnection () {
  Connection conn = null;

  try {
    conn = dataSource.getConnection();
    PreparedStatement ps = conn.prepareStatement(sql);
    if (ps.execute()) {
      System.out.println("fine");
     
    } else {
      System.out.println("something bad");
    }
    ps.close();

  } catch (SQLException e) {
    throw new RuntimeException(e);

  } finally {
    if (conn != null) {
        try {
            conn.close();
        } catch (SQLException e) {}
    }
  }
}


}
