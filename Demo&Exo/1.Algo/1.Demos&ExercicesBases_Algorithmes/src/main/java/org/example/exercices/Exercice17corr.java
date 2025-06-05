package org.example.exercices;

import java.util.Scanner;

public class Exercice17corr {
    public static void main(String[] args) {
        int noteMax = 0;
        int noteMin = 0;
        int nbNotes= 0;
        int somme = 0;
        int noteSaisie = 99;

        Scanner scanner = new Scanner(System.in);

        while (noteSaisie != 0){
            System.out.println("Saisir la note n°"+(nbNotes+1));
            noteSaisie = scanner.nextInt();
            if (noteSaisie != 0){
                somme = somme + noteSaisie;
                if(nbNotes == 0){
                    noteMax = noteSaisie;
                    noteMin = noteSaisie;
                }else {
                    if(noteSaisie> noteMax){
                        noteMax = noteSaisie;
                    }
                    if(noteSaisie < noteMin){
                        noteMin = noteSaisie;
                    }
                }
                nbNotes++;
            }
        }


//            System.out.println("Saisir la note n°"+i);
//            noteSaisie = scanner.nextInt();
//            somme += noteSaisie;
//            if (i == 1){
//                noteMax = noteSaisie;
//                noteMin = noteSaisie;
//            }
//
//            if(noteSaisie > noteMax){
//                noteMax = noteSaisie;
//            }
//
//            if (noteSaisie < noteMin){
//                noteMin = noteSaisie;
//            }




        int choixMenu;

        do {
            System.out.println("""
                                Menu :
                    1- Afficher la plus grande note
                    2- Afficher la plus petite note
                    3- Afficher la moyenne
                    0- Quitter
                    Votre choix :
                    """);
            choixMenu = scanner.nextInt();
            switch (choixMenu){
                case 1:
                    System.out.println("La note max est : "+noteMax);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("La note min est : "+noteMin);
                    break;
                case 3:
                    System.out.println("La moyenne est : "+somme/nbNotes);
                    break;
                case 0:
                    System.out.println("Au revoir !!!");
                    break;
                default:
                    System.out.println("Choix invalide !!!!!");
                    break;
            }

        }while (choixMenu != 0);
    }
}
