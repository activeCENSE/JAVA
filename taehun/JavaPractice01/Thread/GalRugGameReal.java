package JavaPractice01.Thread;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class GraphicObject {
	BufferedImage img = null;
	int x = 0, y = 0;

	public GraphicObject(String name) {
		try {
			img = ImageIO.read(new File(name));
		} catch (IOException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}

	public void update() {
	}

	public void draw(Graphics g) {
		g.drawImage(img, x, y, null);
	}

	public void keyPressed(KeyEvent event) {
	}
}


class Enemy extends GraphicObject {
	boolean stop = false; // 적이 살아 움짐임
	int dx = -10;

	public Enemy(String name) {

		super(name);
		x = 500;
		y = 0;
	}

	public void update() {
		x += dx;
		if (x < 0)
			dx = +10;
		if (x > 500)
			dx = -10;
	}
}

class SpaceShip extends GraphicObject {
	public SpaceShip(String name) {

		super(name);
		x = 150;
		y = 350;
	}

	public void keyPressed(KeyEvent event) {
		if (event.getKeyCode() == KeyEvent.VK_LEFT) {
			x -= 10;
		}
		if (event.getKeyCode() == KeyEvent.VK_RIGHT) {
			x += 10;
		}
		if (event.getKeyCode() == KeyEvent.VK_UP) {
			y -= 10;
		}
		if (event.getKeyCode() == KeyEvent.VK_DOWN) {
			y += 10;
		}
	}
}

class Missile extends Thread {  // 
	boolean launched = false;
	int x, y;
	MyPanelGame panel;
	private JLabel missileImage;
	Enemy enemy;

	public Missile(MyPanelGame panel, int x, int y, Enemy enemy) {
		this.panel = panel;
		this.x = x;
		this.y = y;
		this.enemy = enemy;
		ImageIcon image = new ImageIcon("missile.png");
		missileImage = new JLabel(image);
		missileImage.setSize(image.getIconWidth(), image.getIconWidth());
		missileImage.setLocation(x, y);
		panel.add(missileImage);
		panel.repaint();
	}

	@Override
	public void run() {
		while (true) {			
			int tmp = (int)(Math.random() * 10);
			y = y - tmp ;
			if (y < 0) {
				panel.remove(missileImage);
				panel.repaint();
				return;
			}
			if(collision()) {  // 명중했으니, 적은 없어짐
				enemy.stop = true; 
				return;
			}
		
			missileImage.setLocation(x, y);
			panel.repaint();
			try {
				sleep(30);
			} catch (InterruptedException e) {
			}
		}
	}
	public boolean collision() {
		//System.out.println("적=== >("+x+","+y+")");
		//System.out.println("미사일===> ("+x+","+y+")");
		
		if( (x >= enemy.x-30) && (x <= enemy.x+30) && (y < 20) ) {
			 System.out.println("명중!!!!!!!!!!!!!!");
		     return true;
		}
		else {
			return false;
		}
	}
}


class MyPanelGame extends JPanel implements KeyListener {
	Enemy enemy;
	SpaceShip spaceship;

	public MyPanelGame() {
		super();
		this.addKeyListener(this);
		this.requestFocus();
		setFocusable(true);

		enemy = new Enemy("enemy.png");
		spaceship = new SpaceShip("spaceship.png");
		
		class MyThread extends Thread { 
			public void run() {  // spaceship, enemy를 하나의 쓰레드에서 수행
				while (true) {
					enemy.update(); // enemy 자동으로 좌우로 움직이게 함
					//spaceship.update();
					repaint(); // paint() 함수 call
					if(enemy.stop) {
						System.out.println("게임 종료");
						return;
					}
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
					}
				}
			}
		}
		Thread t = new MyThread();
		t.start(); 
	}

	public void paint(Graphics g) {
		super.paint(g);
        //System.out.println("paint---");
		enemy.draw(g);
		spaceship.draw(g);
		//missile.draw(g);
	}

	public void keyPressed(KeyEvent event) {
		spaceship.keyPressed(event);  //
		
		if (event.getKeyCode() == KeyEvent.VK_SPACE) {
			Thread t = new Missile(this, spaceship.x, spaceship.y, enemy);
			System.out.println("미사일 발사");
			t.start();
		}
	
	}
	public void keyReleased(KeyEvent arg0) {	}
	public void keyTyped(KeyEvent arg0) {	}
}


public class GalRugGameReal extends JFrame {
	public GalRugGameReal() {
		setTitle("갤러그 게임 Real");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new MyPanelGame());
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GalRugGameReal();
	}
}