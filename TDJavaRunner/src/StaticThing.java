import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class StaticThing {
    private static double sizeX;

    private static double sizeY;

    public ImageView imageView;

    public StaticThing(String fileName, double sizeX, double sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        Image image = new Image(fileName);
        this.imageView = new ImageView(image);

    }

    public ImageView getImageView() {
        return imageView;
    }
}
