package CriandoMouseTrackFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseTrackerFrame extends JFrame {
	private JPanel mousePanel;
	private JLabel statusBar;

	public MouseTrackerFrame() {
		super("Eventos do mouse");

		mousePanel = new JPanel();
		mousePanel.setBackground(Color.white);
		add(mousePanel, BorderLayout.SOUTH);

		statusBar = new JLabel("Status dos eventos do mouse");
		add(statusBar, BorderLayout.SOUTH);

		// cria e registra listener para mouse e eventos de movimento de mouse
		MouseHandler handler = new MouseHandler();
		mousePanel.addMouseListener(handler);
		mousePanel.addMouseMotionListener(handler);
	}

	private class MouseHandler implements MouseListener, MouseMotionListener {

		public void mouseClicked(MouseEvent event) {
			statusBar.setText(String.format("Clicked at[%d, %d]", event.getX(), event.getY()));
		}

		// trata evento quando o mouse é pressionado
		public void mousePressed(MouseEvent event) {
			statusBar.setText(String.format("Pressionado : [%d , %d]", event.getX(), event.getY()));

		}

		public void mouseReleased(MouseEvent event) {
			statusBar.setText(String.format("Liberado : [%d , %d]", event.getX(), event.getY()));

		}

		public void mouseEntered(MouseEvent event) {
			statusBar.setText(String.format("Liberado : [%d , %d]", event.getX(), event.getY()));
			mousePanel.setBackground(Color.GREEN);
		}

		public void mouseExited(MouseEvent event) {
			statusBar.setText(String.format("Liberado : [%d , %d]", event.getX(), event.getY()));

		}

		public void mouseDragged(MouseEvent event) {
			statusBar.setText(String.format("Liberado : [%d , %d]", event.getX(), event.getY()));

		}

		public void mouseMoved(MouseEvent event) {
			statusBar.setText(String.format("Liberado : [%d , %d]", event.getX(), event.getY()));

		}

	}

}