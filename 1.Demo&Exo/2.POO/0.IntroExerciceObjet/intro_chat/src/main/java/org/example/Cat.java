package org.example;

import java.time.LocalDate;

public class Cat {
    private LocalDate birthDate; // ce qui est en violet reste des variables
    private String name;
    Integer age;
    String breed;
// plus necessaire de mettre le this ajd avec les nouvelles versions Java, mais avant on etait obligé
    public Cat(){ // ici Cat est le moule, ici on a mis par defaut des noms.
        this.name = "Mistigri"; // this correspond à l'objet que j'instancie.
        this.breed = "orange";
        this.birthDate = LocalDate.now().minusYears(1);
        this.age = 4;
    }

    // on fait des gets (encapsulation) pour empecher les autres d'acceder et modifier directement l'information/les classes... quand on partage des classes, les autres ont une version compilé du code mais pas direct.
    public String getName(){
        return this.name;
    }

    public Integer getAge(){
        return LocalDate.now().getYear() - birthDate.getYear();
    }

    // Setter... permet de prendre un paramètre et l'assigne ici à la variable name.Le setter va Empecher des valeurs
    public void setName(String newName){
        this.name = newName; // this permet de referer à l'objet actuel (donc ici Cat?)
    }
}
