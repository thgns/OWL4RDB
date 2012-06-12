package janus.application;

import janus.ImageURIs;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class JanusWindow extends JFrame {
	public JanusWindow() {
		buildUI();
		
		setUpEventHandlers();
	}
	
	private void setUpEventHandlers() {
		setUpWindowHandler();
	}
	
	private void setUpWindowHandler() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void buildUI() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int frameWidth = screenSize.width / 3 * 2;
		int frameHeight = screenSize.height / 3 * 2;
		setBounds((screenSize.width - frameWidth) >> 1, (screenSize.height - frameHeight) >> 1, frameWidth, frameHeight);
		
		setIconImage(new ImageIcon(ImageURIs.LOGO).getImage());
		
		setTitle("Janus");
	}
}