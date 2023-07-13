package com.assignments.a7.a7_3;

// Implementation of Combined Interface and Inheritance from Concrete Class
class MediaPlayer extends MediaDevice implements MediaControl {
    @Override
    public void playSound() {
        System.out.println("Playing sound.");
    }

    @Override
    public void stopSound() {
        System.out.println("Stopping sound.");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Increasing volume.");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Decreasing volume.");
    }

    @Override
    public void play() {
        System.out.println("Playing media.");
    }

    @Override
    public void pause() {
        System.out.println("Pausing media.");
    }

    @Override
    public void forward() {
        System.out.println("Forwarding media.");
    }
}

