package com.minitinder.miniTinder.DAO.impl;

import com.minitinder.miniTinder.DAO.DBHelper;

import java.sql.*;

public class DBHelperImpl implements DBHelper {
    @Override
    public PreparedStatement getStmt(String sql) throws SQLException {
        Connection cnct = DriverManager.getConnection
                ("jdbc:postgresql://localhost:5555/miniTinder", "postgres", "Lidarun005");
        return cnct.prepareStatement(sql);
    }
}
