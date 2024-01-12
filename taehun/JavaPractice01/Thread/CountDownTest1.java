package JavaPractice01.Thread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CountDownTest1 extends JFrame {
	private JLabel label;
	Thread t;

	class Counter extends Thread {
		public void run() {
			for (int i = 0; i <= 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					return;
				}
				label.setText(i + "");
			}
		}
	}

	public CountDownTest1() {
		setTitle("카운트");
		setSize(400, 150);
		getContentPane().setLayout(null);
		label = new JLabel("0");
		label.setBounds(0, 0, 384, 111);
		label.setFont(new Font("Serif", Font.BOLD, 100));
		add(label);

		JButton btnNewButton = new JButton("중지");
		btnNewButton.setBounds(247, 25, 125, 23);
		btnNewButton.addActionListener(e -> t.interrupt());
		add(btnNewButton);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		t = new Counter();
		t.start();

	}

	public static void main(String[] args) {
		CountDownTest1 t = new CountDownTest1();
	}
}