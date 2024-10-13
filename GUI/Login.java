package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JLabel lblUserName = new JLabel("Username:");
    JTextField txtUserName = new JTextField(10);
    JPanel pnlUsername = new JPanel(new FlowLayout());

    JLabel lblPassword = new JLabel("Password");
    JTextField txtPassword = new JTextField(10);
    JPanel pnlPassword = new JPanel(new FlowLayout());

    JButton btnLogin = new JButton("Login");

    public Login(){
        setLayout(new FlowLayout());

        pnlUsername.add(lblUserName);
        pnlUsername.add(txtUserName);
        add(pnlUsername);

        pnlPassword.add(lblPassword);
        pnlPassword.add(txtPassword);
        add(pnlPassword);

        btnLogin.addActionListener(this);
        add(btnLogin);




        setTitle("Login");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(280,170);
    }


    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(txtUserName.getText().equals("Zeyad") && txtPassword.getText().equals("123"))
            System.out.println("Welcome");
        else
            System.out.println("Wrong username of password");
    }
}
