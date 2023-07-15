package com.assignments.a7.a7_3;

public class Main {
    // Method with Sound Interface argument
    public static void soundAction(Sound sound) {
        sound.playSound();
        sound.stopSound();
    }

    // Method with Volume Interface argument
    public static void volumeAction(Volume volume) {
        volume.increaseVolume();
        volume.decreaseVolume();
    }

    // Method with Playback Interface argument
    public static void playbackAction(Playback playback) {
        playback.play();
        playback.pause();
    }

    // Method with MediaControl Interface argument
    public static void mediaControlAction(MediaControl mediaControl) {
        mediaControl.playSound();
        mediaControl.stopSound();
        mediaControl.increaseVolume();
        mediaControl.decreaseVolume();
        mediaControl.play();
        mediaControl.pause();
        mediaControl.forward();
    }

    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();

        soundAction(mediaPlayer);
        volumeAction(mediaPlayer);
        playbackAction(mediaPlayer);
        mediaControlAction(mediaPlayer);
    }
}
