import javafx.scene.Parent;
import javafx.scene.Scene;


public class GameScene extends Scene {
    private Camera camera;
    private Hero hero;
    private staticThing left;
    private staticThing right;
    private double leftImage;
    private double rightImage;
    private int width;
    private int height;
    private int offsetX;
    private int offsetY;
    private int columns;

    public GameScene(Parent parent, double X, double Y, boolean b, Camera camera, Hero hero) {
        super(parent, X, Y, b);
        this.hero = hero;
        this.camera = camera;
        this.left = new staticThing(0, 0, "desert.png");
        this.right = new staticThing(800, 0, "desert.png");

        //  hero.setSpeedx(10);


    }

    public staticThing getLeft() {
        return left;
    }

    public staticThing getRight() {
        return right;
    }

    public Hero getHero() {
        return hero;
    }

    public void update(double time) {
        double vitesse = 8;
        double Xright = right.getX();
        double Xleft = left.getX();
        if (Xright > 0) {
            right.getImageView().setX(Xright - vitesse);
            right.setX(Xright - vitesse);
            left.getImageView().setX(Xleft - vitesse);
            left.setX(Xleft - vitesse);
        } else {
            right.getImageView().setX(800);
            right.setX(800);
            left.getImageView().setX(0);
            left.setX(0);
//        right.getImageView().setY(-camera.getY());
//        left.getImageView().setY(-camera.getY());
//
//        left.getImageView().setX(-(camera.getX()) % 800);
//        right.getImageView().setX(-(camera.getX()) % 800 + 800);
//
//        hero.getImageView().setX(hero.getX() - camera.getX());
//        hero.getImageView().setY(hero.getY() - camera.getY());
//
//        System.out.println(camera.getX());
//        System.out.println(camera.getY());
//    }
        }
    }
}