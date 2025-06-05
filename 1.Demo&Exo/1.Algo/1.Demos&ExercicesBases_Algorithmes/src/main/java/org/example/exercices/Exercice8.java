package org.example.exercices;

import java.util.Scanner;

public class Exercice8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ab, bc, ca;
        System.out.println("entrer la longueur de AB");
        ab = scanner.nextInt();
        System.out.println("entrer la longueur de BC");
        bc = scanner.nextInt();
        System.out.println("entrer la longueur de CA");
        ca = scanner.nextInt();

        if (ab == ca) {
            if (ab == bc) {
                System.out.println("Le triangle est équilatéral");
            } else {
                System.out.println("Le triangle est isocèle en A mais n'est pas équilatéral");
            }
        }else if (ab == bc){
            System.out.println("Le triangle est isocèle en B mais n'est pas équilatéral");
        }else if (bc == ca){
            System.out.println("Le triangle est isocèle en C mais n'est pas équilatéral");
        }else{
            System.out.println(("Le triangle n'est isocèle ni en A, ni en B, ni en C"));

        }

        }
    }
