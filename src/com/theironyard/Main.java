package com.theironyard;

public class Main {

    public static void main(String[] args) {

        Army Goose = new Army("Goose", "Sergeant", 575664656);
        Navy Iceman = new Navy("Iceman", "Captain",88928399);
        Marines Maverick = new Marines("Maverick", "Private", 356860950);

        System.out.println("Goose's name is: " + Goose.getName());
        System.out.println("Goose's rank is: " + Goose.getRank());
        System.out.println("Goose's serialNumber is: " + Goose.getSerialNumber());

        System.out.println("Army shoots gun: " + Goose.shootGun());
        System.out.println("Army swings knife: " + Goose.swingKnife());
        System.out.println("Army does hand to hand: " + Goose.punchAndKick());


        System.out.println("<------------------------------------------->");


        System.out.println("Iceman's name is: " + Iceman.getName());
        System.out.println("Iceman's rank is: " + Iceman.getRank());
        System.out.println("Iceman's serialNumber is: " + Iceman.getSerialNumber());

        System.out.println("Navy shoots gun: " + Iceman.shootGun());
        System.out.println("Navy swings knife: " + Iceman.swingKnife());
        System.out.println("Navy does hand to hand: " + Iceman.punchAndKick());


        System.out.println("<------------------------------------------->");



        System.out.println("Maverick's name is: " + Maverick.getName());
        System.out.println("Maverick's rank is: " + Maverick.getRank());
        System.out.println("Maverick's serialNumber is: " + Maverick.getSerialNumber());

        System.out.println("Marines shoots gun: " + Maverick.shootGun());
        System.out.println("Marines swings knife: " + Maverick.swingKnife());
        System.out.println("Marines does hand to hand: " + Maverick.punchAndKick());

        System.out.println("<-------------------------------------------->");

        // calling bomb method from shootBomb interface that extends Gun interface....

        System.out.println("Marines shoots bomb: " + Maverick.bomb());


        System.out.println("<--------------------------------------------->");

        // Default Method in HandtoHand interface

        System.out.println("Army uses " + Goose.CoC() + " for hand to hand combat");





    }
}
