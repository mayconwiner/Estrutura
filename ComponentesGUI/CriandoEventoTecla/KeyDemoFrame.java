package CriandoEventoTecla;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class KeyDemoFrame extends JFrame implements KeyListener {
	private String linha1;
	private String linha2;
	private String linha3;
	private JTextArea textArea;

	public KeyDemoFrame() {
		super("Demonstrando eventos do teclado");

		textArea = new JTextArea(10, 15); // configura o JtextArea
		textArea.setText("Pressione uma teclad o teclado");
		textArea.setEnabled(false);// desativa textarea
		textArea.setDisabledTextColor(Color.black);
		add(textArea);
		
		addKeyListener(this);//permite que o frame processe os eventos do teclado
	}
	
		//trata pressionamento de qualquer tecla
		public void keyPressed(KeyEvent evento){
			linha1 = String.format("Tecla Pressionada %s", KeyEvent.getKeyText(evento.getKeyCode()));
			
		}
		public void keyReleased(KeyEvent evento){
			
		}
		public void keyTyped(KeyEvent evento){
			
		}
	
	
	
	
	
	
	
	
}
