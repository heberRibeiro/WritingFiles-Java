package aplication;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Nome do arquivo de saída: ");
		String nomeArq = sc.next();

		String[] linhas = new String[] {
				"Primeira linha a ser inserida no arquivo",
				"Segunda linha a ser inserida no arquivo",
				"Terceira linha a ser inserida no arquivo"
		};
		
		String path = "..\\writingFiles-java\\" + nomeArq + ".txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for(String linha : linhas) {
				bw.write(linha);
				bw.newLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
