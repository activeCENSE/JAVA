package JavaPractice01.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sample11 extends JFrame {
    private String[] fr = {"apple", "cherry", "pear"};
    private ImageIcon[] frImg = {
                                new ImageIcon("./JavaPractice01/images/apple.jpeg"),
                                new ImageIcon("./JavaPractice01/images/cherry.jpeg"),
                                new ImageIcon("images/pear.jpeg")};
    private JLabel imgLabel = new JLabel(frImg[0]);
    public Sample11(){
        setTitle("예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        JComboBox<String> cb = new JComboBox<String>(fr);
        cp.add(cb);
        cp.add(imgLabel);
        cb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox<String> cbTemp = (JComboBox<String>)e.getSource();
                int index = cbTemp.getSelectedIndex();
                imgLabel.setIcon(frImg[index]);
            }
        });
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Sample11();
    }
}
