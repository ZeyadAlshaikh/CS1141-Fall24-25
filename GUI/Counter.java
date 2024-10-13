package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Counter extends JFrame implements ActionListener {

    JTextField txt = new JTextField("0", 5);
    JButton btnPlus = new JButton("+");
    JButton btnMinus = new JButton("-");

    int counter = 0;


    public Counter(){
        setLayout(new FlowLayout());

        add(txt);
        btnPlus.addActionListener(this);
        add(btnPlus);

        btnMinus.addActionListener(this);
        add(btnMinus);

        setTitle("Counter");
        setVisible(true);
        setSize(280,120);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        new Counter();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand() == "+") {
            counter++;
            txt.setText(counter + "");
        }else if (e.getActionCommand() == "-"){
            counter--;
            txt.setText(counter + "");
        }
    }
}
