package pack1_inicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainEx10ArquivoTexto 
{

	public static void main(String[] args) 
	{
		String path = "temp/arquivo_texto.txt"; 	// arquivo sera criado na pasta (temp) ja criada dentro do projeto.
		//String path = "arquivo.txt"; 		// arquivo sera criado na raiz do projeto.
		//String path = "/temp/arquivo.txt"; 	// arquivo criado na pasta (temp) ja criada na mesma unidade (C, D, etc) do projeto.
		//String path = "/arquivo.txt"; 		// arquivo sera criado na raiz da mesma unidade (C, D, etc) do projeto.

		String textoInput = "A\nB";
		String textoOutput;
		
		
		try {
			escritor(path, textoInput);
		} catch (IOException e) {
			System.out.println("Erro na escrita");
			e.printStackTrace();
		}
		
		
		try {
			textoOutput = leitor(path);
			System.out.print(textoOutput);
		} catch (IOException e) {
			System.out.println("Erro na leitura");
			e.printStackTrace();
		}
		
	}





	public static String leitor(String path) throws IOException 
	{
		BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
		
		StringBuffer sbResult = new StringBuffer();
		String linha = "";
		
		while (linha != null) 
		{
			sbResult.append(linha+"\n");
			linha = bufferedReader.readLine();
		}
		bufferedReader.close();
		
		return sbResult.toString();
	}

	
	public static void escritor(String path, String texto) throws IOException 
	{
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
		bufferedWriter.append(texto);
		bufferedWriter.close();
	}
	
}
