package org.example.demos;

public class BouclesImbriquesp71 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++ ){    // i <= n & i < n+1 c'est la même chose
            for (int j = 1; j<=i; j++){
                System.out.print("O"); // ici je ne fais pas print ln, car je veux les O et le X dans la même ligne
            }
            System.out.println("X");
        }
    }
}
