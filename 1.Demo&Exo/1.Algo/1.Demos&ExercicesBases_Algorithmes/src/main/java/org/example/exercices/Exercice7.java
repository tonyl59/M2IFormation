package org.example.exercices;

import java.util.Scanner;

public class Exercice7 {
    public static void main(String[] args) {
        int age;
        String categorie;
        Scanner scanner = new Scanner(System.in);

        System.out.println("entrer l'âge de l'enfant");
        age =scanner.nextInt();

        if (age<3 || age>17){
            categorie = "Aucune";
        }else if(age<7) {
            categorie = "Baby";
        }else if(age<9){
            categorie = "Poussin";
        }else if(age<11){
            categorie = "Pupille";
        }else if(age<13){
            categorie = "Minime";
        }else{
            categorie = "Cadet";
        }
        if(categorie == "Aucune"){
            System.out.println("L'enfant a moins de 3 ans ou à partir de 18 ans et ne peut pas être associé à une catégorie");
        }else{
            System.out.println("La catégorie de l'enfant pour sa licence sportive est " + categorie);
        }

        // Deuxieme solution
        switch (age){
            case 3,4,5,6:
                categorie = "Baby";

            case 7,8:
                categorie = "Poussin";
                break;
            case 9,10:
                categorie = "Pupille";
                break;
            case 11,12:
                categorie = "Minime";
                break;
            case 13,14,15,16,17:
                categorie = "Cadet";
                break;
            default:
                categorie = "Aucune";
                break;
        }

            if(categorie == "Aucune"){
                System.out.println("L'enfant a moins de 3 ans ou à partir de 18 ans et ne peut pas être associé à une catégorie");
            }else{
                System.out.println("La catégorie de l'enfant pour sa licence sportive est " + categorie);
            }

        /* switch alternatif qui marche à partir de Java 17
                switch (age){
            case 3,4,5,6 -> categorie = "Baby";

            case 7,8 -> categorie = "Poussin";
            case 9,10 ->categorie = "Pupille";
            case 11,12 ->categorie = "Minime";
            case 13,14,15,16,17 -> categorie = "Cadet";
            default -> categorie = "Aucune";

        }

            if(categorie == "Aucune"){
                System.out.println("L'enfant a moins de 3 ans ou à partir de 18 ans et ne peut pas être associé à une catégorie");
            }else{
                System.out.println("La catégorie de l'enfant pour sa licence sportive est " + categorie);
            }
         */

    }


}

