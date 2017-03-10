package CriandoGridLayout;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelFrame extends JFrame {
	private JPanel painelJPanel;//painel para armazenar botões 
	private JButton[] botoes; //arrray de botões
	
	//construtor sem argumentos 
	public PanelFrame(){
		super("Panel Demonstração");
		botoes = new JButton[5]; //cria botões de array
		painelJPanel= new JPanel();
		painelJPanel.setLayout(new GridLayout(1,botoes.length));
		
		//cria e adiciona botões
		for (int contador = 0; contador < botoes.length; contador++)
		{
			botoes[contador] = new JButton("Botões " + (contador + 1));
			painelJPanel.add(botoes[contador]);//adiciona botao ao painel
		}
		add(painelJPanel, BorderLayout.SOUTH);//adiciona painel ao JFrame
		
	}
}
