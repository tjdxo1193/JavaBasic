package LDTcode;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Monitor  {

	
	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Monitor window = new Monitor();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Monitor() {
		initialize();
	}
	BufferedImage img1 = null;
	BufferedImage img2 = null; 
	/**
	 * Initialize the contents of the frame.
	 */
	
	class myPanel1 extends JPanel {
		public void paint (Graphics g) {
			g.drawImage(img1, 0, 0, null);
		}
	}
	class myPanel2 extends JPanel {
		public void paint (Graphics g) {
			g.drawImage(img2, 0, 0, null);
		}
	}
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\JAVA_LAB\\introBackground.jpg"));
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\JAVA_LAB\\PlayBackground.jpg"));
		frame.setBounds(100, 100, 450, 300);
		frame.setSize(1280, 720);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel StartPage = new JPanel();
		StartPage.setBounds(0, 0, 1264, 681);
		frame.getContentPane().add(StartPage);
		StartPage.setLayout(null);
		
		JLabel LDCTITLE = new JLabel("LOL Deal Calculation");
		LDCTITLE.setForeground(Color.MAGENTA);
		LDCTITLE.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 72));
		LDCTITLE.setHorizontalAlignment(SwingConstants.CENTER);
		LDCTITLE.setBounds(236, 178, 799, 103);
		StartPage.add(LDCTITLE);
		
		
		myPanel1 panel1 = new myPanel1();
		panel1.setSize(1280,720);
		StartPage.add(panel1);
		
		JButton PlayButton = new JButton("");
		PlayButton.setIcon(new ImageIcon("D:\\JAVA_LAB\\Start.png"));
		PlayButton.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 64));
		PlayButton.setBounds(474, 350, 321, 104);
		StartPage.add(PlayButton);
		
		JButton ExitButton = new JButton("");
		ExitButton.setIcon(new ImageIcon("D:\\JAVA_LAB\\Exit1.png"));
		ExitButton.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 64));
		ExitButton.setBounds(474, 476, 321, 122);
		StartPage.add(ExitButton);
		
		JPanel SettingPage = new JPanel();
		SettingPage.setBounds(0, 0, 1264, 681);
		frame.getContentPane().add(SettingPage);
		SettingPage.setLayout(null);
		SettingPage.setVisible(false);
		
		
		JButton BackButton = new JButton("");
		BackButton.setIcon(new ImageIcon("D:\\JAVA_LAB\\Back.png"));
		BackButton.setBounds(439, 490, 336, 165);
		SettingPage.add(BackButton);
		BackButton.setVisible(false);
		
		JButton CompleteButton = new JButton("");
		CompleteButton.setIcon(new ImageIcon("D:\\JAVA_LAB\\Play.png"));
		CompleteButton.setBounds(439, 301, 336, 179);
		SettingPage.add(CompleteButton);
		CompleteButton.setVisible(false);
		
		JComboBox<?> MyChampPick = new JComboBox<Object>(LolDevelopmentTest.NAME_POOL);
		MyChampPick.setBounds(775, 194, 230, 33);
		SettingPage.add(MyChampPick);
		
		JComboBox<?> OtherChampPick = new JComboBox<Object>(LolDevelopmentTest.NAME_POOL);
		OtherChampPick.setBounds(210, 189, 231, 33);
		SettingPage.add(OtherChampPick);
		
		JLabel MYchamplbl = new JLabel("MY CHAMPION");
		MYchamplbl.setFont(new Font("MS UI Gothic", Font.BOLD | Font.ITALIC, 24));
		MYchamplbl.setForeground(Color.RED);
		MYchamplbl.setHorizontalAlignment(SwingConstants.CENTER);
		MYchamplbl.setBounds(210, 146, 231, 33);
		SettingPage.add(MYchamplbl);
		
		JLabel Otherchamplbl = new JLabel("OTHER CHAMPION");
		Otherchamplbl.setHorizontalAlignment(SwingConstants.CENTER);
		Otherchamplbl.setFont(new Font("MS UI Gothic", Font.BOLD | Font.ITALIC, 24));
		Otherchamplbl.setBounds(775, 151, 230, 33);
		SettingPage.add(Otherchamplbl);
		
		JPanel PlayPage = new JPanel();
		PlayPage.setBounds(0, 0, 1264, 681);
		frame.getContentPane().add(PlayPage);
		
		myPanel2 panel2 = new myPanel2();
		panel2.setSize(1280,720);
		PlayPage.add(panel2);
		PlayPage.setLayout(null);
		
		JButton EndButton = new JButton("");
		EndButton.setIcon(new ImageIcon("D:\\JAVA_LAB\\End1.png"));
		EndButton.setBounds(1155, 10, 97, 84);
		PlayPage.add(EndButton);
		
		JButton gaQ_B = new JButton("");
		gaQ_B.setIcon(new ImageIcon("D:\\JAVA_LAB\\lol_deal_calculation\\garen\\garenQ.PNG"));
		gaQ_B.setBounds(363, 526, 50, 44);
		PlayPage.add(gaQ_B);
		
		JButton gaW_B = new JButton("");
		gaW_B.setIcon(new ImageIcon("D:\\JAVA_LAB\\lol_deal_calculation\\garen\\garenW.PNG"));
		gaW_B.setBounds(414, 526, 45, 44);
		PlayPage.add(gaW_B);
		
		JButton gaE_B = new JButton("");
		gaE_B.setIcon(new ImageIcon("D:\\JAVA_LAB\\lol_deal_calculation\\garen\\garenE.PNG"));
		gaE_B.setBounds(460, 526, 50, 44);
		PlayPage.add(gaE_B);
		
		JButton gaR_B = new JButton("");
		gaR_B.setIcon(new ImageIcon("D:\\JAVA_LAB\\lol_deal_calculation\\garen\\garenR.PNG"));
		gaR_B.setBounds(511, 526, 50, 44);
		PlayPage.add(gaR_B);
		
		JButton garen_B = new JButton("");
		garen_B.setIcon(new ImageIcon("D:\\JAVA_LAB\\lol_deal_calculation\\garen\\GaRen2.png"));
		garen_B.setBounds(12, 308, 215, 168);
		PlayPage.add(garen_B);
		
		try {
			img1 = ImageIO.read(new File("D:\\JAVA_LAB\\introBackground.jpg"));
		} catch(IOException e) {
			JOptionPane.showMessageDialog(null, "이미지 불러오기 실패");
			System.exit(0);
		}
		try {
			img2 = ImageIO.read(new File("D:\\JAVA_LAB\\PlayBackground.jpg"));
		} catch(IOException e) {
			JOptionPane.showMessageDialog(null, "이미지 불러오기 실패");
			System.exit(0);
		}
		
		
		
		PlayButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				SettingPage.setVisible(true);
				StartPage.setVisible(false);
				BackButton.setVisible(true);
				CompleteButton.setVisible(true);
			}
			
		});
		
		ExitButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		CompleteButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				PlayPage.setVisible(true);
				StartPage.setVisible(false);
				SettingPage.setVisible(false);
				BackButton.setVisible(false);
				CompleteButton.setVisible(false);
				/*
				if(MyChampPick == "가렌") {
					
				}
				if else( MyChamPick == "가렌") {
					
				}
				*/
			}
			
		});
		
		EndButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
			
		});
		
		BackButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				StartPage.setVisible(true);
				SettingPage.setVisible(false);
				BackButton.setVisible(false);
				CompleteButton.setVisible(false);
				
			}
			
		});
		
	}
}