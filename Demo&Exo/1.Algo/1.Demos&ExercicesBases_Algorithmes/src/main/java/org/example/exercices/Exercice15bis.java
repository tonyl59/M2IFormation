package org.example.exercices;
//La ville de Tourcoing a un taux d’accroissement de 0.89 %.
//Ecrire un algorithme donnant le nombre d'années nécessaire pour atteindre 120 000 habitants.
//On sait qu’en 2015 la ville de Tourcoing comptait 96 809 habitants.
public class Exercice15bis {
    public static void main(String[] args) {
        double ax = 0.0089, hab = 96809, hab_but = 120000;// ax = acroissement
        int an = 0;
        while (hab<hab_but) {
            an++;
            hab = hab*(1+ax);
            System.out.println("en "+an+" an(s), on atteint "+hab+" habitants");
        }
        System.out.println("Il nous faut donc "+an+" année(s) pour avoir "+hab_but+" habitants");


    }

}

