package org.example;

import java.util.Scanner;

public class Exercice56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir une chaîne");
        String typestring = scanner.nextLine();
        String stringlow = typestring.toLowerCase();
        String stringup = typestring.toUpperCase();

        System.out.println("En minuscule : "+stringlow);
        System.out.println("En majuscule : "+stringup);



        char[] stringtable = new char[typestring.length()];
        for (int i = 0; i<typestring.length(); i++){
            stringtable[i] = Character.toLowerCase(typestring.charAt(i));
        }

        System.out.print("En tableau : ");
        System.out.println(stringtable);


        System.out.println();


        String stringupfirst = "";
        int next_up = 1;
        for (int i = 0; i<typestring.length(); i++){
            if (Character.isLetter(typestring.charAt(i))){
                if (next_up == 1){
                    stringupfirst += Character.toUpperCase(typestring.charAt(i));
                    next_up = 0;
                }else{
                    stringupfirst += Character.toLowerCase(typestring.charAt(i));
                    }
            }else{
                next_up = 1;
                stringupfirst += Character.toLowerCase(typestring.charAt(i));
            }

        }

        System.out.println("Premiere lettre en majuscule : "+stringupfirst);


    }
}
