package org.example;

import java.util.Arrays;

public class Exercice97 {
    public static void main(String[] args) {
        // La solution la plus facile c'est Arrays.equals, c'est exo était plus là pour mettre en pratique les boucles.
        int[] tableau1 = new int[4]; // cette notation est intéressante si on sait le nombre d'éléments qu'on veut mettre
        tableau1[0] = 1;
        tableau1[1] = 4;
        tableau1[2] = 2;
        tableau1[3] = 3;

        int[] tableau2 = new int[4];
        tableau2[0] = 1;
        tableau2[1] = 4;
        tableau2[2] = 2;
        tableau2[3] = 3;

        int[] tableau3 = new int[4];
        tableau3[0] = 1;
        tableau3[1] = 4;
        tableau3[2] = 3;
        tableau3[3] = 2;

        int[] tableau4 = new int[3];
        tableau4[0] = 1;
        tableau4[1] = 4;
        tableau4[2] = 3;

        String comparaison1 = tableau_egal(tableau1,tableau2);
        String comparaison2 = tableau_egal(tableau1,tableau3);
        String comparaison3 = tableau_egal(tableau1,tableau4);

        System.out.println(Arrays.toString(tableau1)+"\n" +Arrays.toString(tableau2)+"\n"+comparaison1);
        System.out.println();

        System.out.println(Arrays.toString(tableau1)+"\n" +Arrays.toString(tableau3)+"\n"+comparaison2);
        System.out.println();

        System.out.println(Arrays.toString(tableau1)+"\n" +Arrays.toString(tableau4)+"\n"+comparaison3);


    }

    public static String tableau_egal(int[] table1, int[] table2) {
        String message = "Les tableaux sont égaux";
        if (table1.length != table2.length){
            message = "Les tableaux ne sont pas égaux";
        }else{
            for (int i=0; i < table1.length; i++){
                if (table1[i] == table2[i]){
                    ; // do nothing
                }else{
                    message = "Les tableaux ne sont pas égaux";
                    break;
                }


            }
        }
        return message;
    }

}

