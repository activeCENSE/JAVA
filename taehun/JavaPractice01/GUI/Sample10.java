package JavaPractice01.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sample10 extends JFrame{
    private JTextField tf = new JTextField(20);
    private JTextArea ta = new JTextArea(7,20);
    public Sample10(){
        setTitle("예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(new JLabel("입력 후 Enter 키를 누르세요"));
        cp.add(tf);
        cp.add(new JScrollPane(ta));
        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField temp = (JTextField)e.getSource();
                ta.append(temp.getText()+"\n"); //ArrayList<>를 이용하여(동적배열) 중복하는 값은 넣지말고, 중복안되게 하기.
                temp.setText("");
            }
        });
        setSize(300,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Sample10();
    }
}
