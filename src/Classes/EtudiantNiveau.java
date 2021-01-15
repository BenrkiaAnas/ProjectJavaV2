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
public class EtudiantNiveau {
    Integer id_etd_nv;
    Personne etudiant;
    Niveau niveau;
    Filiere filiere;

    public EtudiantNiveau() {
    }

    public EtudiantNiveau(Integer id_etd_nv) {
        this.id_etd_nv = id_etd_nv;
    }
    
    

    public EtudiantNiveau(Integer id_etd_nv, Personne etudiant, Niveau niveau, Filiere filiere) {
        this.id_etd_nv = id_etd_nv;
        this.etudiant = etudiant;
        this.niveau = niveau;
        this.filiere = filiere;
    }

    public Integer getId_etd_nv() {
        return id_etd_nv;
    }

    public void setId_etd_nv(Integer id_etd_nv) {
        this.id_etd_nv = id_etd_nv;
    }

    public Personne getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Personne etudiant) {
        this.etudiant = etudiant;
    }

    public Niveau getNiveau() {
        return niveau;
    }

    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id_etd_nv);
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
        final EtudiantNiveau other = (EtudiantNiveau) obj;
        if (!Objects.equals(this.id_etd_nv, other.id_etd_nv)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EtudiantNiveau{" + "id_etd_nv=" + id_etd_nv + ", etudiant=" + etudiant + ", niveau=" + niveau + ", filiere=" + filiere + '}';
    }
    
    
}
