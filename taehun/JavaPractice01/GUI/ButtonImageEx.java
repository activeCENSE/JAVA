package JavaPractice01.GUI;

import javax.swing.*;
import java.awt.*;

public class ButtonImageEx extends JFrame{
    public ButtonImageEx(){
    setTitle("예제");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container cp = getContentPane();

    ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");
    ImageIcon rolloverIcon = new ImageIcon("images/rolloverIcon.gif");
    ImageIcon pressedIcon = new ImageIcon("images/pressedIcon.gif");

    JButton btn = new JButton("CALL~", normalIcon);
    btn.setRolloverIcon(rolloverIcon);
    btn.setPressedIcon(pressedIcon);
    btn.setSize(100,100);
    btn.setHorizontalAlignment(SwingConstants.LEFT);
    cp.add(btn);

    setSize(300,300);
    setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonImageEx();
    }
}
