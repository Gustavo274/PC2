package q2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LerArquiv {
	public static void main(String[] args) {
		TradutorDialeto t = new TradutorDialeto();
		String arqEntrada;
		String linha = "";
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o nome do arquivo: ");
		arqEntrada = s.next();
		arqEntrada += ".txt";
		
		BufferedReader arquivo = null;
		

		try {
			arquivo = new BufferedReader(new FileReader(arqEntrada));
			while (arquivo.ready()) {
				linha = arquivo.readLine();
				linha = t.traduzir(linha);
				System.out.println(linha);
			}
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
