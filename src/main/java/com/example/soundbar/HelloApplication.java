package com.example.soundbar;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URISyntaxException;

public class HelloApplication extends Application {
    public static AudioPlayer Play;
    public static SoundBar bar;
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 540);
        stage.setTitle("SoundBar");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws URISyntaxException {
        System.out.println("Starte Soundbar ?");
        bar = new SoundBar();
        HelloController.setBar(bar);


        //Play = new AudioPlayer();
        launch();
    }

    public static AudioPlayer getPlay() {
        return Play;
    }
}