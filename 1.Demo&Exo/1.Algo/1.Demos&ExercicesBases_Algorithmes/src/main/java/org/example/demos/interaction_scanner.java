package org.example.demos;

import java.util.Scanner;

public class interaction_scanner {
    public static void main(String[] args) {
        // affichage
        // les différents print (println, print, printf)

        // snippet (= raccourci) sout
        System.out.println("bonjour");
        System.out.println("à tous");
        System.out.println(); // saut de ligne
        System.out.println("#########");

        /*
        // sout mais je retire les ln à la main
        System.out.print("bonjour");
        System.out.print("à tous");
        //System.out.print(); ici sans le ln ca me fait une erreur
        System.out.print("#########"); // pas de saut de ligne sans le print

        int age = 25;
        double poids = 70;
        String nom = "John Doe";

        System.out.printf("Nom: %s, Age: %d, Poids: %.2f kg", nom, age, poids); // il va remplacer le % par la variable
                                                //s = string, d = décimal ; f = float. le 2 du .2f precise le nombre de decimal que je veux voir afficher
        poids = 70.356;
        System.out.println();
        System.out.printf("Nom: %s, Age: %d, Poids: %.2f kg", nom, age, poids); // ici j'ai un arrondi au-dessus

        // \n pour saut de ligne ; \t pour tabulation
        System.out.println("Bonjour \n à tous");
        System.out.println("Bonjour \t à tous");

        // L'objet Scanner, donner des saisies
       */
        Scanner scanner = new Scanner(System.in); // ici j'utilise un type que java connait pas, il faut rajouter le "import java.util.Scanner" sinon Scanner sera mis en rouge


        System.out.println("Quelle est votre prenom ? ");
        String nomUtilisateur = scanner.nextLine(); // met en chaine de caractère
        System.out.println("Bonjour ");
        System.out.println(nomUtilisateur);
        System.out.println();
        System.out.println("Quelle age avez vous");
        int age = scanner.nextInt();
        System.out.println("Vous avez ");
        System.out.println(age);
        System.out.print(" ans.");
        scanner.close(); // Ferme le scanner. Il est relié au terminal lancé. Si je le ferme pas, meme en fermant l'ide il reste allumé. Reste une bonne pratique de le fermer.

    }
}
