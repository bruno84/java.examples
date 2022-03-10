package pack1_inicio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainEx11ArquivoBinario
{

	public static void main(String[] args) 
	{
		String path = "temp/arquivo_binario.dat"; 	// arquivo sera criado na pasta (temp) ja criada dentro do projeto.
		//String path = "arquivo.txt"; 				// arquivo sera criado na raiz do projeto.
		//String path = "/temp/arquivo.txt"; 		// arquivo criado na pasta (temp) ja criada na mesma unidade (C, D, etc) do projeto.
		//String path = "/arquivo.txt"; 			// arquivo sera criado na raiz da mesma unidade (C, D, etc) do projeto.

		
		// ESCRITA
		
		List<Object> listInput  = new ArrayList<Object>();
		
		// OBS: MyClass deve implementar a interface Serializable.
		MyClass obj1 = new MyClass(10, "Ana");
		MyClass obj2 = new MyClass(20, "Bruno");
		MyClass obj3 = new MyClass(30, "Clara");

		listInput.add(obj1);
		listInput.add(obj2);
		listInput.add(obj3);

		try {
			escritor(path, listInput);
		} catch (IOException e) {
			System.out.println("Erro na escrita");
			e.printStackTrace();
		}


		// LEITURA
		
		try {
			List<Object> listOutput = leitor(path);
			
			for (Object object : listOutput) 
			{
				MyClass myObj = (MyClass) object;
				System.out.print( myObj.toString() );
			}
			
		} catch (IOException e) {
			System.out.println("Erro na leitura: IOException");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Erro na leitura: ClassNotFoundException");
			e.printStackTrace();
		}
		
	}


	
	public static void escritor(String path, List<Object> lista) throws IOException 
	{
		File file = new File(path);
    	file.delete();
        file.createNewFile();

        ObjectOutputStream objOutput = new ObjectOutputStream(new FileOutputStream(file));
        
        objOutput.writeObject(lista);
        objOutput.close();
	}
	
	
	


	@SuppressWarnings("unchecked")
	public static List<Object> leitor(String path) throws IOException, ClassNotFoundException 
	{
		List<Object> lista = new ArrayList<Object>();
		
		File file = new File(path);
	    
		if(file.exists()) 
		{
			ObjectInputStream objInput = new ObjectInputStream(new FileInputStream(file));
			lista = (ArrayList<Object>) objInput.readObject();
	        objInput.close();
		}
		
		return lista;
	}

	

		
}


