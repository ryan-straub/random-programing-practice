import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class windowJFrame{

    static int screenHeight = 500;
    static int screenWidth = 400;

    int current_val = 0;
    int saved_val = 0;

    static JFrame frame = new JFrame();
    static JTextField text = new JTextField();

    // Creates Window
    public static void window(){
        frame.setContentPane(new graphicsJPanel());
        frame.setSize(screenWidth, screenHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Frame");
        frame.setVisible(true);

    }

    public static void button(){
        JButton button = new JButton("1");
        button.setBounds(20, 100, 50, 50);
        frame.add(button);
        frame.setLayout(null);
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                textField();
            }
        });
    }

    public static void textField(){
        frame.add(text);
    }

    public void actionPerformed(ActionEvent e){
        System.out.print("bruh");
    }

    public static void main(String[] args){
        window();
        button();
    }
}

