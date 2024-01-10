package JavaPractice01.GUI;

import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame {
    public LabelEx() {
        setTitle("예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        JLabel textLabel = new JLabel("gskim");

        ImageIcon img1 = new ImageIcon("images/gosling.jpg");
        JLabel imaLabel = new JLabel(img1);

        Image tempImg = img1.getImage();
        Image midImg = tempImg.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon img2 = new ImageIcon(midImg);
        JLabel mixLabel = new JLabel("Hello", img2, SwingConstants.CENTER);

        cp.add(textLabel);
        cp.add(imaLabel);
        cp.add(mixLabel);

        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LabelEx();
    }
}
