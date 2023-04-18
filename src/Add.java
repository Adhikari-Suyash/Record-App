import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Add extends JFrame implements ActionListener {
    JLabel lblusr;
    JTextField txtusr;
    JButton btnadd, btnback;

    public Add() {
        lblusr = new JLabel("User Name");

        txtusr = new JTextField(70);

        btnadd = new JButton("Add");

        btnback = new JButton("Back");


        setLayout(null);
        //setLayout(new FlowLayout());

        add(lblusr);
        lblusr.setBounds(20, 20, 70, 25);

        add(txtusr);
        txtusr.setBounds(110, 20, 250, 25);

        add(btnadd);
        btnadd.setBounds(110, 100, 70, 25);
        btnadd.addActionListener(this);

        add(btnback);
        btnback.setBounds(190, 100, 70, 25);
        btnback.addActionListener(this);


        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setTitle("Add Record");
        setSize(400,250);

        setResizable(false);

        setLocationRelativeTo(null);
    }

    public Add(JTextField txtusr) throws HeadlessException {
        this.txtusr = txtusr;
    }

    public JTextField getTxtusr() {
        return txtusr;
    }

    public void setTxtusr(JTextField txtusr) {
        this.txtusr = txtusr;
    }


    public JButton getBtnadd() {
        return btnadd;
    }

    public static void main(String[] args) {
        new Add();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnadd) {
            JOptionPane.showMessageDialog(null, "Added");
        }
        if(e.getSource()==btnback) {
            new MainFrame();
            dispose();
        }
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
