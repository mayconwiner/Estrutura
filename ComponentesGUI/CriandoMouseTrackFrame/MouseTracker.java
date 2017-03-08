package CriandoMouseTrackFrame;

import javax.swing.JFrame;

public class MouseTracker {

	public static void main(String[] args) {
		MouseTrackerFrame trackerFrame = new MouseTrackerFrame();
		trackerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		trackerFrame.setSize(300, 100);
		trackerFrame.setVisible(true);

	}

}
