/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Classes.Cour;
import Classes.Participation;
import Classes.Personne;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author The Black Wolf
 */
public class ParticipationDao {
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
    
    public void ajouter(Participation participation)
    {
        String requete = "INSERT INTO participation (id_cours,id_etud) values ('"+participation.getCour().getId_cours()+"','"+participation.getEtudiants().getId()+"');";
        try {
            req.executeUpdate(requete);
        } catch (SQLException ex) {
            Logger.getLogger(CourProfDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateNote(Participation participation,float note)
    {
        String requete = "UPDATE  participation SET note = "+note+" WHERE id_cours = '"+participation.getCour().getId_cours()+"' AND id_etud = '"+participation.getEtudiants().getId()+"'";
        try {
            req.executeUpdate(requete);
        } catch (SQLException ex) {
            Logger.getLogger(CourProfDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Participation> getAllEtudiantBycourNote()
    {
        ArrayList<Participation> participations = new ArrayList<Participation>();
        
        try {
            String requete = "select * from participation p left outer join personne per on p.id_etud = per.id_personne left outer join cours c on p.id_cours = c.id_cours";
            ResultSet rst;
            rst = req.executeQuery(requete);
            List<String> data =   new ArrayList<String>();
            
            
            
            
            while (rst.next()) { 
                
                Personne etudiants = new Personne(rst.getInt("id_personne"), rst.getString("nom_personne"), rst.getString("prenom_personne"));
                
                Cour cour = new Cour(rst.getInt("id_cours"), rst.getString("nom_cours"));
                
                
                
                Participation participate = new Participation(cour, etudiants);
                
                participate.setNote(rst.getFloat("note"));
                
                participations.add(participate);
                
                
                
                
                
              
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CourProfDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return participations;
    }
    
    
    
    
}
