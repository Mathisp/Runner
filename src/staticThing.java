import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class staticThing {
     double X;
     double Y;
     private ImageView imageView;
     Camera camera;


    public staticThing(double X, double Y, String fileName) {

        this.X = X;
        this.Y = Y;
        Image image = new Image(fileName);
        this.imageView = new ImageView(image);
        imageView.setX(X);
        imageView.setY(Y);

        }

    public double getY() {
        return Y;
    }

    public double getX() {
        return X;
    }

    public void setX(double x) {
        X = x;
    }

    public ImageView getImageView() {
        return imageView;
    }
}



