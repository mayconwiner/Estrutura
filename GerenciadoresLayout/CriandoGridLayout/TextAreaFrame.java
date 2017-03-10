package CriandoGridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TextAreaFrame extends JFrame {
	private JTextArea textArea1;// exibe a string demo
	private JTextArea textArea2;// texto destacado e copiado aqui
	private JButton copyJButton; // começa a copiar o texto

	// construtor sem argumento
	public TextAreaFrame() 
	{
		super("TextArea Demonstração");
		Box box = Box.createHorizontalBox();//cria box
		String demo = "Essa é uma demonstração de caracteres \n" +
		"Ilustrando a copia do texto \n para uma textArea \n" + 
				"outra textArea usando uma \n utilizando evento \n";
		textArea1 = new JTextArea(demo,10,15);//cria textArea1;
		box.add(new JScrollPane(textArea1));//adicina scrollpane
		
		copyJButton = new JButton("Copia >>>");//cria botao de copia 
		box.add(copyJButton);//adiciona o botao de copia a box 
	
		copyJButton.addActionListener(
				new ActionListener() //classe interna anonima
				{
									
					@Override
					public void actionPerformed(ActionEvent evento) {
						textArea2.setText(textArea1.getSelectedText());
						}
				}
				);
		textArea2 = new JTextArea(10,15);//cria segunda textarea 
		textArea2.setEditable(false);//desativa edição
		box.add(new JScrollPane(textArea2));//adiciona scrollpane
		
		add(box);//adiciona box ao frame 
	}
}



