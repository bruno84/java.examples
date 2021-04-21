package pack2_listas_encadeadas;

import java.util.Scanner;

public class MainEx01Listas 
{
	private static Scanner scanner = new Scanner( System.in ); 
	
	public static void main(String[] args) 
	{
		String nome;
		String result;
		int idCrit;
		int opcao = -1;
		
		//MyInterfaceList<String> lista1 = new MyLinkedListSingly<String>();
		MyInterfaceList<String> lista1 = new MyLinkedListDouble<String>();
		
	    do 
	    {
	    	System.out.println("\n");
			System.out.println("MENU: Lista simplesmente encadeada \n");
			
	        System.out.println("1-Percorrer");
	        System.out.println("2-Consultar Inicio");
	        System.out.println("3-Consultar Fim");
	        System.out.println("4-Inserir no Inicio");
	        System.out.println("5-Inserir no Fim");	        
	        System.out.println("6-Inserir (depois de...)");
	        System.out.println("7-Buscar Elemento");
	        System.out.println("8-Remover do Inicio");
	        System.out.println("9-Remover do Fim");
	        System.out.println("10-Remover por ID");
	        System.out.println("0-Sair \n");
	        
	        System.out.println("Qual sua opcao? ");
	        opcao = scanner.nextInt();
	        scanner.nextLine();
	        System.out.println("\n");

	        switch(opcao)
	        {
	        
	            case 1: System.out.println("PERCORRER \n");
	            		lista1.show();
	                    break;
	        
	                    
		        case 2: System.out.println("CONSULTAR INICIO \n");
		        		result = lista1.peekFirst();
		                System.out.println("result = " + result + "\n");
		                break;

		        case 3: System.out.println("CONSULTAR FIM \n");
		        		result = lista1.peekLast();
		                System.out.println("result = " + result + "\n");
		                break;
	                    
		                
		        case 4: System.out.println("INSERIR INICIO \n");
						System.out.println("Qual o nome? ");
						nome = scanner.nextLine();
		                lista1.addFirst(nome);
		                break;
		
		        case 5: System.out.println("INSERIR FIM \n");
						System.out.println("Qual o nome? ");
						nome = scanner.nextLine();
		                lista1.addLast(nome);
		                break;
		                
	            case 6: System.out.println("INSERIR DEPOIS DE... \n");
						System.out.println("Qual o nome? ");
						nome = scanner.nextLine();
	                    System.out.println("Inserir depois de qual chave? ");
	                    idCrit = scanner.nextInt();
	                    lista1.addAfter(nome, idCrit);
	                    break;
		                
		                	                    
				case 7: System.out.println("BUSCAR NORMAL \n");
						System.out.println("Qual a chave? ");
						idCrit = scanner.nextInt();
	                    result = lista1.search(idCrit);
	                    System.out.println("result = " + result + "\n");
	                    break;


	            case 8: System.out.println("REMOVER DO INICIO \n");
	            		result = lista1.removeFirst();
	                    System.out.println("result = " + result + "\n");
	                    break;

	            case 9: System.out.println("REMOVER DO FIM \n");
		        		result = lista1.removeLast();
		                System.out.println("result = " + result + "\n");
		                break;

	            case 10: System.out.println("REMOVER... \n");
						System.out.println("Qual a chave? ");
						idCrit = scanner.nextInt();
	                    result = lista1.remove(idCrit);
	                    System.out.println("result = " + result + "\n");
	                    break;

	            case 0: System.out.println("Saindo... \n");
	                    break;

	            default: System.out.println("OPCAO INVALIDA \n");
	                     break;
	        }
	        
	        System.out.println("\n\n");
	    }
	    while(opcao != 0);
	}

}
