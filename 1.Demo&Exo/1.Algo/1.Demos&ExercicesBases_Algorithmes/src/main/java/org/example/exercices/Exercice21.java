package org.example.exercices;

import java.util.Arrays;
import java.util.Scanner;

public class Exercice21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 5;
        int m = 2;
        int[][] a = notes_mat(scanner,n, m );
        for (int i=0; i<=n-1;i++){
            System.out.println();
            System.out.print("étudiant "+(i+1)+" : ");
            for (int j=0; j<=m-1;j++){
                System.out.print(a[i][j]+" ");
            }
        }

    }
    public static int[][] notes_mat(Scanner paramScan, int n, int m) {
        // String[][] prenoms = new String[3][2];
        int[][] titresNotes = new int[n][m];

        for (int i=0; i<=n-1;i++){ // un equivalent de n-1 et m-1 est notes.length & notes[i].length
            for (int j=0; j<=m-1;j++){
                System.out.println("Entrer la note de l'étudiant "+(i+1)+" dans la matière "+(j+1));
                titresNotes[i][j] = paramScan.nextInt();

                //System.out.println(titresNotes[i][j]);

            }
        }

        return titresNotes;
    }
}
