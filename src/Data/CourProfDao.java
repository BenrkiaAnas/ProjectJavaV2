/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Classes.Cour;
import Classes.Personne;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author The Black Wolf
 */
public class CourProfDao {
    
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
    
    public void ajouter(Cour cour)
    {
        String requete = "INSERT INTO cours (nom_cours,id_create,id_ens,description,id_niveau,id_filiere) values ('"+cour.getNom_cours()+"','"+cour.getId_create().getId()+"','"+cour.getId_ens().getId()+"','"+cour.getDescription()+"','"+cour.getNiveau().getId_nv()+"','"+cour.getFiliere().getId_filiere()+"');";
        try {
            req.executeUpdate(requete);
        } catch (SQLException ex) {
            Logger.getLogger(CourProfDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<Cour> listeCour()
    {
        ArrayList<Cour> cours = new ArrayList<Cour>();
        
        try {
            String requete = "select * from cours c left outer join personne p on c.id_create = p.id_personne";
            ResultSet rst;
            rst = req.executeQuery(requete);
            while (rst.next()) {                
                
                Cour cour = new Cour(rst.getString("nom_cours"), new Personne(rst.getInt("id_personne"), rst.getString("nom_personne"), rst.getString("prenom_personne")), new Personne(rst.getInt("id_personne"), rst.getString("nom_personne"), rst.getString("prenom_personne")));
                
                cours.add(cour);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(CourProfDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cours;
        
        
    }
    
    public ArrayList<Cour> findCoursByProf(int id)
    {
        ArrayList<Cour> cours = new ArrayList<Cour>();
        
        try {
            String requete = "select * from cours c left outer join personne p on c.id_create = p.id_personne where id_ens ="+id;
            ResultSet rst;
            rst = req.executeQuery(requete);
            while (rst.next()) {                
                
                Cour cour = new Cour(rst.getString("nom_cours"), new Personne(rst.getInt("id_personne"), rst.getString("nom_personne"), rst.getString("prenom_personne")), new Personne(rst.getInt("id_personne"), rst.getString("nom_personne"), rst.getString("prenom_personne")));
                
                cours.add(cour);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(CourProfDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cours;
    }
    
    public Cour getCourByName(String cour_name)
    {
        
        Cour cour = new Cour();
        
        try {
            String requete = "select * from cours where nom_cours ='"+cour_name+"'";
            ResultSet rst;
            rst = req.executeQuery(requete);
            rst.next();
            cour.setId_cours(rst.getInt("id_cours"));
            cour.setNom_cours(rst.getString("nom_cours"));
            
        } catch (SQLException ex) {
            Logger.getLogger(CourProfDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cour;
    }
    
}
