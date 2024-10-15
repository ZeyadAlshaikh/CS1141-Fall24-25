package GUI;

import javax.swing.*;
import java.awt.*;

public class Example2  extends JFrame {
    JButton btn1 = new JButton("Button1");
    JButton btn2 = new JButton("Button2");
    JButton btn3 = new JButton("Button3");
    JButton btn4 = new JButton("Button4");

    public Example2(){
        setLayout(new FlowLayout(FlowLayout.CENTER ,10,10));
        setLayout(new GridLayout(2,2));
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);



        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Layout Examples");
        setVisible(true);
        setSize(280,150);
    }

    public static void main(String[] args) {
        new Example2();
    }
}
