package janus;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
class Splash extends JFrame {
	Splash(String splash, String logo) {
		buildUI(splash, logo);
	}
	
	private void buildUI(String splash, String logo) {
		Icon ii = new ImageIcon(splash);
		int imageWidth = ii.getIconWidth();
		int imageHeight = ii.getIconHeight();
		
		setContentPane(new JLabel(ii));
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds((screenSize.width - imageWidth) >> 1, (screenSize.height - imageHeight) >> 1, imageWidth, imageHeight);
		
		setUndecorated(true);
		setIconImage(new ImageIcon(logo).getImage());
	}
}
