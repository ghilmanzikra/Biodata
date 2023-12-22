import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class tampilan {
    private JTextPane textPane1;
    private JButton tanggal;
    private JButton bulan;
    private JButton tahun;
    private JTextField textField1;
    private JButton OK;
    private JTextField textField2;
    private JTextPane textPane2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;

    public tampilan() {
        tanggal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        bulan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        tahun.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        OK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        textPane1.addComponentListener(new ComponentAdapter() {
            @Override
            public String toString() {
                return super.toString();
            }
        });
        textField2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        textPane1.addComponentListener(new ComponentAdapter() {
            @Override
            public String toString() {

                return super.toString();
            }
        });
    }
}
