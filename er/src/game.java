import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.*;
import java.awt.*;
import java.io.File;

public class game {
    public static void main(String[] args) throws java.io.IOException {
        BufferedImage runnerF1 = ImageIO.read(new File("runnerF2.png"));
        long lft = System.currentTimeMillis();
        JFrame prim = new JFrame();
        prim.setSize(600, 200);
        prim.setTitle("er");
        prim.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        prim.setLocation(500, 500);
        prim.setVisible(true);
        Graphics g = prim.paint(g);
        while (true) {
            if (lft - System.currentTimeMillis() > 17) {
                lft = System.currentTimeMillis();
                g.drawImage(runnerF1, 50, 120, null);
            }
        }
    }
}
