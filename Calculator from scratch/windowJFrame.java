import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class windowJFrame{

    static int screenHeight = 500;
    static int screenWidth = 400;

    static String num;

    static JFrame frame;
    static JPanel panel;
    static JLabel label;
    static JButton button;
    static JTextField textField;


//--------------------------------------------------NUMBERS---------------------------------------------------

    //Adds the 1 button
    public static void one(){
        
        button = new JButton("1");
        button.setBounds(20, 100, 50, 50);

        label = new JLabel();

        label.setBounds(100, 30,325,50);  

        frame.add(button);
        frame.setLayout(null);
        frame.add(label);
        frame.setVisible(true);

        //Sets current value of calc to 1
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                num = num + "1";
                label.setText(num);
                label.setFont(new Font("Arial", Font.BOLD, 30));
                label.setForeground(Color.WHITE);

            }
        });
    }

    //Adds the 2 button
    public static void two(){
        
        button = new JButton("2");
        button.setBounds(80, 100, 50, 50);

        label = new JLabel();
        label.setBounds(100, 30,325,50);  

        frame.add(button);
        frame.setLayout(null);
        frame.add(label);
        frame.setVisible(true);

        //Sets current value of calc to 2
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                num = num + "2";
                label.setText(num);
                label.setFont(new Font("Arial", Font.BOLD, 30));
                label.setForeground(Color.WHITE);

            }
        });
    }

    //Adds the 3 button
    public static void three(){
        
        button = new JButton("3");
        button.setBounds(140, 100, 50, 50);

        label = new JLabel();
        label.setBounds(100, 30,325,50);  

        frame.add(button);
        frame.setLayout(null);
        frame.add(label);

        //Sets current value of calc to 3
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                num = num + "3";
                label.setText(num);
                label.setFont(new Font("Arial", Font.BOLD, 30));
                label.setForeground(Color.WHITE);

            }
        });
    }

    //Adds the 4 button
    public static void four(){
        
        button = new JButton("4");
        button.setBounds(20, 160, 50, 50);

        label = new JLabel();
        label.setBounds(100, 30,325,50);  

        frame.add(button);
        frame.setLayout(null);
        frame.add(label);

        //Sets current value of calc to 4
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                num = num + "4";
                label.setText(num);
                label.setFont(new Font("Arial", Font.BOLD, 30));
                label.setForeground(Color.WHITE);

            }
        });
    }

    //Adds the 5 button
    public static void five(){
        
        button = new JButton("5");
        button.setBounds(80, 160, 50, 50);

        label = new JLabel();
        label.setBounds(100, 30,325,50);  

        frame.add(button);
        frame.setLayout(null);
        frame.add(label);
        frame.setVisible(true);

        //Sets current value of calc to 5
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                num = num + "5";
                label.setText(num);
                label.setFont(new Font("Arial", Font.BOLD, 30));
                label.setForeground(Color.WHITE);

            }
        });
    }

    //Adds the 6 button
    public static void six(){
        
        button = new JButton("6");
        button.setBounds(140, 160, 50, 50);

        label = new JLabel();
        label.setBounds(100, 30,325,50);  

        frame.add(button);
        frame.setLayout(null);
        frame.add(label);
        frame.setVisible(true);

        //Sets current value of calc to 6
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                num = num + "6";
                label.setText(num);
                label.setFont(new Font("Arial", Font.BOLD, 30));
                label.setForeground(Color.WHITE);

            }
        });
    }

    //Adds the 7 button
    public static void seven(){
        
        button = new JButton("7");
        button.setBounds(20, 220, 50, 50);

        label = new JLabel();
        label.setBounds(100, 30,325,50);  

        frame.add(button);
        frame.setLayout(null);
        frame.add(label);

        //Sets current value of calc to 7
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                num = num + "7";
                label.setText(num);
                label.setFont(new Font("Arial", Font.BOLD, 30));
                label.setForeground(Color.WHITE);

            }
        });
    }

    //Adds the 8 button
    public static void eight(){
        
        button = new JButton("8");
        button.setBounds(80, 220, 50, 50);

        label = new JLabel();
        label.setBounds(100, 30,325,50);  

        frame.add(button);
        frame.setLayout(null);
        frame.add(label);

        //Sets current value of calc to 8
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                num = num + "8";
                label.setText(num);
                label.setFont(new Font("Arial", Font.BOLD, 30));
                label.setForeground(Color.WHITE);

            }
        });
    }

    //Adds the 9 button
    public static void nine(){
        
        button = new JButton("9");
        button.setBounds(140, 220, 50, 50);

        label = new JLabel();
        label.setBounds(100, 30,325,50);  

        frame.add(button);
        frame.setLayout(null);
        frame.add(label);

        //Sets current value of calc to 9
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                num = num + "9";
                label.setText(num);
                label.setFont(new Font("Arial", Font.BOLD, 30));
                label.setForeground(Color.WHITE);

            }
        });
    }

    //Adds the 0 button
    public static void zero(){
        
        button = new JButton("0");
        button.setBounds(20, 280, 175, 50);

        label = new JLabel();
        label.setBounds(100, 30,325,50);  

        frame.add(button);
        frame.setLayout(null);
        frame.add(label);

        //Sets current value of calc to 9
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                num = num + "0";
                label.setText(num);
                label.setFont(new Font("Arial", Font.BOLD, 30));
                label.setForeground(Color.WHITE);

            }
        });
    }

//--------------------------------------------------Symbols----------------------------------------------------------

    //Adds the + button
    public static void plus(){
        
        button = new JButton("+");
        button.setBounds(200, 100, 50, 50);

        label = new JLabel();
        label.setBounds(100, 30, 325,50);  

        frame.add(button);
        frame.setLayout(null);
        frame.add(label);

        //Sets current value of calc to 1
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                mathFunctions.setSign('+');
                mathFunctions.insert_variable(num);
                label.setText("+");
                label.setFont(new Font("Arial", Font.BOLD, 30));
                label.setForeground(Color.WHITE);
                num = "";
            }
        });
    }

    //Adds the - button
    public static void minus(){
        
        button = new JButton("-");
        button.setBounds(200, 160, 50, 50);

        label = new JLabel();
        label.setBounds(100, 30, 325,50);  

        frame.add(button);
        frame.setLayout(null);
        frame.add(label);

        //Sets current value of calc to 1
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                mathFunctions.setSign('-');
                mathFunctions.insert_variable(num);
                label.setText("-");
                label.setFont(new Font("Arial", Font.BOLD, 30));
                label.setForeground(Color.WHITE);
                num = "";
            }
        });
    }

    //Adds the * button
    public static void multiply(){
        
        button = new JButton("*");
        button.setBounds(200, 220, 50, 50);
    
        label = new JLabel();
        label.setBounds(100, 30, 325,50);  
    
        frame.add(button);
        frame.setLayout(null);
        frame.add(label);
    
        //Sets current value of calc to 1
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                mathFunctions.setSign('*');
                mathFunctions.insert_variable(num);
                label.setText("*");
                label.setFont(new Font("Arial", Font.BOLD, 30));
                label.setForeground(Color.WHITE);
                num = "";
            }
        });
    }
       
    //Adds the / button
    public static void divide(){
        
        button = new JButton("/");
        button.setBounds(200, 280, 50, 50);

        label = new JLabel();
        label.setBounds(100, 30, 325,50);  

        frame.add(button);
        frame.setLayout(null);
        frame.add(label);

        //Sets current value of calc to 1
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                mathFunctions.setSign('/');
                mathFunctions.insert_variable(num);
                label.setText("0");
                label.setFont(new Font("Arial", Font.BOLD, 30));
                label.setForeground(Color.WHITE);
                num = "";
            }
        });
    }

    //Resets number to 0
    public static void c(){
        
        button = new JButton("C");
        button.setBounds(100, 340, 50, 50);

        label = new JLabel();
        label.setBounds(100, 30, 325,50);  
        
        frame.add(button);
        frame.setLayout(null);
        frame.add(label);

        //Sets current value of calc to 1
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                label.setText("0");
                label.setFont(new Font("Arial", Font.BOLD, 30));
                label.setForeground(Color.WHITE);
                num = "";
            }
        });
    }

    //Resets number to 0
    public static void negative(){
        
        button = new JButton("+/-");
        button.setBounds(260, 100, 50, 50);

        label = new JLabel();
        label.setBounds(100, 30, 325,50);  

        frame.add(button);
        frame.setLayout(null);
        frame.add(label);

        //Sets current value of calc to 1
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                num = num + "0";
                label.setFont(new Font("Arial", Font.BOLD, 30));
                label.setForeground(Color.WHITE);
                num = "";
            }
        });
    }

    //Adds the = button
    public static void equal(){
        
        button = new JButton("=");
        button.setBounds(200, 340, 50, 50);

        label = new JLabel();
        label.setBounds(100, 30, 325,50);  

        frame.add(button);
        frame.setLayout(null);
        frame.add(label);

        //Sets current value of calc to 1
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                label.setText(mathFunctions.solve(num));
                label.setFont(new Font("Arial", Font.BOLD, 30));
                label.setForeground(Color.WHITE);
            }
        });
    }

    //Creates buttons
    public static void createButtons(){
        one();
        two();
        three();
        four();
        five();
        six();
        seven();
        eight();
        nine();
        zero();

        plus();
        minus();
        multiply();
        divide();
        equal();
        c();
        negative();
    }

    public static void main(String[] args){

        //Starting character in Calculator
        num = "";

        //Creates application window
        frame = new JFrame();
        frame.getContentPane().setBackground(Color.BLUE);
        // frame.getContentPane().add(new graphicsJPanel());
        frame.setSize(screenWidth, screenHeight);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator");
        frame.setVisible(true);
        
        createButtons();
    }
}

