import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//USED TO MAKE IT LOOK MORE CALC LIKE
public class graphicsJPanel extends JPanel{
    
    static JPanel panel;

    public void paint(Graphics g){

        //Digital Visual
        g.setColor(Color.WHITE);
        g.drawRect(20, 20, 350, 40);
        g.fillRect(20, 20, 200, 40);
    }
}
