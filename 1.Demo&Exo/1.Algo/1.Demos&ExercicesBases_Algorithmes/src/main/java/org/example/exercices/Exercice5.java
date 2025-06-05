package org.example.exercices;

import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {

        // Etape 1 : je veux récupérer le nombre de copies à faire
        int nb_copies;
        Scanner scanner = new Scanner(System.in);
        System.out.println("entrer le nombre de photocopies effectuées");
        nb_copies =scanner.nextInt();

        //Version 2 else if (la meilleure, que j'utilise. J'aurais pu stocker "prix copie" en une variable pour eviter de faire 3 print different et rendre le code plus lisible, mais en echange je stocke une variable en moins))
        if(nb_copies<10) {
            System.out.println("Vous avez "+ nb_copies +" copies\npuisqu'on est en-dessous de 10 copies, chaque copie coute 50 centimes donc le prix total à payer est de "
                    + Math.round(nb_copies * 0.5*100)/100.0d + " €");
        }else if(nb_copies<=20) {
            System.out.println("Vous avez "+ nb_copies +" copies\npuisqu'on est entre 10 à 20 copies, chaque copie coute 40 centimes donc le prix total à payer est de "
                    + Math.round(nb_copies * 0.4*100)/100.0d + " €"); //ici le *100)/100.d permet juste d'afficher la décimal. Si j'ai 19 copies, le prix est 7.6000005€,
                                                                      //le math round seul va l'arrondir à 8€, le 100)/100.0d va bien arrondir à 7.6.
        } else {
            System.out.println("Vous avez "+ nb_copies +" copies\npuisqu'on est au-dessus de 20 copies, chaque copie coute 30 centimes donc le prix total à payer est de "
                    + Math.round(nb_copies * 0.3*100)/100.0d + " €");
        }
//*100)/100.0d
        // autre methode prof (revoir la correction)
        /*
        if(nb_copies<10) {
            System.out.println("Vous avez "+ nb_copies +" copies,\npuisqu'on est en-dessous de 10 copies, chaque copie coute 50 centimes");
            System.out.println("le prix total à payer est de " + nb_copies * 0.5 + " €");
        }else {
            if (nb_copies <= 20){
                System.out.println("Vous avez "+ nb_copies +" copies,\npuisqu'on est entre 10 à 20 copies, chaque copie coute 40 centimes");
                System.out.println("le prix total à payer est de " + nb_copies * 0.4 + " €");
            }else{
                System.out.println("Vous avez " + nb_copies + " copies,\npuisqu'on est au-dessus de 20 copies, chaque copie coute 30 centimes");
                System.out.println("le prix total à payer est de " + nb_copies * 0.3 + " €");
            }  */

    }
}