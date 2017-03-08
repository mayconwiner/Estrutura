package CriandoFlowLayout;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutFrame extends JFrame {
	private JButton esquerdaJButton; // alinhamento a esquerda
	private JButton centroJButton; // alinhamento centralizado
	private JButton direitaJButton; // alinhamento a direit a
	private FlowLayout layout; // objeto de layout
	private Container container; // contêiner para configurar layout

	// configura GUI para registra listeners de botão
	public FlowLayoutFrame() {
		super("FlowLayout Demonstração");

		layout = new FlowLayout();// cria FlowLayout
		container = getContentPane();// obtém contêiner para layout
		setLayout(layout);// configura o layout de frame

		// configura leftJButton e registra listener
		esquerdaJButton = new JButton("Esquerda"); // cria botao esquerdo
		add(esquerdaJButton);// adiciona o botao esquerdo ao frame

		esquerdaJButton.addActionListener(

				new ActionListener() // classe interna anônima
				{

					@Override // processa o evento esquerdaJButon
					public void actionPerformed(ActionEvent evento) {
						layout.setAlignment(FlowLayout.LEFT);

						// realinha os componentes anexados
						layout.layoutContainer(container);
					}
				});
		// configura centerJButton e registra o listener
		centroJButton = new JButton("Centro");// cria o botão center
		add(centroJButton);// adiciona botão center ao frame
		centroJButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evento) {
				layout.setAlignment(FlowLayout.CENTER);

				// realinha os componentes anexados
				layout.layoutContainer(container);

			}
		});

		direitaJButton = new JButton("Direito");
		add(direitaJButton);
		direitaJButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				layout.setAlignment(FlowLayout.RIGHT);

				layout.layoutContainer(container);

			}
		});
	};
};