package org.example.exercices;

import java.util.Scanner;

public class Exercice13 {
    public static void main(String[] args) {
        // Ecrire un algorithme qui demande successivement 6 nombres à l’utlisateur, et qui lui dit ensuite quel
        //était le plus grand parmi ces 6 nombres
        int number=0;
        int new_number;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i<=6;i++){
            System.out.println("entrez le nombre n°"+i);
            new_number =scanner.nextInt();
            if (i==1){
                number = new_number;
            }else
            if (new_number > number){
                number = new_number;
            }

        }
        System.out.println("le nombre le plus haut est "+number);

    }
}
