package JavaPractice01.GUI;

import javax.swing.*;
import java.awt.*;

public class ChallengeGUI extends JFrame {
    public ChallengeGUI(){
        setTitle("프레임 만들기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new NorthPanel(), BorderLayout.NORTH);
        add(new CenterPanel(), BorderLayout.CENTER);

        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        ChallengeGUI mf = new ChallengeGUI();
    }
}
