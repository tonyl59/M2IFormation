package org.example.exercices;

public class Exercice3 {
    public static void main(String[] args) {
        // on veut intervertir les valeurs A et B comme on le voulait de base sur l'exercice 2, donc on va devoir reecrire le code pour ça
        int A = 1, B = 2, Aold = A;
        System.out.printf("Au début, A = %d et B = %d \n", A, B);
        A = B;
        B = Aold; // Je crée une 3eme variable qui garde l'ancienne valeur de A avant de transformer A
        System.out.printf("A la fin, A = %d et B = %d", A, B);

    }

}

