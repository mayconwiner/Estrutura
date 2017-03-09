package CriandoGridLayout;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutFrame extends JFrame implements ActionListener {
	private JButton[] botoes; //array de botoes 
	private static final String[] nomes = {"Um", "Dois","Trez","Quatro","Cinco","Seis"};
	private boolean alterna = true;//alterna entre dois layouts
	private Container  container;//container do frame
	private GridLayout gridLayout1;//primeiro grid
	private GridLayout gridLayout2;//segundo grid
	
	//consntrutor sem argumentos 
	public GridLayoutFrame()
	{
		gridLayout1 = new GridLayout(2,3,5,5);//2 por 3; lacunas de 5
		gridLayout2 = new GridLayout(3,2); //3 por 2/ nenhuma lacuna
		container = getContentPane();//obtem painel de conteudo 
		setLayout(gridLayout1);//configura o layout JFrame
		botoes = new JButton[nomes.length];//cria array de JButtons
		
		for (int count = 0; count < nomes.length; count++)
		{
			botoes[count] = new JButton(nomes[count]);
			botoes[count].addActionListener(this);//ouvinte registrado
			add(botoes[count]);//adiciona o botao ao JFrame
		}//for final
	}//fim construtor
	
	//trata eventos de botao alternando entre layouts 
	public void actionPerformed(ActionEvent Event)
	{
		if (alterna)
			container.setLayout(gridLayout2);//configura layout como segundo
		else
			container.setLayout(gridLayout1);//configura layout como primeiro
		
		alterna = !alterna;//alterna para o valor oposto
		container.validate();//refaz o layout do conteiner
	}
	
}
