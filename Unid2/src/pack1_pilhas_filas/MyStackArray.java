package pack1_pilhas_filas;

public class MyStackArray <T> implements MyInterfaceStack <T>
{
	int size;
	private Object[] array;
	int top;
	
	
	public MyStackArray(int size) {
		this.top = -1;
		this.size = size;
		this.array = new Object[size];
	}

	
	public void push(T valor) throws MyException	
	{
		System.out.println("\nEmpilhar...\n");

	    if( top == size-1) {
	        throw new MyException( "\nERRO: pilha cheia [valor="+valor+"]!!!\n" );
	    }
	    else
	    {
	        top = top + 1;
	        array[ top ] = valor;
	    }
	}

	
	@SuppressWarnings("unchecked")
	public T pop() throws MyException
	{
		System.out.println("\nDesempilhar...\n");

		T retorno;
		
	    if(top == -1) {
	        throw new MyException( "\nERRO: pilha vazia!!!\n" );
	    }
	    else
	    {
	        retorno = (T) array[ top ];
	        top = top - 1;
	    }

	    return retorno;
	}

	
	@SuppressWarnings("unchecked")
	public T peek() throws MyException
	{
		System.out.println("\nTopo...\n");

		T retorno;
		
	    if(top == -1) {
	        throw new MyException( "\nERRO: pilha vazia!!!\n" );
	    }
	    else {
	        retorno = (T) array[ top ];
	    }

	    return retorno;
	}
	

	public boolean isFull()
	{
	    if( top == size-1) {
	        return true;
	    }
	    else { 
	    	return false;
	    }
	}
	
	
	public boolean isEmpty()
	{
	    if( top == -1) {
	        return true;
	    }
	    else { 
	    	return false;
	    }
	}
	
	
	public void show()
	{
	    int i;

		System.out.println("\nExibindo...\n");
		
	    for(i=0; i <= top; i++) {
	        System.out.println("posicao " + i + " = " + array[i] + "\n");
	    }
		System.out.println("topo index = " + top + "\n");
	}
	
}
