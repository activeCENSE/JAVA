package JavaPractice01.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    private JLabel imgLabel = new JLabel();
    public Menu(){
        setTitle("예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(imgLabel);
        JMenuBar mb = new JMenuBar();
        JMenu menu1 = new JMenu("Screen");
        JMenuItem[] menuItem = new JMenuItem[4];
        mb.add(menu1);
        String[] items = {"Load", "Hide", "Reshow", "Exit"};
        MenuActionListener li = new MenuActionListener();

        for(int i = 0; i< items.length; i++){
             menuItem[i] = new JMenuItem(items[i]);
             menuItem[i].addActionListener(li);
             menu1.add(menuItem[i]);
        }
        mb.add(menu1);
        setJMenuBar(mb);

        setSize(300,300);
        setVisible(true);

    }

    class MenuActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();
            switch (command){
                case "Load":
                    if(imgLabel.getIcon() == null){
                        imgLabel.setIcon(new ImageIcon("./JavaPractice01/images/apple.jpeg"));
                        break;
                    }
                case "Hide":
                    imgLabel.setVisible(false); break;
                case "Reshow": imgLabel.setVisible(true); break;
                case "Exit": System.exit(0); break;
            }
        }
    }
    public static void main(String[] args) {
        new Menu();
    }
}
