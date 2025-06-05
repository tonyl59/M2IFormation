package org.example.demos;

public class Variables {
    public static void main(String[] args) {
        // ceci est un commentaire
        // Je continue mon commentaire

        /*
        Permet de faire du commentaire sur plusieurs ligne
        sans devoir faire le double slash
        à chaque fois
        */

        // déclaration d'une variable
        // syntaxe
        // type nom; (on doit terminer toute syntaxe Java par ';')

        // Type numérique
        // int = integer, nombre entier donc pas de virgule, sur 32 bits. Je peux donner directement une valeur à une affectation comme int age = 2
        int age;

        // long entier sur 64 bits, le long sera moins utilisé ceci dit
        long indice;

        // nombre à virgule. Ici le double est plus grand que le float en terme de nombre d'espace.
        float distance;
        double monnaie;

        //Type bool, par défaut un boolean est False.
        boolean estMajeur;

        // type chaine et caractere
        char lettre;

        // chaine de caractere
        String prenom;

        // type qui commence par une minuscule = type primitif
        // type qui commence par une majuscule = objet

        // affectation. Ici age est considéré comme int, je ne peux pas y affecter un string ou un float.
         // Java va mettre double par defaut si j essaye d affecter un float en faisant age = 18.3
         // Si je vois que ce soit en type float, je ferais age = 18.3f
        age = 18;
        indice = 100_000_000; // Ici la barre va permettre juste de me donner l'indicatif visuel que c'est bien 100 millions même si c'est un entier
        distance = 13.4f;
        monnaie = 15.3; // Peut être oublier de creer des floats, les doubles c'est moins embetant car j'ai pas à mettre un f après à chaque fois
        estMajeur = true; // on écrit false ou true.
        lettre = 'a'; // mono guillemet pour un caractère, double guillemet pour une chaine
        prenom = "toto";

        // Là je me suis cassé la tête à faire plein de lignes, on peut faire plus compact en declarant et initialisant la variable en même temps
        int jour = 5;
        System.out.println(age);
        System.out.println(indice);
        System.out.println(jour);
        System.out.println(prenom);
        }
    }

