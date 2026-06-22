package com.javadp.structural;

public class AdapterPatternDemo {
    public static void run() {
        LegacyRectangle legacyRectangle = new LegacyRectangle();
        Shape adaptedRectangle = new RectangleAdapter(legacyRectangle);

        System.out.println("Adapter: " + adaptedRectangle.draw());
    }
}

interface Shape {
    String draw();
}

class LegacyRectangle {
    public String drawRectangle() {
        return "Drawing rectangle with legacy API";
    }
}

class RectangleAdapter implements Shape {
    private final LegacyRectangle legacyRectangle;

    public RectangleAdapter(LegacyRectangle legacyRectangle) {
        this.legacyRectangle = legacyRectangle;
    }

    @Override
    public String draw() {
        return legacyRectangle.drawRectangle();
    }
}
