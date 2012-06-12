package janus;

import janus.application.JanusWindow;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Janus {
	
	public static void main (String[] args) {
		Splash splash = new Splash(ImageURIs.SPLASH, ImageURIs.LOGO);
		splash.setVisible(true);
		
		setLookAndFeel();
		
		JanusWindow mainWindow = new JanusWindow();
		splash.dispose();
		mainWindow.setVisible(true);
	}
	
	private static void setLookAndFeel() {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager
							.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				} catch (InstantiationException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (UnsupportedLookAndFeelException e) {
					e.printStackTrace();
				}
			}
		});
	}
}