package com.javadp.creational;

public class BuilderPatternDemo {
    public static void run() {
        House house = new House.Builder()
                .withWalls(4)
                .withDoors(2)
                .withWindows(6)
                .withGarage(true)
                .build();

        System.out.println("Builder: " + house);
    }
}

class House {
    private final int walls;
    private final int doors;
    private final int windows;
    private final boolean garage;

    private House(Builder builder) {
        this.walls = builder.walls;
        this.doors = builder.doors;
        this.windows = builder.windows;
        this.garage = builder.garage;
    }

    public static class Builder {
        private int walls;
        private int doors;
        private int windows;
        private boolean garage;

        public Builder withWalls(int walls) {
            this.walls = walls;
            return this;
        }

        public Builder withDoors(int doors) {
            this.doors = doors;
            return this;
        }

        public Builder withWindows(int windows) {
            this.windows = windows;
            return this;
        }

        public Builder withGarage(boolean garage) {
            this.garage = garage;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

    @Override
    public String toString() {
        return String.format("House[walls=%d, doors=%d, windows=%d, garage=%b]",
                walls, doors, windows, garage);
    }
}
