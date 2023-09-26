package com.brutech;

public class Lamp {
private int globRating;
private boolean battery;

private LampStyle style;

    public Lamp(int globRating, boolean battery, LampStyle style) {
        this.globRating = globRating;
        this.battery = battery;
        this.style = style;
    }

    public void turnOn(){
        System.out.println("Lamp is being turned on.");
    }

    public LampStyle getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }
}
