package JavaPractice01.GUI;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public MyFrame(){
        setTitle("프레임 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container cp = getContentPane();
        cp.setBackground(Color.red);
        cp.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 40));

        cp.add(new JButton("OK"));
        cp.add(new JButton("Cancel"));
        cp.add(new JButton("Ignore"));

        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
    }
}
