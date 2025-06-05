package org.example.exercices.exo1;

public class pokemon { // code qui decrit à quoi ressemble ma classe. Main class
    private String name;
    private String type1;
    private String type2;
    private String ability;
    /*private int hp;
    private int atk;
    private int def;
    private int sp_atk;
    private int sp_def;
    private int spe; */


    public pokemon(){ // Constructeur
        name = "Gyarados";
        type1 = "Water";
        type2 = "Flying";
        ability = "Intimidate";
        /*hp = 384;
        atk =349;
        def = 259;
        sp_atk = 229;
        sp_def = 289;
        spe = 261;        */
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String pokemon_information(){
        String info;
        if (type2 == null){
            info = String.format("This pokemon is %s, its type is %s and has the ability %s",name,type1,ability);
        }else{info = String.format("This pokemon is %s, its types are %s and %s and has the ability %s",name,type1,type2,ability);

        }
        //System.out.println(info);
        return info;
    }

}

