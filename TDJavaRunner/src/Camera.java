public class Camera {
    private static Integer x;

    private static Integer y;

    public Camera(int x, int y) {
        this.x = x;

        this.y = y;

    }
    public static Integer getX() {
        return x;
    }

    public static Integer getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Camera{" + "Coord X" + x + '\'' + "Coord Y" + y + '\'' + "}";
    }
}
