/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Classes.Niveau;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author The Black Wolf
 */
public class NiveauDao {
    Statement req;
    
    public void seConnecter()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/platforme", "root", "");
            req = conn.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        
        
    }
    
    public ArrayList<Niveau> getNiveau()
    {
        ArrayList<Niveau> nv = new ArrayList<Niveau>();
        
        try {
            String requete = "select * from niveau";
            ResultSet rst;
            rst = req.executeQuery(requete);
            while (rst.next()) {  
                Niveau niveau = new Niveau(rst.getInt("id_nv"), rst.getString("nom_nv"));
                
                
                nv.add(niveau);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(CourProfDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return nv;
    }
    
    public Niveau getNiveauByName(String niveau_name)
    {
        Niveau niveau = new Niveau();
        
        try {
            String requete = "select * from niveau where nom_nv ='"+niveau_name+"'";
            ResultSet rst;
            rst = req.executeQuery(requete);
            rst.next();
            niveau.setId_nv(rst.getInt("id_nv"));
            niveau.setNom_niveau(rst.getString("nom_nv"));
            
        } catch (SQLException ex) {
            Logger.getLogger(CourProfDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return niveau;
    }
}
