package JTextField;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldFrame extends JFrame {

	private JTextField textField1; // Campo de texto com tamanho configurado
	private JTextField textField2;
	private JTextField textField3;
	private JPasswordField passwordField; // campo para senha com texto.

	// construtor TextFieldName adiciona JTextField a Frame
	public TextFieldFrame() {
		super("Testando JTextField e JPassowrdsField");

		setLayout(new FlowLayout()); // configura o layout do frame

		// constroi textfield com 10 colunas
		textField1 = new JTextField(10);
		add(textField1);

		textField2 = new JTextField("Entre com o texto Aqui !!");
		add(textField2);

		textField3 = new JTextField("campo desabilitado");
		textField3.setEditable(false);
		add(textField3);

		// handlers de evento registradores
		TextFieldHandler handler = new TextFieldHandler();
		textField1.addActionListener(handler);
		textField1.addActionListener(handler);
		textField1.addActionListener(handler);
		passwordField.addActionListener(handler);

	}

	// classe interna privada para tratamento de evento
	private class TextFieldHandler implements ActionListener {
		// processa eventos de campo de texto
		public void actionPerformed(ActionEvent event) {
			String string = "";

			// usuario preciona enter no JTextField textField1
			if (event.getSource() == textField1)
				string = String.format("Texto 1: %s", event.getActionCommand());
			// usuario preciona enter no JTextField textField2
			else if (event.getSource() == textField2)
				string = String.format("Texto 2 : %s", event.getActionCommand());
			else if (event.getSource() == textField3)
				string = String.format("Texto 3 : ", event.getActionCommand());
			else if (event.getSource() == passwordField)
				string = String.format("Senha %s", event.getActionCommand());

			// exibe o conteudo de JtextField
			JOptionPane.showMessageDialog(null, string);
		}// fim do metodo ActionPerformed
	}// fim da classe TextFieldHandler interna private
}// fim da classe TextFieldFrame
