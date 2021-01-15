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
public class Participation {
    Cour cour;
    EtudiantNiveau etudiant;
    Float note = null;

    public Participation(Cour cour, EtudiantNiveau etudiant) {
        this.cour = cour;
        this.etudiant = etudiant;
    }

    public Participation() {
    }

    public Cour getCour() {
        return cour;
    }

    public void setCour(Cour cour) {
        this.cour = cour;
    }

    public EtudiantNiveau getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(EtudiantNiveau etudiant) {
        this.etudiant = etudiant;
    }

    public Float getNote() {
        return note;
    }

    public void setNote(Float note) {
        this.note = note;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.cour);
        hash = 41 * hash + Objects.hashCode(this.etudiant);
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
        final Participation other = (Participation) obj;
        if (!Objects.equals(this.cour, other.cour)) {
            return false;
        }
        if (!Objects.equals(this.etudiant, other.etudiant)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Participation{" + "cour=" + cour + ", etudiant=" + etudiant + ", note=" + note + '}';
    }
}
