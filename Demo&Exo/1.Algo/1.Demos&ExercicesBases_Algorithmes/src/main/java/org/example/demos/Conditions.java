package org.example.demos;

public class Conditions {
    public static void main(String[] args) {

        System.out.println("Demo structure conditionnelle !!!");

        // si => if
        if (3 > 2) {// java me dit que c'est stupide car c'est toujours le cas, mais on met ça juste pour l'exemple
            System.out.println("3 est supérieur à 2 !!!!");
        }

        if (4 > 5) {
            System.out.println("4 est supérieur à 5 !!!");
        } else
            System.out.println("4 est pas supérieur à 5!!!");

        // if else if else
        double note = 15;

        if (note >= 16) {
            System.out.println("Tres bien");
        } else if (note >= 14) {
            System.out.println("Bien");
        } else if (note >= 12) {
            System.out.println("Assez bien");
        } else {
            System.out.println("bof");
        }

        // faire trop else if c'est pas ouf... une alternative c'est faire un switch case
        int choix = 5;
        switch (choix){
            case 1:
                System.out.println("Bonjour !!!");
                break; // break pour dire que c'est terminé
            case 2:
                System.out.println("Au revoir !!!");
                System.out.println("Bye bye!");
                break;
            case 3:
                System.out.println("Bonne nuit !!");
                break;
            default:
                System.out.println("Choix ne correspond a aucun cas défini !!!");
                break;
        }
        // autre façon d'écrire le switch case (existe sur les récentes versions de Java, à partir de Java 17
        switch (choix) {
            case 1 -> System.out.println("Bonjour !!!");
            case 2, 3 -> System.out.println(" Au revoir !!!");
            default -> System.out.println("Choix ne correspond à aucun cas défini...");}

        // Test conditions imbriqués

        boolean frigoVide = true;
        boolean frigoPlein = true;
        boolean reservoirVide = true;
        // Alternativement, si on veut utiliser frigoPLein, donc on doit inverser, on fait if (!frigoPlein), "!" etant l'operateur not.
        if(frigoVide) {
            System.out.println("je fais les courses"); // if (frigoVide == true marche aussi)
            if(reservoirVide){
                System.out.println("puisque je suis au magasin"); // le if pour les booleéns il va continuer si on est true par defaut
                System.out.println("j'en profite pour faire le plein");
            }
        }else {
            System.out.println("je ne bouge pas");

        }


    }
}
