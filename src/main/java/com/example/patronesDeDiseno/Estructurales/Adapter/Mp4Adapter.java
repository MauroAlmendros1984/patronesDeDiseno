package com.example.patronesDeDiseno.Estructurales.Adapter;

public class Mp4Adapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;

    public Mp4Adapter(AdvancedMediaPlayer advancedMusicPlayer) {
        this.advancedMusicPlayer = advancedMusicPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer.playMp4(fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
