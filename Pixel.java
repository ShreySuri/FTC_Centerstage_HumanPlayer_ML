public enum Pixel {
    NONE,
    WHITE,
    PURPLE,
    YELLOW,
    GREEN;

    @Override
    public String toString() {
        switch (this) {
            case NONE: {
                return "X"; // fixme
            }
            case WHITE: {
                return "W";
            }
            case PURPLE: {
                return "P";
            }
            case YELLOW: {
                return "Y";
            }
            case GREEN: {
                return "G";
            }
            default: {
                return "null";
            }
        }
    }
}
