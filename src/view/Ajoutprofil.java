/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;


import Classes.Personne;
import Data.Dao;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author DELL
 */
public class Ajoutprofil extends javax.swing.JFrame {
    
    /**
     * Creates new form Ajoutprofil
     */
    public Ajoutprofil() {
        initComponents();
        Dao d=new Dao();
        d.seConnecter();
        Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        profildata = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTextField6.setBackground(new java.awt.Color(204, 255, 255));

        jTextField1.setBackground(new java.awt.Color(204, 255, 255));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Id");

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Ajouter");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 6, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField2.setBackground(new java.awt.Color(204, 255, 255));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setBackground(new java.awt.Color(204, 255, 255));

        jTextField4.setBackground(new java.awt.Color(204, 255, 255));

        jTextField5.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Nom");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Prenom");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("login");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Password");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Role");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("Affichage/Refresh");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 6, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("Supprimer");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 6, true));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Modifier");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 6, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Le num du role:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel8.setText("Num 1=admin");

        jLabel9.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel9.setText("Num2=prof");

        jLabel10.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel10.setText("Num 3=etudiant");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Retour");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 102), 6, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        profildata.setBackground(new java.awt.Color(204, 255, 255));
        profildata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id_personne", "nom_personne", "prenom-personne", "login", "pwd", "id_role"
            }
        ));
        jScrollPane1.setViewportView(profildata);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(108, 108, 108)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4)
                            .addComponent(jTextField5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(260, 260, 260))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jButton2)))
                    .addComponent(jButton1))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton3))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton5))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton4))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(72, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Adminindex ai= new Adminindex();
        ai.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        /*jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");*/
         try {
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/platforme","root","");
            Statement st=con.createStatement();
            String query="select * from personne";
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
                String id=String.valueOf(rs.getInt("id_personne"));
                  String nom=rs.getString("nom_personne");
                    String prenom=rs.getString("prenom_personne");
                      String login=rs.getString("login");
                        String pwd=rs.getString("pwd");
                          String idrole=String.valueOf(rs.getInt("id_role"));
                          
                          String datatb[]={id,nom,prenom,login,pwd,idrole};
                          DefaultTableModel tbModel=(DefaultTableModel)profildata.getModel();
                          tbModel.addRow(datatb);
            }
                    }
           catch(Exception e)
        {
            JOptionPane.showMessageDialog( null, e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
       
        try {
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/platforme","root","");
            String query=" INSERT INTO personne VALUES (?,?,?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(query);
            
        pst.setInt(1,Integer.parseInt(jTextField6.getText()));    
        pst.setString(2,jTextField1.getText());
        pst.setString(3,jTextField2.getText());
        pst.setString(4,jTextField3.getText());
        pst.setString(5,jTextField4.getText());
        pst.setInt(6,Integer.parseInt(jTextField5.getText()));
        int c=pst.executeUpdate();
        if(c>0){
            JOptionPane.showMessageDialog(null, "ajout avec succés");
        }
        else{
        JOptionPane.showMessageDialog(null, "erreur");
        }
       con.close(); 
        }
        catch(Exception e)
       {
            JOptionPane.showMessageDialog( null, e);
        }
        /*
        Dao d=new Dao();
        d.seConnecter();
        int id=Integer.parseInt(this.jTextField6.getText());
        String nom=this.jTextField1.getText();
        String prenom=this.jTextField2.getText();
        String login=this.jTextField3.getText();
        String pwd=this.jTextField4.getText();
        int id_role=Integer.parseInt(this.jTextField5.getText());
        
        Personne p=new Personne(id,nom,prenom,login,pwd,id_role);
        
        d.ajout(p);
        this.jTextField1.setText("");
        this.jTextField2.setText("");
        this.jTextField3.setText("");
        this.jTextField4.setText("");
        this.jTextField5.setText("");
        this.jTextField6.setText("");
          JOptionPane.showMessageDialog(null, "ajout avec succés");
        */
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/platforme","root","");
            String query=" update personne set  nom_personne=?, prenom_personne=?, login=?, pwd=?, id_role=? where id_personne=? ";
            PreparedStatement pst=con.prepareStatement(query);
          
        pst.setString(1,jTextField1.getText());
        pst.setString(2,jTextField2.getText());
        pst.setString(3,jTextField3.getText());
        pst.setString(4,jTextField4.getText());
        pst.setInt(5,Integer.parseInt(jTextField5.getText()));
        pst.setInt(6,Integer.parseInt(jTextField6.getText()));
        
         int c=pst.executeUpdate();
        if(c>0){
            JOptionPane.showMessageDialog(null, "modifier avec succés");
        }
        else{
        JOptionPane.showMessageDialog(null, "erreur");
        }
          con.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog( null, e);
        }
        /*
        int id=Integer.parseInt(this.jTextField6.getText());
        String nom=this.jTextField1.getText();
        String prenom=this.jTextField2.getText();
        String login=this.jTextField3.getText();
        String pwd=this.jTextField4.getText();
        int id_role=Integer.parseInt(this.jTextField5.getText());
        
        Personne p=new Personne(id,nom,prenom,login,pwd,id_role);
        Dao d=new Dao();
        d.modifier(p);
        this.jTextField1.setText("");
        this.jTextField2.setText("");
        this.jTextField3.setText("");
        this.jTextField4.setText("");
        this.jTextField5.setText("");
        this.jTextField6.setText("");
        */
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try {
        Class.forName("com.mysql.jdbc.Driver");
            Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/platforme","root","");
            String query=" delete from personne where id_personne=? ";
            PreparedStatement pst=con.prepareStatement(query);
         pst.setInt(1,Integer.parseInt(jTextField6.getText()));
         pst.executeUpdate();
    }//GEN-LAST:event_jButton5ActionPerformed
   catch(Exception e)
        {
            JOptionPane.showMessageDialog( null, e);
        }
        /*
          int id=Integer.parseInt(this.jTextField6.getText());
        String nom=this.jTextField1.getText();
        String prenom=this.jTextField2.getText();
        String login=this.jTextField3.getText();
        String pwd=this.jTextField4.getText();
        int id_role=Integer.parseInt(this.jTextField5.getText());
        
        Personne p=new Personne(id,nom,prenom,login,pwd,id_role);
        Dao d=new Dao();
        d.supprimer(p);
         this.jTextField1.setText("");
        this.jTextField2.setText("");
        this.jTextField3.setText("");
        this.jTextField4.setText("");
        this.jTextField5.setText("");
        this.jTextField6.setText("");
        JOptionPane.showMessageDialog(null, "ajout avec succés");
        */
        
    }
private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }         
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ajoutprofil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ajoutprofil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ajoutprofil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ajoutprofil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ajoutprofil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTable profildata;
    // End of variables declaration//GEN-END:variables
}
