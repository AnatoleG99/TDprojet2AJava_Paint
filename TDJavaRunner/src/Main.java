import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main extends Application {

        @Override
        public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Hello world");
        Group root = new Group();
        Pane pane = new Pane(root);
        Scene theScene = new GameScene(pane, 800, 400, new Camera(200, 100), new StaticThing("img\\desert", 800, 400), new StaticThing("img\\desert", 800, 400), 3);
        primaryStage.setScene(theScene);
        primaryStage.show();
        }

        public static void main(String[] args) {
        launch(args);
        /*Image BackSheet = new Image("img\\desert.png");
        ImageView Back = new ImageView(BackSheet);
        Image spriteSheet = new Image("img\\heros.png");
        ImageView sprite = new ImageView(spriteSheet);
        sprite.setViewport(new Rectangle2D(20,0,65,100));
        sprite.setX(200);
        sprite.setY(300);*/
        }
}
