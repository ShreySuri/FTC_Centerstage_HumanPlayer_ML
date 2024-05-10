public class Pixel {

    enum PixelColor {
        WHITE,
        PURPLE,
        YELLOW,
        GREEN;
    }

    private final PixelColor color;
    double horizontalVel;
    double verticalVel;

    // todo - add static constants for collisions and such

    public Pixel(PixelColor color) {
        this.color = color;
        horizontalVel = 0;
        verticalVel = 0;
    }

    public PixelColor getColor() {
        return color;
    }

}
