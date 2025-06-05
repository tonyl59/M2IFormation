package org.example.demos;

public class Operateurs {
    public static void main(String[] args) {

        // concatenation
        String string1 = "hello";
        String string2 = "world";
        String message = string1+" "+string2;
        System.out.println(message);
        // région opérateurs arithmétiques
        int result = 1 + 2;
        System.out.println("the result of 1 + 2 is :"+result);
        int originalResult = result;
        result = result-1;
        System.out.println("the result of 3 - 1 is "+ originalResult+"-1="+result); // 3 - 1 = 2
        originalResult = result;

        result = result * 2;
        System.out.println(originalResult+" *2 = "+result); // 2 * 2 = 4
        originalResult = result;

        result = result / 2;
        System.out.println("the result of " + originalResult + "/2 is "+result); // 4/2 = 2
        originalResult = result;

        result = result + 8;
        originalResult = result;
        result = result % 7;
        System.out.println(originalResult+ " modulo 7 = "+result); // 10 modulo 7 = 3

        // opérateur unaires
        int nombre = +1;
        System.out.println(nombre); // Ca fait 1, je commence à 0 de base. Bizarrement ca marche pas si je met juste int nombre, c'est comme si on avait rien (même pas de zéro)

        // opérateur de décrémentation
        nombre--;
        System.out.println(nombre);

        // opérateur d'incrémentation
        nombre++;
        System.out.println(nombre);

        // écriture raccourci
        nombre += 10; // nombre= nombre+ 10 et nombre+=10 c'est la même chose.
        System.out.println(nombre);

        nombre -= 10; // nombre = nombre - 10;
        System.out.println(nombre);

        // Opérateur not
        boolean succes = false;
        System.out.println(succes);
        System.out.println(!succes);

        // Opérateur d'égalité relationnels
        int value1 = 1;
        int value2 = 2;
        boolean resultat;
        resultat = value1 == value2; // Bien évidemment, ca sera false car 1 n'est pas égal à 2
        System.out.println(resultat);

        resultat = value1 != value2; // ici ca sera vrai car les deux valeurs sont bien différentes
        System.out.println(resultat);

        resultat = value1 > value2; // false
        System.out.println(resultat);

        // ET je vérifie si 2 conditions ou plus sont vraies
        resultat = value1 == 1 && value2 ==2; // vraies, ici le "et" sur Java est "&&", alors qu'en python c'est "and"
        // resultat = (value1 ==1) && (value2==2); // même résultat qu'au dessus, mais cette écriture permet d'être plus visible
        System.out.println(resultat);

        resultat = value1 == 1 && value2 ==22;
        System.out.println(resultat); // ici faux parce que pour avoir vrai il fallait que les DEUX soient vraies

        // OU : l'une ou l'autre des conditions
        resultat = (value1 == 1) || (value2 == 22); // ici vrai car il faut au moins qu'UNE des deux soient vraies
        System.out.println(resultat);
    }
}
