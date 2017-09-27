package com.theironyard;

public class Navy extends Soldier implements Gun, Knife, HandtoHand {

    public Navy(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    @Override
    public String speak() {
        return "Hooyah";
    }

    @Override
    public String shootGun() {
        return "crack crack crack";
    }

    @Override
    public String punchAndKick() {
        return "roundhouse kick TO THE FACE!!";
    }

    @Override
    public String swingKnife() {
        return "stab stab stab";
    }
}
