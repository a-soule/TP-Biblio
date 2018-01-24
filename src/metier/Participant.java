package metier;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Classe Participant
 *
 * @author Clément BOIN
 */
@Entity
@Table(name = "participant")
public class Participant {

    //Numéro de participant
    @Id
    @GeneratedValue
    @Column(name = "num_pers")
    private int num_pers;

    // Nom du participant
    @Column(name = "nom")
    private String nom;

    // Prénom du participant
    @Column(name = "prenom")
    private String prenom;
    
    // Email du participant
    @Column(name = "email")
    private String email;
    
    // Date de naissance du participant
    @Column(name = "date_naiss")
    private String date_naiss;

    // Organisation dont fait partie le participant
    @Column(name = "organisation")
    private String organisation;
    
    // Prénom du participant
    @Column(name = "observations")
    private String observations;
    
    // Nom d'utilisateur du participant
    @Column(name = "login")
    private String login;
    
    // Mot de passe du participant
    @Column(name = "password")
    private String password;

    public Participant(int num_pers, String nom, String prenom, String email, String date_naiss, String organisation, String observations, String login, String password) {
        this.num_pers = num_pers;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.date_naiss = date_naiss;
        this.organisation = organisation;
        this.observations = observations;
        this.login = login;
        this.password = password;
    }

    public Participant() {
    }

    public int getNum_pers() {
        return num_pers;
    }

    public void setNum_pers(int num_pers) {
        this.num_pers = num_pers;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate_naiss() {
        return date_naiss;
    }

    public void setDate_naiss(String date_naiss) {
        this.date_naiss = date_naiss;
    }

    public String getOrganisation() {
        return organisation;
    }

    public void setOrganisation(String organisation) {
        this.organisation = organisation;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Participant{" + "num_pers=" + num_pers + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", date_naiss=" + date_naiss + ", organisation=" + organisation + ", observations=" + observations + ", login=" + login + ", password=" + password + '}';
    }
}