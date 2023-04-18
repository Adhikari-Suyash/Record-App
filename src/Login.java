import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{

    JLabel lbluser, lblpass;
    JTextField txtuser;
    JPasswordField txtpass;
    JButton btnlogin;

    public Login() {

        lbluser = new JLabel("User Name");

        lblpass = new JLabel("Password");

        txtuser = new JTextField(70);
        txtpass = new JPasswordField(70);

        btnlogin = new JButton("Login");


        setLayout(null);
        //setLayout(new FlowLayout());

        add(lbluser);
        lbluser.setBounds(20, 20, 70, 25);

        add(txtuser);
        txtuser.setBounds(110, 20, 250, 25);

        add(lblpass);
        lblpass.setBounds(20, 60, 70, 25);

        add(txtpass);
        txtpass.setBounds(110, 60, 250, 25);

        add(btnlogin);
        btnlogin.setBounds(110, 100, 70, 25);
        btnlogin.addActionListener(this);


        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setTitle("Record Login");
        setSize(400,250);

        setResizable(false);

        setLocationRelativeTo(null);


    }
    public static void main(String args[]) {
        setDefaultLookAndFeelDecorated(true);
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String username="admin";
        String pass="admin";

        String uname=txtuser.getText();
        String pwds=String.valueOf(txtpass.getPassword());

        if(username.equals(uname)&&pass.equals(pwds)) {
            JOptionPane.showMessageDialog(null, "Login Successful");
            new MainFrame();
            dispose();
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }

        else {
            JOptionPane.showMessageDialog(null, "Login Failed");
        }

    }
    public JTextField getTxtuser() {
        return txtuser;
    }
    public void setTxtuser(JTextField txtuser) {
        this.txtuser = txtuser;
    }
    public JPasswordField getTxtpass() {
        return txtpass;
    }
    public void setTxtpass(JPasswordField txtpass) {
        this.txtpass = txtpass;
    }
}


