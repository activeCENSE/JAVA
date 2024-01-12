package JavaPractice01.Thread;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RocketThread extends Thread {
	private JLabel rocket;
	MyPanel panel;

	public RocketThread(MyPanel panel, int x, int y) {
		this.panel = panel;
		ImageIcon image = new ImageIcon("rocket.png");
		rocket = new JLabel(image);
		rocket.setSize(image.getIconWidth(), image.getIconWidth());
		rocket.setLocation(x, y);
		panel.add(rocket);
		panel.repaint();
	}

	@Override
	public void run() {
		while (true) {
			int x = rocket.getX();
			int y = rocket.getY() - 3;
			if (y < 0) {
				panel.remove(rocket);
				panel.repaint();
				return;
			}
			rocket.setLocation(x, y);
			panel.repaint();
			try {
				sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}
}

class MyPanel extends JPanel implements MouseListener {
	public MyPanel() {
		setLayout(null);
		// this.setBackground(Color.YELLOW);
		this.addMouseListener(this);
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseClicked(MouseEvent e) {

		RocketThread thread = new RocketThread(this, e.getX(), e.getY());
		thread.start();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
}

public class RocketGame extends JFrame {
	public RocketGame() {
		setTitle("Rocket Game");
		MyPanel p = new MyPanel();
		add(p);
		setSize(600, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new RocketGame();
	}
}