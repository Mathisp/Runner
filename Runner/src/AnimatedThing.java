import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public abstract class AnimatedThing {


    private static double Y;
    private static double X;


    enum Attitude {running, jumping_up, jumping_down, still, attack}

    ;
    private double index;
    private double duration;
    private int width;
    private int height;
    private int offsetX;
    private int offsetY;
    private Attitude attitude;
    private int columns;
    private int b = 1;
    private int etat;
    private int position = 10;
    private int position1 = 0;
    private int position2 = 0;
    public int jumpIndex=0;


    protected boolean jump;
    protected ImageView imageView;

    public AnimatedThing(double index, Duration duration, int width, int height, int offsetX, int offsetY, double X, double Y) {
        this.index = index;
        this.duration = duration.toSeconds();
        this.width = width;
        this.height = height;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.Y = Y;
        this.X = X;
        Image image = new Image("heros.png");
        this.imageView = new ImageView(image);

        imageView.setX(X);
        imageView.setY(Y);

    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setFrameChange(Duration duration) {
        this.duration = duration.toSeconds();
    }

    //public abstract void updateAttitude();

    public void update(double time) {
        final int indexmax = (int) ((time % (index)));

        System.out.println(indexmax%index);
        if (jump == false) {

            this.imageView.setViewport(new Rectangle2D((indexmax % index) * width + offsetX, 0, width, height));
        }
        else {
            if (imageView.getY() < 20) {position=-10;jumpIndex=1;}
            if (position==-10&imageView.getY() > 250) {
                position=10;
                jump=false;
                jumpIndex=0;}
                this.imageView.setViewport(new Rectangle2D(jumpIndex*width, 160, width, height));
                imageView.setY(imageView.getY() - position);


            }
        }/*else  {

            position1 = (int) imageView.getY();
            imageView.setY(imageView.getY() + position);
            position2 = (int) imageView.getY();


            jump = false;
            if (imageView.getY() > 240) {
                imageView.setY(240);
            }
        }*/

//        if (position1 - position2 == -5) {
//            index = 1;
//            this.imageView.setViewport(new Rectangle2D((indexmax % index) , 160, width, height));
//        }
//        if(attitude==Attitude.running) {
//            this.imageView.setViewport(new Rectangle2D((index % columns) * width + offsetX, offsetY, width, height));
//        }
//        else if(attitude==Attitude.jumping_up){
//            this.imageView.setViewport(new Rectangle2D(offsetX,offsetY+160,width,height));
//        }
//        else if(attitude==Attitude.jumping_down){
//            this.imageView.setViewport(new Rectangle2D(offsetX+width,offsetY+160, width, height));
//        }
//
//    }


//    public double getX() {
//        return X;
//    }

    public static double getY() {
        return Y;
    }

}