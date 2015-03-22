package com.iCommute.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.iCommute.DC;
import com.iCommute.FromDetail;
import com.iCommute.ToDetail;

public class PopulateDetailsService {

  public DC getDCDetails() {

    DC dc = new DC();
    Connection conn = DBConnectionUtil.getDBConnection();
    ResultSet rs = null;
    Statement st = null;
    try {
      String sql = "select DC_ID, DC_NAME, DC_LOCACTION_ID from DC_INFO";
      st = conn.createStatement();

      rs = st.executeQuery(sql);
      while (rs.next()) {
        Integer dcID = rs.getInt("DC_ID");
        String dcName = rs.getString("DC_NAME");
        Integer dcLocID = rs.getInt("DC_LOCACTION_ID");
        dc.setDcID(dcID);
        dc.setDcName(dcName);
        dc.setDcLocID(dcLocID);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        rs.close();
        st.close();
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
     
      
    }

    return dc;
  }

  public ToDetail getToDetails() {

    ToDetail toDetails = new ToDetail();
    Connection conn = DBConnectionUtil.getDBConnection();
    ResultSet rs = null;
    Statement st = null;
    try {
      String sql = "select ID, NAME from LOCATION_DTL where LOCATION_TYPE = 'OFFICE'";
      st = conn.createStatement();

      rs = st.executeQuery(sql);
      while (rs.next()) {
        Integer id = rs.getInt("ID");
        String name = rs.getString("NAME");
        toDetails.setId(id);
        toDetails.setName(name);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        rs.close();
        st.close();
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }

    return toDetails;
  }
  
  public FromDetail getFromDetails() {

    FromDetail fromDetails = new FromDetail();
    Connection conn = DBConnectionUtil.getDBConnection();
    ResultSet rs = null;
    Statement st = null;
    try {
      String sql = "select ID, NAME from LOCATION_DTL where LOCATION_TYPE = 'BOARDING_POINT'";
      st = conn.createStatement();

      rs = st.executeQuery(sql);
      while (rs.next()) {
        Integer id = rs.getInt("ID");
        String name = rs.getString("NAME");
        fromDetails.setId(id);
        fromDetails.setName(name);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        rs.close();
        st.close();
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }

    return fromDetails;
  }
  
}
