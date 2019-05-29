package q1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LerArqiovo {
	public static void main(String[] args) {
		String arqEntrada, arqSaida;
		String linha = "";
		String novaLinha = "\n";
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o nome do arquivo: ");
		arqEntrada = s.next();
		arqEntrada += ".txt";
		System.out.println(arqEntrada);
		System.out.println("Digite o nome do arquivo de saída: ");
		arqSaida = s.next();
		arqSaida += ".txt";
		File f = new File(arqSaida);
		BufferedReader arquivo = null;
		

		try {
			FileOutputStream fos = new FileOutputStream(f);
			arquivo = new BufferedReader(new FileReader(arqEntrada));
			while (arquivo.ready()) {
				linha = arquivo.readLine();
				System.out.println("Digitie a nota do(a) "+linha+": ");
				linha += " " + s.next();
				fos.write(linha.getBytes());
				fos.write(novaLinha.getBytes());
			}
			fos.close();
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				arquivo.close();
			} catch (NullPointerException e) {
				System.out.println(e.getMessage());
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		s.close();
	}
}
