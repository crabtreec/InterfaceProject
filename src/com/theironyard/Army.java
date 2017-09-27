package com.theironyard;

public class Army extends Soldier implements Gun, Knife, HandtoHand {

    public Army(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    @Override
    public String speak() {
        return "Hooah";
    }

    @Override
    public String shootGun() {
        return "tha tha tha";
    }

    @Override
    public String punchAndKick() {
        return "right hook, uppercut";
    }

    @Override
    public String swingKnife() {
        return "swing right";
    }
}
