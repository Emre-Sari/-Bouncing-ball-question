
package jumperball;

import java.awt.Color;
import javax.swing.JFrame;


public class JumperBall extends Ball {

    
    public static void main(String[] args) {
       Ball ball = new Ball();
       JFrame frame = new JFrame("Zıplayan Top");
       frame.setSize(500,500);
       frame.setVisible(true);
       frame.setResizable(false);       
       frame.add(ball);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        
    }
    
}
