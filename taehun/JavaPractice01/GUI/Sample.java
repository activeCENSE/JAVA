package JavaPractice01.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Sample extends JFrame {
    private JCheckBox[] cName = new JCheckBox[3];
    private ImageIcon[] images = new ImageIcon[3];
    private String[] names = {"ulsan", "busan", "seoul"};
    private String[] imageNames = {"./JavaPractice01/images/apple.jpeg", "./JavaPractice01/images/cherry.jpeg", "./JavaPractice01/images/pear.jpeg"};
    private JLabel sumLabel;
    public Sample(){
        setTitle("예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(new JLabel("울산 100원 부산 200원 서울 1000원"));
        MyItemListener listener = new MyItemListener();
        for(int i = 0; i< cName.length; i++){
            ImageIcon tempImageIcon = new ImageIcon(imageNames[i]);
            Image img = tempImageIcon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            images[i] = new ImageIcon(img);
            cName[i] = new JCheckBox(names[i], images[i]);
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
        new Sample();
    }
}
