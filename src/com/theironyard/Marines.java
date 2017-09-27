package com.theironyard;

public class Marines extends Soldier implements Gun, Knife, HandtoHand, ShootBomb {


    public Marines(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    @Override
    public String speak() {
        return "oohrah";
    }

    @Override
    public String shootGun() {
        return "bang bang";
    }

    @Override
    public String punchAndKick() {
        return "left hook, uppercut";
    }

    @Override
    public String swingKnife() {
        return "swing left";
    }


    @Override
    public String bomb() {
        return "Boom";
    }
}
