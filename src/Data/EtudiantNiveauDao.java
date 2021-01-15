/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Classes.EtudiantNiveau;
import Classes.Filiere;
import Classes.Niveau;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author The Black Wolf
 */
public class EtudiantNiveauDao {
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
    
    public EtudiantNiveau getEtudiantNiveauByPersonne(String name_personne)
    {
        EtudiantNiveau etudiantNiveau = new EtudiantNiveau();
        
        try {
            String requete = "select * from etudiant_nv nv left outer join personne p on nv.id_etud = p.id_personne where p.prenom_personne = '"+name_personne+"'";
            ResultSet rst;
            rst = req.executeQuery(requete);
            rst.next();
            
            etudiantNiveau.setId_etd_nv(rst.getInt("id_etd_nv"));
            
         
            
        } catch (SQLException ex) {
            Logger.getLogger(CourProfDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return etudiantNiveau;
    }
}
