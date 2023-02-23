import java.awt.*;
import java.util.*;

public class Ball extends Rectangle {
    Random random;
    int xVelocity;
    int yVelocity;
    int initialSpeed = 3;

    Ball(int x, int y, int width, int height) {
        super(x, y, width, height);
        random = new Random();
        int randomXDirectoin = random.nextInt(2);
        if (randomXDirectoin == 0)
            randomXDirectoin--;
        setXDirection(randomXDirectoin * initialSpeed);

        int randomYDirectoin = random.nextInt(2);
        if (randomYDirectoin == 0)
            randomYDirectoin--;
        setYDirection(randomYDirectoin * initialSpeed);


    }

    public void setXDirection(int randomXDirection) {
        xVelocity = randomXDirection;

    }

    public void setYDirection(int randomYDirection) {
        yVelocity = randomYDirection;

    }

    public void move() {
        x += xVelocity;
        y += yVelocity;

    }

    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.fillOval(x, y, height, width);

    }

}
