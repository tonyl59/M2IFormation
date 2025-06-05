package org.example.demos;

public class FonctionsTonytest {
    public static void main(String[] args) {
        int p = perimetreRectangle(10,15);
        System.out.println("Le perimètre du rectangle est: "+p);

    }
    public static int perimetreRectangle(int largeur, int longueur){
        int perimetre;
        perimetre = 2*(largeur + longueur);
        return perimetre;
    }
}
