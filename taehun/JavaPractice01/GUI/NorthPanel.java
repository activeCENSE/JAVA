package JavaPractice01.GUI;

import javax.swing.*;
import java.awt.*;

public class NorthPanel extends JPanel{
    public NorthPanel(){
        setBackground(Color.lightGray);
        setLayout(new FlowLayout(FlowLayout.CENTER, 40, 40));

        add(new JButton("OK"));
        add(new JButton("Cancel"));
        add(new JButton("Ignore"));
    }

}
