import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Modify extends JFrame implements ActionListener {
    JLabel lblusrold, lblusrnew;
    JTextField txtusrold, txtusrnew;
    JButton btnmod, btnback;

    public Modify() {
        lblusrold = new JLabel(" Old UserName");

        txtusrold = new JTextField(70);

        lblusrnew = new JLabel(" New UserName");

        txtusrnew = new JTextField(70);

        btnmod = new JButton("Modify");

        btnback = new JButton("Back");


        setLayout(null);
        //setLayout(new FlowLayout());

        add(lblusrold);
        lblusrold.setBounds(20, 50, 170, 25);

        add(txtusrold);
        txtusrold.setBounds(130, 50, 250, 25);

        add(lblusrnew);
        lblusrnew.setBounds(20, 90, 170, 25);

        add(txtusrnew);
        txtusrnew.setBounds(130, 90, 250, 25);

        add(btnmod);
        btnmod.setBounds(130, 130, 80, 25);
        btnmod.addActionListener(this);

        add(btnback);
        btnback.setBounds(220, 130, 70, 25);
        btnback.addActionListener(this);


        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setTitle("Modify Record");
        setSize(400,250);

        setResizable(false);

        setLocationRelativeTo(null);
    }



    public JLabel getLblusrold() {
        return lblusrold;
    }



    public void setLblusrold(JLabel lblusrold) {
        this.lblusrold = lblusrold;
    }



    public JLabel getLblusrnew() {
        return lblusrnew;
    }



    public void setLblusrnew(JLabel lblusrnew) {
        this.lblusrnew = lblusrnew;
    }



    public JTextField getTxtusrold() {
        return txtusrold;
    }



    public void setTxtusrold(JTextField txtusrold) {
        this.txtusrold = txtusrold;
    }



    public JTextField getTxtusrnew() {
        return txtusrnew;
    }



    public void setTxtusrnew(JTextField txtusrnew) {
        this.txtusrnew = txtusrnew;
    }



    public static void main(String[] args) {
        new Modify();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==btnmod) {
            JOptionPane.showMessageDialog(null, "Modified");
        }
        if(e.getSource()==btnback) {
            new MainFrame();
            dispose();
        }

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
