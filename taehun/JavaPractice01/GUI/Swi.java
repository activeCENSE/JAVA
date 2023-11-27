package JavaPractice01.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Swi extends JFrame{
    private JCheckBox[] cName = new JCheckBox[3];
    private String[] names = {"ulsan", "busan", "seoul"};
    private JLabel sumLabel;
    public Swi() {
        setTitle("예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(new JLabel("울산 100원 부산 200원 서울 1000원"));
        MyItemListener listener = new MyItemListener();
        for(int i = 0; i< cName.length; i++){
            cName[i] = new JCheckBox(names[i]);
            cp.add(cName[i]);
            cName[i].addItemListener(listener);
        }
        sumLabel = new JLabel("현재 0원 입니다.");
        cp.add(sumLabel);
        setSize(300,300);
        setVisible(true);
    }

    class MyItemListener implements ItemListener {
        private int sum = 0;
        @Override
        public void itemStateChanged(ItemEvent e) {
            if(e.getStateChange() == ItemEvent.SELECTED){
                if(e.getSource() == cName[0]){
                    sum += 100;
                } else if(e.getSource() == cName[1]){
                    sum += 200;
                } else {
                    sum += 1000;
                }
            } else {
                if(e.getSource() == cName[0]){
                    sum -= 100;
                } else if(e.getSource() == cName[1]){
                    sum -= 200;
                } else {
                    sum -= 1000;
                }
            }
            sumLabel.setText("현재 " + sum + "원 입니다.");
        }
    }
    public static void main(String[] args) {
        new Swi();
    }
}
