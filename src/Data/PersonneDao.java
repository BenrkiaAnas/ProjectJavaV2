/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Classes.Cour;
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
  /*  public Personne findprof()
    {
         Personne p = new Personne();
        try {
            String requete = "select nom_personne from personne where id_role = 2";
            ResultSet rst;
            rst = req.executeQuery(requete);
            rst.next();
          
            p.setNom(rst.getString("nom_personne"));        
        } catch (SQLException ex) {
            Logger.getLogger(CourProfDao.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return p;      
    }*/
    public ArrayList<Personne> getAllprofs()
    {
        ArrayList<Personne> profs = new ArrayList<Personne>();
        
        try {
            String requete = "select * from personne where id_role=2";
            ResultSet rst;
            rst = req.executeQuery(requete);
            while (rst.next()) {                
                
                Personne prof = new Personne(rst.getInt("id_personne"), rst.getString("nom_personne"),rst.getString("prenom_personne"),rst.getString("login"),rst.getString("pwd"),rst.getInt("id_role"));
                
                profs.add(prof);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(CourProfDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return profs;
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
    
    public ArrayList<Personne> getAllEtudiants(Cour cour)
    {
        ArrayList<Personne> etudiants = new ArrayList<Personne>();
        
        try {
            String requete = "select * from etudiant_nv env left outer join personne p on env.id_etud = p.id_personne where env.id_nv = "+cour.getNiveau().getId_nv()+" and env.id_filiere = "+cour.getFiliere().getId_filiere();
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
    
    public ArrayList<Personne> getEtudiantsByCour(Cour cour)
    {
        ArrayList<Personne> etudiants = new ArrayList<Personne>();
        
        try {
            String requete = "select * from participation p left outer join cours c on p.id_cours = c.id_cours left outer join personne per on p.id_etud = per.id_personne where c.id_cours = "+cour.getId_cours();
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
    
}
