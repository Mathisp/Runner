// Mathis Permanne  26 nov 23h59

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.Mnemonic;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        primaryStage.setTitle("Run forest run !");
        Group root = new Group();
        Pane pane = new Pane(root);
        Camera camera = new Camera(0,0);

        Hero hero = new Hero(220,250);


        GameScene theScene = new GameScene(pane, 800, 400,true,camera,hero);
        theScene.setOnMouseClicked((event)-> {
         hero.jump();
        });
        final long startTime = System.nanoTime();
        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long time) {
                double Temps = (time-startTime)/100000000;
                hero.update(Temps);
             //   camera.update(Temps,hero);
                theScene.update(Temps);
        hero.getImageView().setX(10);
            }
        };timer.start();

        pane.getChildren().addAll(theScene.getLeft().getImageView(),
                                  theScene.getRight().getImageView(),
                                  theScene.getHero().getImageView());
        primaryStage.setScene(theScene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
        }
}

















