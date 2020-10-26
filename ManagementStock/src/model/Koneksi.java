/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.sqlite.SQLiteDataSource;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class Koneksi {
    
      SQLiteDataSource data;

    public Koneksi() {
        this.data = new SQLiteDataSource();
        this.data.setUrl("jdbc:sqlite:contoh.db");   
    }
    
        public PreparedStatement prep(String query) throws SQLException {
        return data.getConnection().prepareStatement(query);
    }
    
}
