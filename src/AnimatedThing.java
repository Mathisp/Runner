import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public abstract class AnimatedThing {


    private static double Y;
    private static double X;


      enum Attitude{running, jumping_up,jumping_down,still,attack};
    private double index ;
    private double duration ;
    private int width ;
    private int height ;
    private int offsetX ;
    private int offsetY ;
    private Attitude attitude;
    private int columns;
    private int b=1;
    private int etat;


    protected boolean jump;
    protected ImageView imageView;

    public AnimatedThing(double index, Duration duration, int width, int height, int offsetX, int offsetY, double X, double Y){
        this.index=index;
        this.duration=duration.toSeconds();
        this.width=width;
        this.height=height;
        this.offsetX=offsetX;
        this.offsetY=offsetY;
        this.Y=Y;
        this.X=X;
        Image image = new Image("heros.png");
        this.imageView = new ImageView(image);

        imageView.setX(X);
        imageView.setY(Y);

    }

    public ImageView getImageView() {
        return imageView;
    }

    public void setFrameChange(Duration duration){
        this.duration = duration.toSeconds();
    }

    //public abstract void updateAttitude();

    public void update(double time) {
        final int indexmax = (int) ((time % (index)));

        this.imageView.setViewport(new Rectangle2D((indexmax % index) * width + offsetX, 0, width, height));

        if (jump==true&&imageView.getY()>20){
            imageView.setY(imageView.getY()-10);

            System.out.println(imageView.getY());
        }
        else {
            imageView.setY(imageView.getY()+10);
            jump=false;
            if (imageView.getY()>240){
                imageView.setY(240);

            }
        }
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
    }
    public static double getY() {
        return Y;
    }

    }