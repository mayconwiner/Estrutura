package CriandoEventosTeclas;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JTextArea;

//Demonstrando os eventos de pressionamento de tecla . 
public class KeyDemoFrame extends JFrame implements KeyListener {
	private String linha1;
	private String linha2;
	private String linha3;
	private JTextArea textArea;

	public KeyDemoFrame() {
		textArea = new JTextArea(10, 15);
		textArea.setText("Pressione uma tecla do teclado");
		textArea.setDisabledTextColor(Color.BLACK);
		add(textArea);

		addKeyListener(this);// permite que o frame processe eventos do teclado
	}
	// trata evento de qualquer tecla

	@Override
	public void keyPressed(KeyEvent evento) {
		linha1 = String.format("Tecla pressionada %s", KeyEvent.getKeyText(evento.getKeyCode()));// mostra
																									// a
																									// tecla
																									// pressionada
		setLinhas2and3(evento);

	}

	@Override
	public void keyReleased(KeyEvent evento) {
		linha1 = String.format("Tecla pressionada %s", KeyEvent.getKeyText(evento.getKeyCode()));// mostra
																									// a
																									// tecla
																									// pressionada
		setLinhas2and3(evento);

	}

	@Override
	public void keyTyped(KeyEvent evento) {
		linha1 = String.format("Tecla pressionada %s", evento.getKeyChar());
		setLinhas2and3(evento);

	}
	//configura a segunda e terceira linhas de saida 
	private void setLinhas2and3(KeyEvent evento) {
		linha2 = String.format("this key is %s an action key ",
				(evento.isActionKey() ? "": "not"));
		String temp = KeyEvent.getKeyModifiersText(evento.getModifiers());
		
		linha3 = String.format("Modifier keys pressed: %s",
				(temp.equals("") ? "none": temp));//modificadores de saida 
		
		textArea.setText(String.format("%s \n %s \n %s \n",  linha1,linha2,linha3));//gera a saida de tres linhas de texto
		
		
	}

}
