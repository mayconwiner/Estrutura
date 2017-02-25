package CriandoBottonFrame;

import javax.swing.JFrame;

public class JButtonFrameTeste {

	public static void main(String[] args) {
		ButtonFrame janela = new ButtonFrame();//Cria a Janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(275,110);//configura o tamanho do frame
		janela.setVisible(true);
	}

}
