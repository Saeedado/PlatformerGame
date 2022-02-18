import java.awt.*;

public class Player {

    GamePanel panel;

    int x, y, width, height;
    double xspeed, yspeed;
    Rectangle hitBox;
    boolean keyLeft, keyRight, keyUp, keyDown;

    Player(int x, int y, GamePanel panel){
        this.x = x;
        this.y = y;
        hitBox = new Rectangle(x,y,width,height);
    }
    
    public void set(){
        x += xspeed;
        y += yspeed;
        hitBox.x = x;
        hitBox.y =y;
    }

    public void draw(Graphics2D gtd){

        gtd.setColor(Color.BLACK);
        gtd.fillRect(x, y, width, height);
    }
}
