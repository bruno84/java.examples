package pack1_pilhas_filas;

public class MyQueueArray <T> implements MyInterfaceQueue <T>
{
	int size;
	private Object[] array;
	int begin;
	int end;
	
	
	public MyQueueArray(int size) {
		this.begin = -1;
		this.end = -1;
		this.size = size;
		this.array = new Object[size];
	}

	
	public void add(T valor) throws MyException
	{
		System.out.println("\nInserir...\n");

	    int fimTemp = (end + 1) % size;

	    if (fimTemp == begin) {
	       throw new MyException( "\nERRO: fila cheia["+valor+"]!!!\n" );
	    }
	    else
	    {
	        array[fimTemp] = valor;
			end = fimTemp;

	        if (begin == -1) {
	            begin = 0;
	        }
	    }
	}


	@SuppressWarnings("unchecked")
	public T remove() throws MyException
	{
		System.out.println("\nRemover...\n");

		T retorno;
		
	    if (begin == -1) {
	    	throw new MyException( "\nERRO: fila vazia!!!\n" );
	    }
	    else
	    {
	        retorno = (T) array[begin];

	        if (begin == end)
	        {
	            begin = -1;
	            end = -1;
	        }
	        else
	        {
	          begin = (begin + 1) % size;
	        }
	    }

	    return retorno;
	}


	@SuppressWarnings("unchecked")
	public T peek() throws MyException
	{
		System.out.println("\nElemento no inicio...\n");

		T retorno;
		
	    if(begin == -1) {
	        throw new MyException( "\nERRO: fila vazia!!!\n" );
	    }
	    else {
	        retorno = (T) array[ begin ];
	    }

	    return retorno;
	}
	
	
	public boolean isFull()
	{
	    int fimTemp = (end + 1) % size;

	    if (fimTemp == begin) {
	        return true;
	    }
	    else { 
	    	return false;
	    }
	}
	
	
	public boolean isEmpty()
	{
	    if( begin == -1) {
	        return true;
	    }
	    else { 
	    	return false;
	    }
	}
	
	
	public void show()
	{
		System.out.println("\nExibindo...\n");
		
	    int i = begin;
	    
	    if(begin == -1) {
	    	return;
	    }
	    	    
	    while(i != end)
	    {
	    	System.out.println("posicao " + i + " = " + array[i] + "\n");
	        i++;

	        if (i == size) {
	            i = 0;
	        }
	    }
	    System.out.println("posicao " + i + " = " + array[i] + "\n");

		System.out.println("inicio = " + begin + "  fim = " + end + "\n");
	}
	
}
