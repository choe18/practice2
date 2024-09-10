package com.study.sep10;

public class RemoteControl {

    private final Tv tv = new Tv();

    public void turnOn() {
        tv.turnOn();
    }

    public void volumeUp() {
        tv.volumeUp();
    }

    public void mute() {
        tv.mute();
    }

    public void turnOff() {
        tv.turnOff();
    }
}
