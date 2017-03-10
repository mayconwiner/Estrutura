package CriandoGridLayout;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelFrame extends JFrame {
	private JPanel painelJPanel;//painel para armazenar bot�es 
	private JButton[] botoes; //arrray de bot�es
	
	//construtor sem argumentos 
	public PanelFrame(){
		super("Panel Demonstra��o");
		botoes = new JButton[5]; //cria bot�es de array
		painelJPanel= new JPanel();
		painelJPanel.setLayout(new GridLayout(1,botoes.length));
		
		//cria e adiciona bot�es
		for (int contador = 0; contador < botoes.length; contador++)
		{
			botoes[contador] = new JButton("Bot�es " + (contador + 1));
			painelJPanel.add(botoes[contador]);//adiciona botao ao painel
		}
		add(painelJPanel, BorderLayout.SOUTH);//adiciona painel ao JFrame
		
	}
}
