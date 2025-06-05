package org.example.exercices;

public class Exercice2 {
    public static void main(String[] args) {

        int A = 1;
        int B = 2;
        A = B;
        B = A;
        System.out.println(A);
        System.out.println(B);
        /* Les deux dernières instructions permettent-elles d'échanger les valeurs de A et B ?
         La réponse est non, car B prend la valeur de A qui prend de B. On a perdu la valeur 1 */

    }

}
