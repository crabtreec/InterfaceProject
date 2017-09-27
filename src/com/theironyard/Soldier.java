package com.theironyard;


public abstract class Soldier {

    String name;
    String rank;
    int serialNumber;

    //==================================================//



    public Soldier(String name, String rank, int serialNumber) {
        this.name = name;
        this.rank = rank;
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }


    public String getRank() {
        return rank;
    }


    public int getSerialNumber() {
        return serialNumber;
    }



    //====================================================//

    public String sleep() {
        return "snore";
    }

    public String eat() {
        return "chew";
    }

    public String walk() {
        return "trudge";
    }

    public abstract String speak();


}
