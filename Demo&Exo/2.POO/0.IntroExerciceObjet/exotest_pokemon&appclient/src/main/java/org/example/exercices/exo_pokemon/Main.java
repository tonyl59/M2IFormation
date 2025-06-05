package org.example.exercices.exo1;


public class Main {
    public static void main(String[] args) {
        pokemon pokemon1 = new pokemon();
        pokemon pokemon2 = new pokemon();
        pokemon1.setName("Pikachu");
        pokemon1.setType1("Electric");
        pokemon1.setType2(null);
        pokemon1.setAbility("Lightning Rod");

        String p1_info = pokemon1.pokemon_information();
        String p2_info = pokemon2.pokemon_information();
        System.out.println(p1_info + " \n"+p2_info);

    }
}
