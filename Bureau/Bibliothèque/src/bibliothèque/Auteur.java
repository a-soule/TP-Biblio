/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliothèque;

/**
 *
 * @author a-soule
 */
public class Auteur {
    private int AnneeDeces;
    private int AnneeNaissance;
    private String nom;
    private String prenom;

    public Auteur(int AnneeDeces, int AnneeNaissance, String nom, String prenom) {
        this.AnneeDeces = AnneeDeces;
        this.AnneeNaissance = AnneeNaissance;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getAnneeDeces() {
        return AnneeDeces;
    }

    public void setAnneeDeces(int AnneeDeces) {
        this.AnneeDeces = AnneeDeces;
    }

    public int getAnneeNaissance() {
        return AnneeNaissance;
    }

    public void setAnneeNaissance(int AnneeNaissance) {
        this.AnneeNaissance = AnneeNaissance;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return this.nom+"  "+this.prenom+"  "+ this.AnneeNaissance+"-"+this.AnneeDeces;
    }
    
    
}
