package org.example.demos;

// Void permet de rien retourner, c'est pour ça qu'on peut travailler sur le main sans utilisation de return
public class Fonctions {
    public static void main(String[] args) {
        double p;
        String nom;
        //String nom;    => On peut pas avoir deux variables qui portent le même nom au sein d'une même accolade... c'est ce qu'on appelle la portée de variables.
        p = perimetreRectangle(10,15); // ici je met juste directement les paramètres, donc genre (10,15) et ca va me mettre directement le parametre associé.
        System.out.println("Le perimetre du rectangle est : "+p);

        p = perimetreRectangle(100,215);
        System.out.println("le perimetre du rectangle est : "+p);
    }
    // syntaxe :
    // visibilité autre-caractéristique type-de-retour nom-de-la-fonction (paramètres si besoin)
    public static double perimetreRectangle(double largeur, double longueur){
        String nom;
        double perimetre;
        perimetre = 2*(largeur+longueur);
        return perimetre;
    }

    public static void petitNom(){
        System.out.println("Je suis une fonction avec un nom pas terrible !!!!");
    }
}
