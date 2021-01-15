/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Classes.Cour;
import Classes.EtudiantNiveau;
import Classes.Filiere;
import Classes.Niveau;
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
        String requete = "INSERT INTO participation (id_cours,id_etud_nv) values ('"+participation.getCour().getId_cours()+"','"+participation.getEtudiant().getId_etd_nv()+"');";
        try {
            req.executeUpdate(requete);
        } catch (SQLException ex) {
            Logger.getLogger(CourProfDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateNote(Participation participation,float note)
    {
        String requete = "UPDATE  participation SET note = "+note+" WHERE id_cours = '"+participation.getCour().getId_cours()+"' AND id_etud_nv = '"+participation.getEtudiant().getId_etd_nv()+"'";
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
            String requete = "select * from participation p left outer join etudiant_nv nv on p.id_etud_nv = nv.id_etd_nv left outer join personne per on nv.id_etud = per.id_personne left outer join cours c on p.id_cours = c.id_cours";
            ResultSet rst;
            rst = req.executeQuery(requete);
            List<String> data =   new ArrayList<String>();
            
            
            
            
            while (rst.next()) { 
                
                FiliereDao filiereDao = new FiliereDao();
                filiereDao.seConnecter();
                Filiere filiere = filiereDao.getFiliereById(rst.getInt("id_filiere"));
                
                NiveauDao niveauDao = new NiveauDao();
                niveauDao.seConnecter();
                Niveau niveau = niveauDao.getNiveauById(rst.getInt("id_niveau"));
                
                PersonneDao personneDao = new PersonneDao();
                personneDao.seConnecter();
                Personne etudiant = personneDao.getPersonneById(rst.getInt("id_personne"));
                
                
                EtudiantNiveau etudiantNiveau = new EtudiantNiveau(rst.getInt("id_etd_nv"), etudiant, niveau, filiere);
                
                
                Cour cour = new Cour(rst.getInt("id_cours"), rst.getString("nom_cours"));
                
                
                
                Participation participate = new Participation(cour, etudiantNiveau);
                
                participate.setNote(rst.getFloat("note"));
                
                participations.add(participate);
                
                
                
                
                
              
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CourProfDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return participations;
    }
    
    
    
    
}
