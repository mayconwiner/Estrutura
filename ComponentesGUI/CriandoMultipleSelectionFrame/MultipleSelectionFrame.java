package CriandoMultipleSelectionFrame;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class MultipleSelectionFrame extends JFrame {
	private JList listaCores; // lista para exibir cores
	private JList copiaLista; // lista para copar nomes de cor
	private JButton BotaoCopia; // botao para copiar nomes selecionados

	private static final String[] NomesCores = { "Black", "Blue", "Cyan", "Dark Gray", "Gray", "Green", "Light Gray",
			"Margenta", "Orange", "Yellow", "Red", "Pink" };

	// Construtor ListFrame adiciona JScrollPane que contem Jlist ao JFrame
	public MultipleSelectionFrame() {
		super("Multipla Seleção Teste");
		setLayout(new FlowLayout());

		listaCores = new JList(NomesCores);
		listaCores.setVisibleRowCount(5);
		// permite multiplas seleções
		listaCores.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		add(new JScrollPane(listaCores)); //adiciona lista com Scrollpane
		
		BotaoCopia = new JButton("Copia >>>>");// cria botão de copia

		BotaoCopia.addActionListener(// classe interna anônima
				new ActionListener()// classe interna anonima
				{
					// trata evento de botao
					@Override
					public void actionPerformed(ActionEvent evento) {
						copiaLista.setListData(listaCores.getSelectedValues());

					}
				});
		add(BotaoCopia);
		copiaLista = new JList();// armazenar nomes de cores copiados
		copiaLista.setVisibleRowCount(5); // mostra 5 linhas
		copiaLista.setFixedCellWidth(100);// configura a largura
		copiaLista.setFixedCellHeight(15);// configura a altura
		copiaLista.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		add(new JScrollPane(copiaLista));// adiciona lista com scrollpane
	}
}