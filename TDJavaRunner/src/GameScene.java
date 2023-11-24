import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class GameScene extends Scene{
    public Camera camera;

    public StaticThing BackGroundLeft;

    public StaticThing BackgroundRight;


    public GameScene(Pane pane, double width, double height, Camera camera, StaticThing BackGroundLeft, StaticThing BackGroundRight) {
        super(pane, width, height);
        this.camera = camera;


    }
    //public GameScene render(){

    //}
}
