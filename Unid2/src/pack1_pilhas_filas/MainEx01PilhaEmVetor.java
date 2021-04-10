package pack1_pilhas_filas;

public class MainEx01PilhaEmVetor 
{

	public static void main(String[] args) 
	{
		int retorno;
		
		MyStackArray<Integer> pilha1 = new MyStackArray<Integer>(3);

		pilha1.push(3);
		pilha1.push(5);
		pilha1.push(7);
		//pilha1.push(12); // nao vai dar certo!

		retorno = pilha1.peek();
		System.out.println("elemento no topo = " + retorno);
		
		pilha1.show();
		
		retorno = pilha1.pop();
		System.out.println("desempilhado = " + retorno);

		retorno = pilha1.pop();
		System.out.println("desempilhado = " + retorno);

		retorno = pilha1.pop();
		System.out.println("desempilhado = " + retorno);

		//retorno = pilha1.pop(); // nao vai dar certo!
		//System.out.println("desempilhado = " + retorno);	
		
		pilha1.show();
		
		pilha1.isFull();
		
		pilha1.isEmpty();
	}
	
}