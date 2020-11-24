package LDTcode;

import java.awt.*;
import java.net.URISyntaxException;

public class LolDevelopmentTest {

	public static final int SCREEN_WIDTH = 1280;
	public static final int SCREEN_HEIGHT = 720;
	
	public static int[] MP_POOL = new int[] {400, 0, 300, 400, 450, 500, 480, 440, 510, 420};
	public static int[] HP_POOL = new int[] {560, 600, 650, 530, 570, 520, 610, 660, 700, 510};
	public static int[] AD_POOL = new int[] {70, 75, 81, 55, 50, 70, 55, 55, 50, 55};
	public static int[] AP_POOL = new int[] {0, 0, 0, 0, 40, 0, 30, 40, 50, 45};
	public static final String[] NAME_POOL = new String[] {"가렌", "야스오", "트리스타나", "알리스타", "애니", "마이", "럭스", "초가스", "피즈", "아리"};
	
	public static void main(String[] args) throws URISyntaxException {

		// File Clap =new
		// File(LolDevelopmentTest.class.getResource("../music/introMusic.mp3").toURI());

		// Music.PlaySound(Clap);

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LDTcode.Monitor window = new LDTcode.Monitor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		ChampPool[] Ch_Pool = new ChampPool[10];
		
		for(int i= 0; i < Ch_Pool.length ; i++){
			Ch_Pool[i] = new ChampPool(NAME_POOL[i],AD_POOL[i],AP_POOL[i],HP_POOL[i],MP_POOL[i]);
		}
		for(int i=0; i < Ch_Pool.length; i++) {
			System.out.println("----------------");
			Ch_Pool[i].print();
		}
		
	}
	
}
