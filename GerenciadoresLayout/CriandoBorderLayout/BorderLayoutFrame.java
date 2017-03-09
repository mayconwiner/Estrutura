package CriandoBorderLayout;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class BorderLayoutFrame extends JFrame implements ActionListener {
	private JButton[] botoes; // aray de botoes para ocultar partes
	private static final String[] nomes = {"Ocultar Norte", "Ocultar Sul", "Ocultar Leste", 
			"Ocultar Oeste", "Ocultar Centro" };
	private BorderLayout layout; //objeto borderLayout
	
	//configura GUI e tratamento de evento
	
	public BorderLayoutFrame()
	{
		super("BorderLayout Demonstração");
		
		layout = new BorderLayout(5,5);// espaço de 5 pixels
		setLayout(layout);//configura o layout de frame
		botoes = new JButton[nomes.length];//configura o tamanho do array 
		
		//cria JButtons e registra ouvintes para eles  
		for (int count = 0; count < nomes.length; count++)
		{
			botoes[count] = new JButton(nomes[count]);
			botoes[count].addActionListener(this);
		}//for final
		
		add(botoes[0],BorderLayout.NORTH); //adiciona botao para o norte
		add(botoes[1],BorderLayout.SOUTH); //adiciona botao para o sul
		add(botoes[2],BorderLayout.EAST); //botao para o leste
		add(botoes[3],BorderLayout.WEST); //Oeste
		add(botoes[4],BorderLayout.CENTER); //Centro
	}
	
	public void actionPerformed(ActionEvent evento)
	{
		//verifica a origem de evento e o painel de conteudo de layout correspondente 
		for (JButton button: botoes)
		{
			if(evento.getSource() == button)
			button.setVisible(false);//oculta o botao clicado
		else
				button.setVisible(true);//mostra outros botoes 
		}//for final
		
		layout.layoutContainer(getContentPane());//faz o layout do painel de conteudo
	}
	
	
}
