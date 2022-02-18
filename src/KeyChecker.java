import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyChecker extends KeyAdapter {

    GamePanel panel;

    public KeyChecker (GamePanel panel)
    {
        this.panel = panel;
    }

    public void keyPressed (KeyEvent k)
    {
        panel.keyPressed(k);
    }

    public void keyReleased(KeyEvent k)
    {
        panel.keyReleased(k);
    }
}
