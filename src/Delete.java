import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Delete extends JFrame implements ActionListener {
    JLabel lblusr;
    JTextField txtusr;
    JButton btndel, btnback;

    public Delete() {
        lblusr = new JLabel("User Name");

        txtusr = new JTextField(70);

        btndel = new JButton("Delete");

        btnback = new JButton("Back");


        setLayout(null);
        //setLayout(new FlowLayout());

        add(lblusr);
        lblusr.setBounds(20, 20, 70, 25);

        add(txtusr);
        txtusr.setBounds(110, 20, 250, 25);

        add(btndel);
        btndel.setBounds(110, 70, 90, 25);
        btndel.addActionListener(this);

        add(btnback);
        btnback.setBounds(210, 70, 90, 25);
        btnback.addActionListener(this);


        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setTitle("Delete Record");
        setSize(400,250);

        setResizable(false);

        setLocationRelativeTo(null);
    }


    public JTextField getTxtusr() {
        return txtusr;
    }



    public void setTxtusr(JTextField txtusr) {
        this.txtusr = txtusr;
    }



    public static void main(String[] args) {
        new Delete();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==btndel) {
            JOptionPane.showMessageDialog(null, "Deleted");
        }
        if(e.getSource()==btnback) {
            new MainFrame();
            dispose();
        }
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
