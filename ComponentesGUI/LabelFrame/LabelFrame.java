package LabelFrame;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelFrame extends JFrame {
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	
	//Construtor LabelFrame adiciona JLabels a JFrame
	public LabelFrame(){
		super( "testando JLabel");
	//Construtor JLabel com um argumento de String
		label1 = new JLabel("Label com argumento");
		label1.setToolTipText("Isso é uma labe l");
		add(label1);
		
		//construtor JLabel com String , icones e arqumentos
		Icon bug = new ImageIcon(getClass().getResource("bug1.png"));
		label2 = new JLabel("Label com o icone",bug,SwingConstants.LEFT);
		label2.setToolTipText("esse é o label 2 ");
		add(label2); // adiciona label 2 ao frame
		
		
		label3 = new JLabel();
		label3.setText("Label com icone e botao");
		label3.setIcon(bug);
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		label3.setToolTipText("Esse é o Label 3");
		add(label3); // adiciona Label3 ao JFrame
	
	}//fim do construtor LabelFrame
	
} // fim da classe
