/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Classes.Filiere;
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
public class FiliereDao {
    Statement req;
    
    public void seConnecter()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/platforme", "root", "");
            req = conn.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
        
        
    }
    
    public ArrayList<Filiere> getAllFiliere()
    {
        ArrayList<Filiere> filieres = new ArrayList<Filiere>();
        
        try {
            String requete = "select * from filiere";
            ResultSet rst;
            rst = req.executeQuery(requete);
            while (rst.next()) {                
                
                Filiere filiere = new Filiere(rst.getInt("id_filiere"), rst.getString("nom_filiere"));
                
                filieres.add(filiere);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(CourProfDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return filieres;
    }
    
    public Filiere getFiliereByName(String filiere_name)
    {
        Filiere filiere = new Filiere();
        
        try {
            String requete = "select * from filiere where nom_filiere ='"+filiere_name+"'";
            ResultSet rst;
            rst = req.executeQuery(requete);
            rst.next();
            filiere.setId_filiere(rst.getInt("id_filiere"));
            filiere.setNom_filiere(rst.getString("nom_filiere"));
            
        } catch (SQLException ex) {
            Logger.getLogger(CourProfDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return filiere;
    }
}
