package com.example.patronesDeDiseno.Estructurales.Facade;

public class CinemaFacade {
    private Lights lights;
    private SoundSystem soundSystem;
    private Projector projector;

    public CinemaFacade() {
        this.lights = new Lights();
        this.soundSystem = new SoundSystem();
        this.projector = new Projector();
    }

    // Método para empezar la proyección
    public void startMovie() {
        lights.turnOff();
        soundSystem.turnOn();
        projector.turnOn();
        projector.play();
    }

    // Método para detener la proyección y apagar todo
    public void endMovie() {
        projector.stop();
        projector.turnOff();
        soundSystem.turnOff();
        lights.turnOn();
    }
}
