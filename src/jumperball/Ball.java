package jumperball;

import javax.swing.*;
import java.awt.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ball extends JPanel implements Runnable {

    int konum = 0;
    double yon = 10;
    double zemin = 400;
    double yukseklik = 0;
    int sayac = 0;

    public Ball() {
        new Thread(Ball.this).start();
    }

    @Override
    public void run() {
        while (true) {
            konum += yon;
            if (konum <= yukseklik) {
                yon *= -1;
                sayac += 1;

            }
            if (konum >= zemin) {
                yon *= -1;
                double islem = zemin - yukseklik;
                yukseklik += islem - ((islem * 80) / 100);
                if (sayac >= 12) {
                    yon = 0;
                }

            }

            try {
                Thread.sleep(25);
                repaint();
            } catch (InterruptedException ex) {
                Logger.getLogger(Ball.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void paint(Graphics g) {
        
        g.setColor(Color.red);
        
        g.fillRect(0, 0, 500, 500);
        g.setColor(Color.red);
        g.fillArc(100, 100, 300, 100, 180, 90);
        g.setColor(Color.ORANGE);
        g.fillOval(210, konum, 65, 65);

    }

} 
