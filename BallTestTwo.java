package ponglabs;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BallTestTwo extends Canvas implements Runnable {

    private Ball ball;

    public BallTestTwo() {
        setBackground(Color.WHITE);
        setVisible(true);

        //instantiate a new Ball
        //test the Ball thoroughly
        //test all constructors
        ball = new Ball(100, 100, 30, 50, Color.BLUE, 5, 6);
        new Thread(this).start();
    }

    public void update(Graphics window) {
        paint(window);
    }

    public void paint(Graphics window) {
        ball.moveAndDraw(window);

        /*if (!(ball.getxSpeed() >= 10 && ball.getxSpeed() <= 550)) {
            ball.setxSpeed(-ball.getxSpeed());
        }

        if (!(ball.getySpeed() >= 10 && ball.getySpeed() <= 450)) {
            ball.setySpeed(-ball.getySpeed());
        }*/
        if(!(ball.getxPos() >= 10 && ball.getxPos() <= getWidth()-ball.getWidth())){
            ball.setxSpeed(-ball.getxSpeed());
        }
        if(!(ball.getyPos() >= 10 && ball.getyPos() <= getHeight()-ball.getHeight())){
            ball.setySpeed(-ball.getySpeed());
        }
    }

    public void run() {
        try {
            while (true) {
                Thread.currentThread().sleep(19);
                repaint();
            }
        } catch (Exception e) {
        }
    }
}
