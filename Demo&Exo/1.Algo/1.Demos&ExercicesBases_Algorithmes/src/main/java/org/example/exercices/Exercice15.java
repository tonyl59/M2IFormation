package org.example.exercices;

public class Exercice15 {
    public static void main(String[] args) {
        //Ecrire un algorithme qui permet d’afficher les tables de multiplication des nombres de 1 à 10 d’un
        //seul coup

        for(int i =1; i<=10 ; i++){
            System.out.print("\ntable de multiplication de "+i+": ");
            for(int j =1;j<=10;j++ ){
                System.out.print(i*j+" ");



            }
        }

    }
}
