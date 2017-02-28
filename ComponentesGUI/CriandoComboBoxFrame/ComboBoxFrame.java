package CriandoComboBoxFrame;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxFrame extends JFrame {
	private JComboBox imagesJComboBox; //caixa de combinação para armazenar nomes de icones 
	private JLabel label; //rotulo para exibir icone selecionado 
	
	private static final String[]nomes = 
		{"ajax.gif","alert_lrg.gif","delete.gif","down.gif"};
	
	private Icon[] icones = {
        new ImageIcon(getClass().getResource(nomes[0])),
		new ImageIcon(getClass().getResource(nomes[1])),
		new ImageIcon(getClass().getResource(nomes[2])),
		new ImageIcon(getClass().getResource(nomes[3]))};
	//construtor comboBoxFrame adiciona JComboBox ao JFrame
	public ComboBoxFrame(){
		super("Tetando JCombobox");
		setLayout(new FlowLayout());//configura o layout de frame
		
		imagesJComboBox = new JComboBox(nomes); //configura JCombobox
		imagesJComboBox.setMaximumRowCount(3);//exibe tres linhas
		
		imagesJComboBox.addItemListener(
				new ItemListener() //classe interna anônima
				{
					//trata evento JComboBox
					@Override
					public void itemStateChanged(ItemEvent evento) 
					{
						//determina se o ítem selecionado
						if (evento.getStateChange() == ItemEvent.SELECTED)
							label.setIcon(icones[imagesJComboBox.getSelectedIndex()]);
						}
				}
);
		add(imagesJComboBox); //adiciona JCombobox ao frame
		label = new JLabel(icones[0]);//exibe o primeiro icone
		add(label); //adiciona rotulo ao JFrame
	}
}

		









