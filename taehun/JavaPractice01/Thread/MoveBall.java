package JavaPractice01.Thread;

import java.awt.*;
import javax.swing.*;

//���� Ball Ŭ������ �𵨸��Ѵ�. 

class Ball {

	public Ball(int x, int y, int size, Color color){
		this.x = x;
		this.y = y;
		this.size = size;
		this.color = color;
	}

//���� �Ӽ��� ��ġ, ũ��, �ӵ��̴�. 
	private int x;
	private int y;
	private int size;
	private int xSpeed = 10;
	private int ySpeed = 10;

	private Color color;

//���� ȭ�鿡 �׷��ִ� �޼ҵ��̴�. 

	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval(x, y, size, size);
	}

	public void update() {
		x += xSpeed;
		y += ySpeed;
		if ((x + size) > MoveBall.BOARD_WIDTH - size || x < 0) {
			xSpeed = -xSpeed;
		}
		if ((y + size) > MoveBall.BOARD_HEIGHT - size || y < 0) {
			ySpeed = -ySpeed;
		}
	}
}

//���� ���ο� ��ġ�� ����Ѵ�. ���� ���� �ε�ġ�� �ݻ�ǵ��� �Ѵ�. 

public class MoveBall extends JPanel {
	static final int BOARD_WIDTH = 600;
	static final int BOARD_HEIGHT = 300;
	private Ball ball = new Ball(100, 100, 30, Color.red);
	private Ball ball2 = new Ball(200, 100, 50, Color.blue);

	public MoveBall() {
		this.setBackground(Color.YELLOW);
		Runnable task = () -> {
			while (true) {
				ball.update();
				repaint();
				try {
					Thread.sleep(20);
				} catch (InterruptedException ignore) {
				}
			}
		};
		new Thread(task).start();
		Runnable task2 = () -> {
			while (true) {
				ball2.update();
				repaint();
				try {
					Thread.sleep(20);
				} catch (InterruptedException ignore) {
				}
			}
		};
		new Thread(task2).start();
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		ball.draw(g);
		ball2.draw(g);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(MoveBall.BOARD_WIDTH, MoveBall.BOARD_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new MoveBall());
		frame.setVisible(true);
	}
}