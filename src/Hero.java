import javafx.scene.Parent;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Hero extends AnimatedThing {
    private double Y_hero;
    private double yGround;

//    private double fy;
//    private Duration duration ;
//    private double vx;
//    private double fx;
//    private double invincibility;
//    private double vy;
//    private Attitude attitude;
//    private double ay;
//    private final double G=0.2;
//    private double m=70;
//    private double ax;
//    private double X_hero;


    public Hero(double x, double y) {
        super(6, Duration.millis(10), 82, 105, 10, 0, x, y);


    }

    public void jump () {
        jump = true;
    }
//    public void jump() {
//        if (Y_hero >= yGround + 100) {
//            fy += 125;
//        }
//    }
//
//    public void setFrameChange(boolean a) {
//        if (a == true) {
//            duration = Duration.millis(100 + vx);
//        } else if (a == false) {
//            if (vx > 90) {
//                vx = 10;
//            }
//            duration = Duration.millis(100 - vx);
//        }
//        setFrameChange(duration);
//    }
//
//    public void speed_var(double var) {
//        vx += var;
//    }
//
//    public void forcex_var(double f_var) {
//        fx += f_var;
//        if (vx < -1) {
//            vx = -1;
//        }
//    }
//
//    public void setForces(double Fx, double Fy) {
//        fx = Fx;
//        fy = Fy;
//    }
//
//    public void setSpeedx(double vx) {
//        this.vx = vx;
//    }
//
//    public double isInvincible(boolean s) {
//        if (s == true) {
//            this.invincibility = Duration.millis(2500).toSeconds();
//        } else if (s == false) {
//            invincibility = 0;
//        }
//        return invincibility;
//    }
//
//    @Override
//    public void updateAttitude() {
//        if (vy >= 0.1) {
//            attitude = Attitude.jumping_down;
//        } else if (vy <= -0.1) {
//            attitude = Attitude.jumping_up;
//        } else {
//            attitude = Attitude.running;
//        }
//        if (vx == 0) {
//            attitude = Attitude.still;
//        }
//    }
//
//  @Override
//   public void update(double time) {
//        super.update(time);
////        updateAttitude();
//        ay = G - fy / m;
//        vy += ay;
//        Y_hero += vy;
//        if (Y_hero > yGround + 100) {
//            if (vy > 0) {
//                vy = 0;
//            }
//            Y_hero = yGround + 100;
//        }
//        ax = fx / m;
//        vx += ax;
//        if (vx > 30) {
//            vx = 30;
//        }
//        if (vx < 5) {
//            vx = 5;
//        }
//        X_hero += vx;
//
//        setForces(0, 0);
//    }
//
  }




