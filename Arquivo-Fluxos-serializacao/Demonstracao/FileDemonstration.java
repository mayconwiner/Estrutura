package Demonstracao;

import java.io.File;
import java.util.Scanner;

//A classe File utilizada para obter informa��es de arquivo e de diret�rio. 
public class FileDemonstration {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Entre com o arquivo ou diretorio : ");
		analisePath(input.nextLine());
	}

	// exibe informa��es sobre o arquivo que o usuario especifica
	public static void analisePath(String path) {
		// cria o objeto File com base na entrada do usuario
		File nome = new File(path);

		if (nome.exists()) {
			System.out.printf("%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s", nome.getName(), "exists",
					(nome.isFile() ? "um arquivo" : "n�o � um arquivo"),
					(nome.isDirectory() ? "e um diretorio" : "N�o � um diretorio"),
					(nome.isAbsolute() ? "� um Path absoluto" : "N�o � um path absoluto"), nome.lastModified(),
					"Lenght:", nome.length(), "Path", nome.getPath(), "Absolute Path", nome.getAbsolutePath(),
					"Parent  ", nome.getParent());

			if (nome.isDirectory()) {
				String[] diretorio = nome.list();
				System.out.println("\n \n Contudo do diretorio : \n");

				for (String diretorioNome : diretorio) {
					System.out.println(diretorioNome);
				}
			} else {
				System.out.printf("%s %s", path, "N�o Existe");
			}

		}

	}
}