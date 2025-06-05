package org.example.demos;

public class DemoString {
    public static void main(String[] args) {
        String phrase = "Ceci est une chaine de caractères, elle est de type  String";

        var phrase2 = "Ceci est une chaine de caractères, elle est de type String... en mettant var en type";

        System.out.println(phrase);
        System.out.println(phrase2);

        char lettre = phrase.charAt(6);
        System.out.println(lettre);
        System.out.println(phrase.length());
        System.out.println("toto".length());


        // == fonctionne même si on utilise un objet car les dernières versions Java le permet. Mais par habitude on doit toujours faire .equals par bonne pratique. Les règles de == sur python sont moins embetants pour les string.
        String test = "bonjour";
        if (test == "bonjour"){
            System.out.println("bonjour");
        }
        int nb = 10;
        System.out.println(nb++);
    }
}
