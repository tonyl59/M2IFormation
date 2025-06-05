package org.example.demos;

import java.util.Scanner;

public class Bouclesp66 {
    public static void main(String[] args) {
        //Boucle for p66
        Scanner scanner = new Scanner(System.in);
        double x, puiss=1;
        int n;
        System.out.println("Entrez la valeur de x");
        x = scanner.nextDouble();
        System.out.println("Entrez la valeur de n");
        n = scanner.nextInt();

        for (int i = 1; i <= n; i++ ){    // i <= n & i < n+1 c'est la même chose
            puiss = puiss*x;
        }
        System.out.println(x+ " à la puissance" +n+ "est égal à "+puiss);


    }
}
