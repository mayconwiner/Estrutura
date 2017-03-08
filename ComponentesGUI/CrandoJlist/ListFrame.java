package CrandoJlist;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListFrame extends JFrame {
	private JList listaCores; // lista para exibir cores

	private static final String[] NomesCores = { "Black", "Blue", "Cyan", "Dark Gray", "Gray", "Green", "Light Gray",
			"Margenta", "Orange", "Yellow", "Red", "Pink" };
	
	private static final Color[] cores = { Color.BLACK, Color.blue, Color.cyan, Color.DARK_GRAY, Color.gray,
			Color.GREEN, Color.LIGHT_GRAY, Color.magenta, Color.orange, Color.yellow, Color.red, Color.PINK };

	// Construtor ListFrame adiciona JScrollPane que contem Jlist ao JFrame
	public ListFrame() {
		super("Lista Teste");
		setLayout(new FlowLayout());

		listaCores = new JList(NomesCores);
		listaCores.setVisibleRowCount(5);

		// Não permite multiplas seleções
		listaCores.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		// adiciona um JScrollPane que contem JList ao Frame
		add(new JScrollPane(listaCores));

		
		// Classe // interna // Anônima
		listaCores.addListSelectionListener(new ListSelectionListener()

		{

			@Override
			public void valueChanged(ListSelectionEvent evento) {
				getContentPane().setBackground(cores[listaCores.getSelectedIndex()]);
			}
		});

	}
}
