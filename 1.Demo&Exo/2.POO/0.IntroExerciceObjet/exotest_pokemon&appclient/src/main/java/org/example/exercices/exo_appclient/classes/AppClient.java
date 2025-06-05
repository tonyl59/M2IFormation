package org.example.classes;

public class AppClient {
    // public Integer id;
    private String nom; // il faut que je met public derrière à chaque fois car le main est dans org.example, alors que Appclient est dans classes
    private String prenom;
    private String nomComplet; // utilise nom et prenom mais pas besoin de se casser la tête à faire un getter et setter...
    public String email;
    public String motDePasse;

    public AppClient(){ // <- fonction dans une classe = methode
        this.nom = "Doe";
        this.prenom = "John";
        this.email = "j.doe@example.com";
        this.motDePasse = "password";
    }
    public String donnePrenom() {
        return this.prenom;

    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }



    public String getNomComplet() {
        return prenom.substring(0,1).toUpperCase() + prenom.substring(1).toLowerCase() + " "
                + nom.toUpperCase();
        //return String.format("%s %s", prenom, nom); //même chose que la ligne au-dessus
    }

    public String getPrenom() {
        return prenom;
    }

    void setPrenom(String nouveauPrenom){
        this.prenom = nouveauPrenom;

    }

    @Override //Override permet de remplacer les fonctions de base, ici toString qui existe deja
    public String toString(){
        return String.format("Le client %s %s a comme email %s et commem ot de passe %s", prenom,nom, email, motDePasse);
    }
}
