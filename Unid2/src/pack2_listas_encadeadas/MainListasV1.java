package pack2_listas_encadeadas;

import java.util.Scanner;

import pack2_listas_encadeadas.comum.MyClass;
import pack2_listas_encadeadas.comum.MyInterfaceListV1;
import pack2_listas_encadeadas.simples.MyLinkedListSinglyV1;

public class MainListasV1 
{
	private static Scanner scanner = new Scanner( System.in ); 
	
	public static void main(String[] args) 
	{		
		int opcao = -1;
		
		MyInterfaceListV1<MyClass> listaSimples = new MyLinkedListSinglyV1<MyClass>();
		//MyInterfaceListV1<MyClass> listaDupla = new MyLinkedListDoubleV1<MyClass>();
		
		String nome;
		int inteiro;
		MyClass myClassNovo;
		MyClass myClassCrit;
		
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
	        System.out.println("11-Percorrer reverso");
	        System.out.println("0-Sair \n");
	        
	        System.out.println("Qual sua opcao? ");
	        opcao = scanner.nextInt();
	        scanner.nextLine();
	        System.out.println("\n");

	        switch(opcao)
	        {
	            case 1: System.out.println("PERCORRER \n");
	            		listaSimples.show();
	                    break;
	        
	                    
		        case 2: System.out.println("CONSULTAR INICIO \n");
		                System.out.println("result = " + listaSimples.peekFirst() + "\n");
		                break;

		        case 3: System.out.println("CONSULTAR FIM \n");
		                System.out.println("result = " + listaSimples.peekLast() + "\n");
		                break;
	                    
		                
		        case 4: System.out.println("INSERIR INICIO \n");
		        		System.out.println("Qual o inteiro? ");
		        		inteiro = scanner.nextInt();
		        		scanner.nextLine(); // limpar buffer
						System.out.println("Qual o nome? ");
						nome = scanner.nextLine();
						myClassNovo = new MyClass(inteiro, nome);
		                listaSimples.addFirst(myClassNovo);
		                break;
		
		        case 5: System.out.println("INSERIR FIM \n");
		        		System.out.println("Qual o inteiro? ");
		        		inteiro = scanner.nextInt();
		        		scanner.nextLine(); // limpar buffer
						System.out.println("Qual o nome? ");
						nome = scanner.nextLine();
						myClassNovo = new MyClass(inteiro, nome);
		                listaSimples.addLast(myClassNovo);
		                break;
		                
	            case 6: System.out.println("INSERIR DEPOIS DE... \n");
		        		System.out.println("Qual o inteiro? ");
		        		inteiro = scanner.nextInt();
		        		scanner.nextLine(); // limpar buffer
						System.out.println("Qual o nome? ");
						nome = scanner.nextLine();
						myClassNovo = new MyClass(inteiro, nome);
	                    System.out.println("Inserir depois de qual criterio? ");
	                    inteiro = scanner.nextInt();
	                    myClassCrit = new MyClass(inteiro, "");
	                    listaSimples.addAfter(myClassNovo, myClassCrit);
	                    break;
		                
		                	                    
				case 7: System.out.println("BUSCAR NORMAL \n");
						System.out.println("Qual o criterio? ");
	                    inteiro = scanner.nextInt();
	                    myClassCrit = new MyClass(inteiro, "");
	                    System.out.println("result = " + listaSimples.search(myClassCrit) + "\n");
	                    break;


	            case 8: System.out.println("REMOVER DO INICIO \n");
	                    System.out.println("result = " + listaSimples.removeFirst() + "\n");
	                    break;

	            case 9: System.out.println("REMOVER DO FIM \n");
		                System.out.println("result = " + listaSimples.removeLast() + "\n");
		                break;

	            case 10: System.out.println("REMOVER... \n");
						System.out.println("Qual o criterio? ");
		                inteiro = scanner.nextInt();
		                myClassCrit = new MyClass(inteiro, "");
	                    System.out.println("result = " + listaSimples.remove(myClassCrit) + "\n");
	                    break;
	                    
	            case 11: System.out.println("PERCORRER REVERSO (Lista Dupla)\n");
        				listaSimples.showReverse();
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
