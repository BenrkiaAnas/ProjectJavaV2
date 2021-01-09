/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author The Black Wolf
 */
public class Cour {
    
    Integer id_cours;
    String nom_cours;
    Personne id_create;
    Personne id_ens;

    public Cour() {
    }

    public Cour(Integer id_cours, String nom_cours) {
        this.id_cours = id_cours;
        this.nom_cours = nom_cours;
    }
    
    
    public Cour(String nom_cours, Personne id_create, Personne id_ens) {
        this.nom_cours = nom_cours;
        this.id_create = id_create;
        this.id_ens = id_ens;
    }

    public Cour(Integer id_cours, String nom_cours, Personne id_create, Personne id_ens) {
        this.id_cours = id_cours;
        this.nom_cours = nom_cours;
        this.id_create = id_create;
        this.id_ens = id_ens;
    }

    public Integer getId_cours() {
        return id_cours;
    }

    public void setId_cours(Integer id_cours) {
        this.id_cours = id_cours;
    }
    
    
    

    public String getNom_cours() {
        return nom_cours;
    }

    public void setNom_cours(String nom_cours) {
        this.nom_cours = nom_cours;
    }

    public Personne getId_create() {
        return id_create;
    }

    public void setId_create(Personne id_create) {
        this.id_create = id_create;
    }

    public Personne getId_ens() {
        return id_ens;
    }

    public void setId_ens(Personne id_ens) {
        this.id_ens = id_ens;
    }

    @Override
    public String toString() {
        return "Cour{" + "id_cours=" + id_cours + ", nom_cours=" + nom_cours + ", id_create=" + id_create + ", id_ens=" + id_ens + '}';
    }
    
    
    
    
    
    
}
