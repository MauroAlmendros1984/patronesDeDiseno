package com.example.patronesDeDiseno.Estructurales.Adapter;

public class AudioPlayer implements MediaPlayer {
    Mp4Adapter mp4Adapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            // Reproducir archivos MP3 de manera estándar
            System.out.println("Playing MP3 file: " + fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            // Utilizar el adaptador para reproducir archivos MP4
            mp4Adapter = new Mp4Adapter(new Mp4Player());
            mp4Adapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
