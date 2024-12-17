package com.example.patronesDeDiseno.Estructurales.Adapter;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "song.mp3");
        audioPlayer.play("mp4", "movie.mp4");
        audioPlayer.play("vlc", "audio.vlc");
    }
}

//Adapter es un patrón de diseño estructural que permite la colaboración entre objetos
//con interfaces incompatibles.

//Supongamos que tenemos una interfaz MediaPlayer que define el comportamiento para
//reproducir audio y una interfaz AdvancedMediaPlayer que define el comportamiento
//para reproducir formatos de audio más avanzados.
//Ahora, si queremos que nuestra clase AudioPlayer pueda reproducir tanto archivos
//MP3 como archivos MP4, necesitamos un adaptador que permita que AudioPlayer
//utilice AdvancedMediaPlayer.

//En este ejemplo, AudioPlayer puede reproducir archivos MP3 directamente,
//pero necesita un adaptador (Mp4Adapter) para reproducir archivos MP4 utilizando
//la interfaz MediaPlayer. El adaptador permite que AudioPlayer utilice los métodos de
//reproducción de AdvancedMediaPlayer. Cuando se intenta reproducir un archivo MP4,
//AudioPlayer utiliza el adaptador para reproducirlo utilizando Mp4Player.
