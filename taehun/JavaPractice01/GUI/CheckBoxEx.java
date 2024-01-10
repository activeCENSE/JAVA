package JavaPractice01.GUI;

import javax.swing.*;
import java.awt.*;

public class CheckBoxEx extends JFrame{
    public CheckBoxEx(){
        setTitle("예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());

        ImageIcon cherryIcon = new ImageIcon("images/cherry.jpg");
        ImageIcon selectedCherryIcon = new ImageIcon("images/selectedCherry.jpg");

        JCheckBox apple = new JCheckBox("사과");
        JCheckBox pear = new JCheckBox("배");
        JCheckBox cherry = new JCheckBox("체리", cherryIcon);


        cherry.setBorderPainted(true);
        cherry.setSelectedIcon(selectedCherryIcon);

        cp.add(apple);
        cp.add(pear);
        cp.add(cherry);

        setSize(250,150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CheckBoxEx();
    }
}
