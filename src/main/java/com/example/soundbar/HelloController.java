package com.example.soundbar;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
    private AudioPlayer Play;

    public static SoundBar getBar() {
        return bar;
    }

    public static void setBar(SoundBar bar) {
        HelloController.bar = bar;
    }

    private static SoundBar bar;
    @FXML


    public void onExitButtonClick(ActionEvent event) {
        System.exit(0);
    }

    public void onSound1ButtonClick(ActionEvent event) {

        bar.PlayA();

    }

    public void onSound2ButtonClick(ActionEvent event) {

        bar.PlayB();
    }
    public void onSound3ButtonClick(ActionEvent event) {
        bar.PlayC();
    }
    public void onSound4ButtonClick(ActionEvent event) {
        bar.PlayD();
    }
    public void onSound5ButtonClick(ActionEvent event) {
        bar.PlayE();
    }



}