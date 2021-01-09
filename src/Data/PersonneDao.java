/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Classes.Personne;
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
public class PersonneDao {
    
    
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
    
    public Personne findPersonne(int id)
    {
        Personne p = new Personne();
        try {
            String requete = "select * from personne where id_personne = "+id;
            ResultSet rst;
            rst = req.executeQuery(requete);
            rst.next();
            p.setId(rst.getInt("id_personne"));
            p.setNom(rst.getString("nom_personne"));
            p.setPrenom(rst.getString("prenom_personne"));
            
        } catch (SQLException ex) {
            Logger.getLogger(CourProfDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return p;
    }
    
    public ArrayList<Personne> getAllEtudiants()
    {
        ArrayList<Personne> etudiants = new ArrayList<Personne>();
        
        try {
            String requete = "select * from personne where id_role = 3";
            ResultSet rst;
            rst = req.executeQuery(requete);
            while (rst.next()) {       
                
                Personne personne = new Personne(rst.getInt("id_personne"), rst.getString("nom_personne"), rst.getString("prenom_personne"));
                
                
                etudiants.add(personne);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(CourProfDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return etudiants;
    }
    
    
    public Personne getPersonneByName(String name)
    {
        Personne p = new Personne();
        try {
            String requete = "select * from personne where prenom_personne = '"+name+"'";
            ResultSet rst;
            rst = req.executeQuery(requete);
            rst.next();
            p.setId(rst.getInt("id_personne"));
            p.setNom(rst.getString("nom_personne"));
            p.setPrenom(rst.getString("prenom_personne"));
            
        } catch (SQLException ex) {
            Logger.getLogger(CourProfDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return p;
    }
    
}