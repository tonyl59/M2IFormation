package org.example.exercices;

public class Exercice12 {
    public static void main(String[] args) {
     //afficher la table de multiplication de 9

         /* //Version WHILE, je préfère for car je sais que le nombre de boucle sera n+1.
         int n = 9;
         int cpt = 0, calcul = 0;
         while(calcul != n*n){
             calcul = n*cpt;
             System.out.println(calcul);
             cpt++;
     } */
        int n=9, calcul;
        for (int i=0; i <=n; i++){
            calcul = n*i;
            System.out.println(calcul);

        }

    }
}

