package org.example.exercices;
//Ecrire un algorithme qui déclare et stocke dans un tableau 10 chiffres, puis qui affiche le 9éme
//élément de ma liste.
public class Exercice19 {
    public static void main(String[] args) {
        int[] a = tablo();
        System.out.println("le 9eme chiffre du tableau est "+a[8]);

        int[] b = tablo_random();
        System.out.println("le 9eme chiffre du tableau aléatoire est "+b[8]);


    }

    public static int[] tablo() {
        int[] ten_nb = new int[10];
        ten_nb[0] = 10;
        ten_nb[1] = 15;
        ten_nb[2] = 8;
        ten_nb[3] = 9;
        ten_nb[4] = 12;
        ten_nb[5] = 17;
        ten_nb[6] = 13;
        ten_nb[7] = 2;
        ten_nb[8] = 28;
        ten_nb[9] = 6;

        return ten_nb;
    }
    public static int[] tablo_random() {
        int[] ten_nb = new int[10];
        for (int i = 0; i < ten_nb.length;i++){
            ten_nb[i] = (int) (Math.random()*100); // je veux générer un nb aléatoire avec math.random, mais math.random fait un nombre en 0 à 0,99999...
            // je vais le multiplier par 100 pour aller jusque 99, mais j'aurais plein de decimal. La parenthese permet de transformer le double en int (=parsing)
            System.out.print(ten_nb[i]+" ");
        }

        return ten_nb;
    }
}




