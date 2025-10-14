package com.main_integration;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


public class Main {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        String mp3file = "Sample Song/Amazing.mp3";
        Media media = new Media(mp3file);
    }
}
