import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class GameScene extends Scene{
    public Camera camera;

    public StaticThing BackGroundLeft;

    public StaticThing BackgroundRight;

    public Integer numberOfLives;


    public GameScene(Pane pane, double width, double height, Camera camera, StaticThing BackGroundLeft, StaticThing BackGroundRight, Integer numberOfLives) {
        super(pane, width, height);
        this.camera = camera;
        this.BackGroundLeft = BackGroundLeft;
        this.BackgroundRight = BackGroundRight;
        this.numberOfLives =  3;

    }
    public Scene render(Pane pane, Camera camera){
        int x = (int) getX();
        int y = (int) getY();
        Scene scene = new Scene(pane, x, y);
        return scene;

    }
}
