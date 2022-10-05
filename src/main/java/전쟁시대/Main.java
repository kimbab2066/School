package 전쟁시대;

import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main extends JFrame {

	public Main() {
		setTitle("전쟁시대"); // 창 제목
		setResizable(false); // 창 조절 안되도록
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 까먹음
		setSize(1200, 800); // 창 사이즈

		Man man = new Man(10, 10);
		add(man);
		man.move.start();

		Man man2 = new Man(-10, 10);
		add(man2);
		man2.move.start();

		setVisible(true); // 창 보이도록
	}

	public static void main(String[] args) {
		new Main();
	}
}

class Man extends JLabel {
	private static final String PNG1 = "./a.png";
	private static final String PNG2 = "./a2.png";
	private boolean image_change = true;

	public Thread move = new Thread(() -> {
		while (true) {
			Point p = this.getLocation();
			this.setLocation(p.x + 5, p.y);

			if (image_change)
				this.setIcon(new ImageIcon(Main.class.getResource(PNG1)));
			else
				this.setIcon(new ImageIcon(Main.class.getResource(PNG2)));

			image_change = !image_change;

			System.out.println(image_change);

			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}
	});

	private static ImageIcon icon = new ImageIcon(Main.class.getResource(PNG1)); // 아이콘 객체 생성

	public Man(int x, int y) {
		super(icon); // 라벨에 아이콘 지정
		setBounds(x, y, 100, 100); // 해당 위치에 생성
	}
}