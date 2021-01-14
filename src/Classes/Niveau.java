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
public class Niveau {
    Integer id_nv;
    String nom_niveau;

    public Niveau() {
    }
    
    

    public Niveau(Integer id_nv, String nom_niveau) {
        this.id_nv = id_nv;
        this.nom_niveau = nom_niveau;
    }

    public Integer getId_nv() {
        return id_nv;
    }

    public void setId_nv(Integer id_nv) {
        this.id_nv = id_nv;
    }

    public String getNom_niveau() {
        return nom_niveau;
    }

    public void setNom_niveau(String nom_niveau) {
        this.nom_niveau = nom_niveau;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.id_nv);
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
        final Niveau other = (Niveau) obj;
        if (!Objects.equals(this.id_nv, other.id_nv)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Niveau{" + "id_nv=" + id_nv + ", nom_niveau=" + nom_niveau + '}';
    }
    
    
}
