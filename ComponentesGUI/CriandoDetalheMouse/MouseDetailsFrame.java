package CriandoDetalheMouse;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseDetailsFrame extends JFrame {
	private String detalhes;
	private JLabel statusBar;

	public MouseDetailsFrame() {
		super("Mouse clickes e botões");

		statusBar = new JLabel("Click o Mouse");
		add(statusBar, BorderLayout.SOUTH);
		addMouseListener(new handlemouse());// adiciona handler
	}// Fim do construtor

	// Classe interna para tratar evento do mouse
	private class handlemouse extends MouseAdapter {
		// trata evento de clique de mouse e determina qual botao foi
		// pressionado
		public void mouseClicked(MouseEvent evento) {
			int xpos = evento.getX(); // obtem a posição X
			int ypos = evento.getY(); // obterm a posição Y

			detalhes = String.format("Clicado  %d vez(s)", evento.getClickCount());

			if (evento.isMetaDown()) // botão direito domouse
				detalhes += "Botão Direito do mouse";
			else if (evento.isAltDown())
				detalhes += "Botão do meio do mouse";
			else // botao esquerdo do mouse
				detalhes += "Botão esquerdo do mouse";
			
			
			statusBar.setText(detalhes);//exibe mensagem em statusbar
		}//fim do mouseclicked
	}//fim da classe interna private MouseClickHandler

}//fim da classe MouseDetailsFrame 
