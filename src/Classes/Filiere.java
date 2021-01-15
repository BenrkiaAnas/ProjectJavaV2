/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Objects;

/**
 *
 * @author The Black Wolf
 */
public class Filiere {
    Integer id_filiere;
    String nom_filiere;

    public Filiere() {
    }

    public Filiere(Integer id_filiere) {
        this.id_filiere = id_filiere;
    }
    
    
    
    

    public Filiere(Integer id_filiere, String nom_filiere) {
        this.id_filiere = id_filiere;
        this.nom_filiere = nom_filiere;
    }

    public Integer getId_filiere() {
        return id_filiere;
    }

    public void setId_filiere(Integer id_filiere) {
        this.id_filiere = id_filiere;
    }

    public String getNom_filiere() {
        return nom_filiere;
    }

    public void setNom_filiere(String nom_filiere) {
        this.nom_filiere = nom_filiere;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id_filiere);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Filiere other = (Filiere) obj;
        if (!Objects.equals(this.id_filiere, other.id_filiere)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Filiere{" + "id_filiere=" + id_filiere + ", nom_filiere=" + nom_filiere + '}';
    }
    
    
    
}
