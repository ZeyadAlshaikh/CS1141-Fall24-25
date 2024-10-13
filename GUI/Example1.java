package GUI;

import javax.swing.*;
import java.awt.*;

public class Example1 extends JFrame {

    private JLabel lbl1;
    private JTextField txt1;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JPanel pnl1;
    private JPanel pnl2;

    public Example1(){
        // set layout
        setLayout(new FlowLayout());

        lbl1 = new JLabel("Label");
        txt1 = new JTextField("Your Name", 15);
        pnl1 = new JPanel(new FlowLayout());
        pnl1.add(lbl1);
        pnl1.add(txt1);
        add(pnl1);


        btn1 = new JButton("Button 1");
        btn1.setEnabled(false);
        btn2 = new JButton("Button 2");
        btn3 = new JButton("Button 3");
        pnl2 = new JPanel(new FlowLayout());
        pnl2.add(btn1);
        pnl2.add(btn2);
        pnl2.add(btn3);
        add(pnl2);

        setTitle("Example 1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320, 120);
        setVisible(true);


    }


    public static void main(String[] args) {
         new Example1();
    }

}
