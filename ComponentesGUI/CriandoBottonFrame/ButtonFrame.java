package CriandoBottonFrame;

import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame {
	private JButton plainButton; //bot�o apenas com texto
	private JButton fancyJButton; // bot�o com icones
	
	//ButtonFrame adiciona JButtons ao JFrame
	public ButtonFrame(){
		super("Testando Bott�es");
		setLayout(new FlowLayout());//Configura o Layout de Frame 
		
		plainButton  = new JButton("Bot�o com Texto OK!");
		add(plainButton);
		
		Icon ajax = new ImageIcon(getClass().getResource("bug1.gif"));
		Icon alerta = new ImageIcon(getClass().getResource("bug2.gif"));
		fancyJButton = new JButton("Bot�o com imagem ", ajax);//configura a imagem
		fancyJButton.setRolloverIcon(alerta);//configura a imagem de rellover 
		add(fancyJButton); // adiciona fancyJButton ao frame
		
		
		//cria um novo ButtonHandler para tratamento de evento de bot�o 
		ButtonHandler handler = new ButtonHandler();
		fancyJButton.addActionListener(handler);
		plainButton.addActionListener(handler);
	}
	
		//classe interna para tratamento de evento de bot�o 
		private class ButtonHandler implements ActionListener
		{
			//trata evento de bot�o 
			public void actionPerformed(ActionEvent evento)
			{
				JOptionPane.showMessageDialog(ButtonFrame.this, 
						String.format("Voc� pressionou: %s",evento.getActionCommand()));
			}
		}
	
}
