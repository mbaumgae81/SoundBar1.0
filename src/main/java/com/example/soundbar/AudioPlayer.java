package com.example.soundbar;

import javax.print.attribute.standard.Media;
import javax.sound.sampled.*;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;

public class AudioPlayer implements LineListener {


    // size of the byte buffer used to read/write the audio stream
    private static final int BUFFER_SIZE = 4096;



    /**
     * Play a given audio file.
     *
     * @param audioFilePath Path of the audio file.
     */
    void play(String audioFilePath) {

       // System.out.printf(new Media(HelloApplication.class.getResource("/resources/test.wav").toURI().toString()));
        InputStream inputstream = HelloApplication.class.getResourceAsStream(audioFilePath);
        //InputStream defaultSound = AudioPlayer.class.getResourceAsStream("/resources/com.example.soundbar/jagut.wav");

        System.out.println(inputstream);
        //InputStream defaultSound = AudioPlayer.class.getResourceAsStream(audioFilePath);
        // File audioFile = new File(audioFilePath);
        try {
            //AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File(audioFilePath));
           // AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File(audioFilePath));
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(new BufferedInputStream(inputstream));

            AudioFormat format = audioStream.getFormat();

            DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);

            SourceDataLine audioLine = (SourceDataLine) AudioSystem.getLine(info);

            audioLine.open(format);

            audioLine.start();

            System.out.println("Playback started.");

            byte[] bytesBuffer = new byte[BUFFER_SIZE];
            int bytesRead = -1;

            while ((bytesRead = audioStream.read(bytesBuffer)) != -1) {
                audioLine.write(bytesBuffer, 0, bytesRead);
            }

            audioLine.drain();
            audioLine.close();
            audioStream.close();

            System.out.println("Playback completed.");

        } catch (UnsupportedAudioFileException ex) {
            System.out.println("The specified audio file is not supported.");
            ex.printStackTrace();
        } catch (LineUnavailableException ex) {
            System.out.println("Audio line for playing back is unavailable.");
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Error playing the audio file.");
            ex.printStackTrace();
        }
    }

    @Override
    public void update(LineEvent event) {

    }
}
