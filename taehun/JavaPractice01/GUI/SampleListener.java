package JavaPractice01.GUI;

import javax.swing.*;
import java.awt.*;

public class SampleListener extends JFrame {
    static Container cp;

    public SampleListener(){
        setTitle("리스너 시작 예제1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cp = getContentPane();
        cp.setLayout(new FlowLayout());
        JButton redBtn = new JButton("red");
        JButton blueBtn = new JButton("blue");
        redBtn.addActionListener(new SLListener());
        cp.add(redBtn);
        blueBtn.addActionListener(new SLListener());
        cp.add(blueBtn);


        setSize(250, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SampleListener();
    }
}
