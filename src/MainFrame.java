import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {
    JMenuBar mb;
    JMenu mrow;
    JMenuItem AddRecord, ModifyRecord, DeleteRecord;
    JLabel lbl;

    public MainFrame() {
        mb = new JMenuBar();
        mrow = new JMenu("Records");
        AddRecord = new JMenuItem("Add Record");
        ModifyRecord = new JMenuItem("Modify Record");
        DeleteRecord = new JMenuItem("Delete Record");
        lbl = new JLabel("Here You can add, modify and delete records.");

        setLayout(null);
        setJMenuBar(mb);
        mb.add(mrow);
        mrow.add(AddRecord);
        AddRecord.addActionListener(this);
        mrow.add(ModifyRecord);
        ModifyRecord.addActionListener(this);
        mrow.add(DeleteRecord);
        DeleteRecord.addActionListener(this);

        add(lbl);
        lbl.setBounds(50, 80, 275, 25);



        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setTitle("Records");
        setSize(400,250);

        setResizable(false);

        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new MainFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==AddRecord) {
            new Add();
            dispose();
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }

        if(e.getSource()==ModifyRecord) {
            new Modify();
            dispose();
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }

        if(e.getSource()==DeleteRecord) {
            new Delete();
            dispose();
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }

    }
}
