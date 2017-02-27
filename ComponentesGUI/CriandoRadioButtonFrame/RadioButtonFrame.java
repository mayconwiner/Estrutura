package CriandoRadioButtonFrame;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioButtonFrame extends JFrame {
	private JTextField textField; // exibir alterações da fonte
	private Font plainFont; // fonte para textos simples
	private Font negritofont;
	private Font italicoFonte;
	private Font negroItalicoFonte;
	private JRadioButton plainJRadioButton; // seleciona textos simples
	private JRadioButton negritoRadioButton;
	private JRadioButton italicoRadioButton;
	private JRadioButton negroItalicoRadioButton;
	private ButtonGroup radioGroup; // buttongroup para armazenar botoes de
									// opção

	// Construtor RadioButtonFrame adiciona JRadioButton ao JFrame
	public RadioButtonFrame() {
		super("RadioButton Tete");
		setLayout(new FlowLayout());// configura o layout do frame

		textField = new JTextField("Marque a fonte e o Stilo desejado");
		add(textField);

		// Cria os botões
		plainJRadioButton = new JRadioButton("Simpes", true);
		negritoRadioButton = new JRadioButton("Negrito", false);
		italicoRadioButton = new JRadioButton("Italico", false);
		negroItalicoRadioButton = new JRadioButton("Negrito/Italico", false);
		add(plainJRadioButton);
		add(negritoRadioButton);
		add(italicoRadioButton);
		add(negroItalicoRadioButton);

		// Cria relacionamento logico entre JRadioButton
		radioGroup = new ButtonGroup(); // Cria ButtonGroup
		radioGroup.add(plainJRadioButton); // adiciona ao grupo
		radioGroup.add(negritoRadioButton);
		radioGroup.add(italicoRadioButton);
		radioGroup.add(negroItalicoRadioButton);

		// cria fonte objetos
		plainFont = new Font("Serif", Font.PLAIN, 14);
		negritofont = new Font("Serif", Font.BOLD, 14);
		italicoFonte = new Font("Serif", Font.ITALIC, 14);
		negroItalicoFonte = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
		textField.setFont(plainFont);

		// registra os eventos para JRadioButtons
		plainJRadioButton.addItemListener(new RadioButtonHandler(plainFont));
		negritoRadioButton.addItemListener(new RadioButtonHandler(negritofont));
		italicoRadioButton.addItemListener(new RadioButtonHandler(italicoFonte));
		negroItalicoRadioButton.addItemListener(new RadioButtonHandler(negroItalicoFonte));

	}// Fim do Construtor RadioButtonFrame

	// Classe interna privada para tratar eventos de botao de opção
	private class RadioButtonHandler implements ItemListener {
		private Font fonte; // fonte associada com esse listener

		public RadioButtonHandler(Font f)
		{
			fonte = f; // configura a fonte desse listener

		}// Fim do construtor RadioButtonHandler
			
		
		// trata evento de botão de opção
		public void itemStateChanged(ItemEvent evento) {
			textField.setFont(fonte);// configura fonte de textField;
		}

	}

}
