package org.example.exercices;

import java.util.Scanner;
//Ecrire un algorithme qui demande un nombre de départ et qui calcule la somme des enKers jusqu’à
//ce nombre.
//Par exemple, si l’on entre 4, le programme doit calculer: 1 + 2 + 3 + 4 = 10

public class Exercice14 {
    public static void main(String[] args) {
        int calcul=0, n=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("donner un nombre");
        n = scanner.nextInt();
        for(int i =1; i<=n; i++){
            calcul = calcul + i;
            if (i != n){
                System.out.print(i+"+");
            }else{
                System.out.print(i);
            }
        }
        System.out.println("\n= "+calcul);

    }
}
