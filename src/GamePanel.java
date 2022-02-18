import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;

public class GamePanel extends javax.swing.JPanel implements ActionListener {

    Player player;

    Timer gameTimer;
    public GamePanel()
    {
        gameTimer = new Timer();
        gameTimer.schedule(new TimerTask() {
            @Override
            public void run() {

            }
        }, 0, 17);
    }

    public void paint(Graphics g)
    {
        super.paint(g);

        Graphics2D gtd = (Graphics2D) g;

    }

    public void keyReleased(KeyEvent k) {
        if (k.getKeyChar() == 'a') player.keyLeft = true;
        if (k.getKeyChar() == 'w') player.keyUp = true;
        if (k.getKeyChar() == 'd') player.keyRight = true;
        if (k.getKeyChar() == 's') player.keyDown = true;
    }

    public void keyPressed(KeyEvent k) {
        if (k.getKeyChar() == 'a') player.keyLeft = false;
        if (k.getKeyChar() == 'w') player.keyUp = false;
        if (k.getKeyChar() == 'd') player.keyRight = false;
        if (k.getKeyChar() == 's') player.keyDown = false;
    }


    @Override
    public void actionPerformed(ActionEvent e) {


    }

}
