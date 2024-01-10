package JavaPractice01.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SLListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        if(btn.getText().equals("red")){
            SampleListener.cp.setBackground(Color.red);
        } else {
            SampleListener.cp.setBackground(Color.blue);
        }
    }
}
