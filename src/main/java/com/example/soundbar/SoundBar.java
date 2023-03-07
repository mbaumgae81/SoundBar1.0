package com.example.soundbar;

import java.net.URISyntaxException;

public class SoundBar {

    String AudioA;
    String AudioB;
    String AudioC;
    String AudioD;
    String AudioE;
    AudioPlayer SoundEins;
    SoundBar() throws URISyntaxException {
        System.out.println("Create Soundbar");
        SoundEins = new AudioPlayer();
        AudioA = "angestartet.wav";
        AudioB = "jagut.wav";
        AudioC = "geschischte.wav";
        AudioD = "llup.wav";
        AudioE = "nasenschnauf.wav";

    }

    public void PlayA(){
        System.out.println("PlayA");
        SoundEins.play(AudioA);
    }
    public void PlayB(){
        System.out.println("PlayB");
        SoundEins.play(AudioB);
    }
    public void PlayC(){
        System.out.println("PlayC");
        SoundEins.play(AudioC);
    }
    public void PlayD(){
        System.out.println("PlayD");
        SoundEins.play(AudioD);
    }
    public void PlayE(){
        System.out.println("PlayE");
        SoundEins.play(AudioE);
    }

    public AudioPlayer getSoundEins() {
        return SoundEins;
    }

    public void setSoundEins(AudioPlayer soundEins) {
        SoundEins = soundEins;
    }
}
