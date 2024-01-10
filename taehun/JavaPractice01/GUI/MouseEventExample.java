package JavaPractice01.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEventExample extends JFrame {
    private JLabel la = new JLabel("UC");
    public MouseEventExample(){
        setTitle("예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(null);
        la.setSize(100,20);
        MyMouseListener li = new MyMouseListener();
        cp.addMouseListener(li);
        cp.addMouseMotionListener(li);

        setSize(300,300);
        setVisible(true);
    }

    public class MyMouseListener implements MouseListener, MouseMotionListener{

        @Override
        public void mouseClicked(MouseEvent e) {
            Component com = (Component)e.getSource();
            com.setBackground(Color.red);
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {
            Component com = (Component)e.getSource();
            com.setBackground(Color.lightGray);
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            la.setLocation(e.getX(), e.getY());
            setTitle("mouseDragging..." + e.getX() +" + "+ e.getY() );
        }

        @Override
        public void mouseMoved(MouseEvent e) {

        }
    }
    public static void main(String[] args) {
        new MouseEventExample();
    }
}
