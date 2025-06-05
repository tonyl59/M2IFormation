package org.example.demos;

public class TableauxTwo {
    public static void main(String[] args) {
        // String[][] prenoms = new String[3][2];
        String[][] titresNoms = {
                {"Mr", "Mme", "Mlle"},
                {"Dupont","Legrand","Martin"}

                // Tableau Alternatif
                //{"Mr,"Mme","Mlle"
                //...
                //...
        };
        System.out.println(titresNoms.length);
        System.out.println(titresNoms[0].length);
        // System.out.println(titresNoms[5].length);

        System.out.println(titresNoms[0][1]+" "+titresNoms[1][1]); // Mme Legrand
        System.out.println(titresNoms[1][1]+" "+titresNoms[1][2]); // Legrand Martin
        System.out.println(titresNoms[0][2]+" "+titresNoms[1][0]); // Mlle Dupont

    }
}
