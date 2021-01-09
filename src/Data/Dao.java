/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Classes.Personne;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author lenovo
 */
public class Dao {
    
         Connection  con ;
         Statement stmt ;
//   Livre[] tabBd = new Livre[30];
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
    
    
    public void ajout(Personne p )
    {
        String query ="INSERT INTO personne (id_personne,nom_personne,prenom_personne,login,pwd,id_role) VALUES("+ p.getId()+"','"+p.getNom()+"','"+p.getPrenom()+"','"+p.getLogin()+"','"+p.getPwd()+"','"+p.getRole()+" ');" ;
         try {
          req.executeUpdate(query);
           
       } catch (SQLException ex) {
          System.out.println("erreur Insertion");
          
       }      
    }
    
    public void supprimer(Personne p)
    {
           int nbr=0 ;   
    try {
           String request ="delete from personne where id ="+p.getId() ;
           
          nbr  = stmt.executeUpdate(request);
        
       } catch (SQLException ex) {
          System.out.println("erreur Insertion");
       }
      
    }
    public void modifier(Personne p)
    {
        int nbr=0 ;   
    try {
            String query=" update personne set  nom_personne="+p.getNom()+"',' prenom_personne="+p.getPrenom()+"',' login="+p.getLogin()+"',' pwd="+p.getPwd()+"',' id_role="+p.getRole()+"',' where id_personne="+p.getId()+" ";
           
          nbr  = stmt.executeUpdate(query);
        
       } catch (SQLException ex) {
          System.out.println("erreur Insertion");
       }    
    }
}
