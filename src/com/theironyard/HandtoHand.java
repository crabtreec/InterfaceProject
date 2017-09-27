package com.theironyard;

public interface HandtoHand {
    public String punchAndKick();

    default public String CoC() {
        return "CoC";
    }

}
