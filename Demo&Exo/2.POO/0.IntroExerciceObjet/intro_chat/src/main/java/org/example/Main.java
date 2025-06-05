package org.example;

public class Main {
    public static void main(String[] args) {
        Cat catA = new Cat(); // ici je crée (new) un objet catA basé sur le moule Cat, prend la case x (par exemple 027)en mémoire et contient une adresse y
        Cat catB = new Cat(); // on lui dit qu'il contient la case x (par exemple 027)
        Cat catB2 = new Cat();
        Cat catC = catA; // ici on met l'etiquette de catA à catB (tiroir A à tiroir B... pour l'ordi c'est adresse memoire XX et adresse memoire XY)

        System.out.println(catA.getName()); // J'ai le nom du chat par defaut que j'ai mis dans Cat

        catB.setName("Berlioz"); // catB.name = "Berlioz" ne fonctionne pas car j'ai mis name en private... il faut utiliser set à la place
        catB2.setName("Berlioz2");

        System.out.println(catB.getName());// On crée un nouveau chat. catB.name fonctionne pas car name est private donc faut faire getName
        System.out.println(catB2.getName());
        System.out.println("cat C is "+catC); // ici on a juste un "org.example.Cat@9807454"... plutot que dire catC à cause du fonctionnement objet. le chiffre après @ est le hash, soit l'adresse


        
        System.out.println(catA); // on a pas encore crée dans notre classe une façon d'avoir les infos de CatA.
    }
}