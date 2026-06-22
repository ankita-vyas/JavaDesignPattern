package com.javadp.structural;

public class FacadePatternDemo {
    public static void run() {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(
                new Amplifier(), new DvdPlayer(), new Projector());

        homeTheater.watchMovie("Design Patterns Movie");
        homeTheater.endMovie();
    }
}

class Amplifier {
    void on() {
        System.out.println("Amplifier on");
    }
    void off() {
        System.out.println("Amplifier off");
    }
}

class DvdPlayer {
    void on() {
        System.out.println("DVD player on");
    }
    void off() {
        System.out.println("DVD player off");
    }
    void play(String movie) {
        System.out.println("Playing movie: " + movie);
    }
}

class Projector {
    void on() {
        System.out.println("Projector on");
    }
    void off() {
        System.out.println("Projector off");
    }
}

class HomeTheaterFacade {
    private final Amplifier amp;
    private final DvdPlayer dvd;
    private final Projector projector;

    public HomeTheaterFacade(Amplifier amp, DvdPlayer dvd, Projector projector) {
        this.amp = amp;
        this.dvd = dvd;
        this.projector = projector;
    }

    public void watchMovie(String movie) {
        amp.on();
        projector.on();
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        dvd.off();
        projector.off();
        amp.off();
    }
}
