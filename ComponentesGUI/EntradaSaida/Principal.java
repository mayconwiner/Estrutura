package EntradaSaida;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		String primeiroNumero1 = JOptionPane.showInputDialog("Entre com o primeiro numero");
		String segundoNumero2 = JOptionPane.showInputDialog("Entre com o segundo numero");
		
		int primeiro = Integer.parseInt(primeiroNumero1);
		int segundo = Integer.parseInt(segundoNumero2);
		
		
		int soma = primeiro + segundo;
		
		JOptionPane.showMessageDialog(null,"O valor é : " + soma);
		

	}

}









//~/workspace/EstruturaDeDados/estruturadados-algoritmos-java