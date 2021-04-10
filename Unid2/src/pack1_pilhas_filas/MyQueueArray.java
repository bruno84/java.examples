package pack1_pilhas_filas;

import pack0_utils.MyException;

public class MyQueueArray <T> implements MyInterfaceQueue <T>
{
	int size;
	private Object[] array;
	int first;
	int last;
	
	
	public MyQueueArray(int size) {
		this.first = -1;
		this.last = -1;
		this.size = size;
		this.array = new Object[size];
	}

	
	public void add(T valor) throws MyException
	{
		System.out.println("\nInserir...\n");

	    int fimTemp = (last + 1) % size;

	    if (fimTemp == first) {
	       throw new MyException( "\nERRO: fila cheia["+valor+"]!!!\n" );
	    }
	    else
	    {
	        array[fimTemp] = valor;
			last = fimTemp;

	        if (first == -1) {
	            first = 0;
	        }
	    }
	}


	@SuppressWarnings("unchecked")
	public T remove() throws MyException
	{
		System.out.println("\nRemover...\n");

		T retorno;
		
	    if (first == -1) {
	    	throw new MyException( "\nERRO: fila vazia!!!\n" );
	    }
	    else
	    {
	        retorno = (T) array[first];

	        if (first == last)
	        {
	            first = -1;
	            last = -1;
	        }
	        else
	        {
	          first = (first + 1) % size;
	        }
	    }

	    return retorno;
	}


	@SuppressWarnings("unchecked")
	public T peek() throws MyException
	{
		System.out.println("\nElemento no inicio...\n");

		T retorno;
		
	    if(first == -1) {
	        throw new MyException( "\nERRO: fila vazia!!!\n" );
	    }
	    else {
	        retorno = (T) array[ first ];
	    }

	    return retorno;
	}
	
	
	public boolean isFull()
	{
	    int fimTemp = (last + 1) % size;

	    if (fimTemp == first) {
	        return true;
	    }
	    else { 
	    	return false;
	    }
	}
	
	
	public boolean isEmpty()
	{
	    if( first == -1) {
	        return true;
	    }
	    else { 
	    	return false;
	    }
	}
	
	
	public void show()
	{
		System.out.println("\nExibindo...\n");
		
	    int i = first;
	    
	    if(first == -1) {
	    	return;
	    }
	    	    
	    while(i != last)
	    {
	    	System.out.println("posicao " + i + " = " + array[i] + "\n");
	        i++;

	        if (i == size) {
	            i = 0;
	        }
	    }
	    System.out.println("posicao " + i + " = " + array[i] + "\n");

		System.out.println("inicio = " + first + "  fim = " + last + "\n");
	}
	
}
