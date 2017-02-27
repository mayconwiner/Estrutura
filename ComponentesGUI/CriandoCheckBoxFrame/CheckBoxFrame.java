package CriandoCheckBoxFrame;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class CheckBoxFrame extends JFrame {
	private JTextField textField; // exibie o texto na alteração de fontes
	private JCheckBox negritoCheckBox;// para selecionar negrito
	private JCheckBox italicoCheckBox; // Para Italico 

	// Construtor CheckbosFrame adiciona Jcheckbox ao Jframe
	public CheckBoxFrame() {
		//super("JCheckBox teste");
		setLayout(new FlowLayout()); // configura o layout do frame

		// configura o JtextField e sua fonte
		textField = new JTextField("Qual o estilo da fonte", 23);
		textField.setFont(new Font("Serif", Font.PLAIN, 14));
		add(textField);

		negritoCheckBox = new JCheckBox("Negrito");
		italicoCheckBox = new JCheckBox("Italico"); 
		add(negritoCheckBox);
		add(italicoCheckBox);

		CheckBoxHandler handler = new CheckBoxHandler();
		negritoCheckBox.addItemListener(handler);
		italicoCheckBox.addItemListener(handler);

	}

	private class CheckBoxHandler implements ItemListener
	{

		public void itemStateChanged(ItemEvent event) {
			Font font = null; //armazena a nova fonte
			
			//determina que checkboxes estão marcados e cria a font
			
			if (negritoCheckBox.isSelected()&& italicoCheckBox.isSelected())
				font = new Font("Serif",Font.BOLD  + Font.ITALIC,15);
			else if (negritoCheckBox.isSelected())
				font = new Font("Serif",font.BOLD,14);
			else if (italicoCheckBox.isSelected())
				font = new Font("Serif",font.ITALIC,14);
			else
				font = new Font("Serif",Font.PLAIN,14);
			textField.setFont(font); // configura a fonte do TextField
		}//fim metodo
	}//fim classe checkboxhandler
}//fim da classe CheckBoxFrame
