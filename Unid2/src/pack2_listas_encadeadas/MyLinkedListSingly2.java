package pack2_listas_encadeadas;

/**
 * Objetivo: Lista simplesmente encadeada
 * @author Bruno Monteiro
 */
public class MyLinkedListSingly2 <T> implements MyInterfaceList <T>
{
	// Classe Interna Node
	class Node
	{
		// Atributos de Node
		int id;
        T data;    
        Node next;    
                
        // Construtor de Node
        public Node(T data) 
        {
        	this.id = nextId;
        	nextId = nextId+1;
        	
            this.data = data;    
            this.next = null;    
        }    
    } 
	
	// Atributos de MyLinkedListSingly
    public Node head;    
    public Node tail;
    public int nextId; 
	public int size;
    
    // Construtor de MyLinkedListSingly
	public MyLinkedListSingly2() {
		head = null;
		tail = null;
		nextId = 1;
		size = 0;
	}

	
	public void show()
	{
	    Node p = head;

		if(p == null) {
			System.out.println("LISTA VAZIA \n");
		}
		else 
	    {
	        while( p != null )
	        {
	            System.out.println("\n");
	            System.out.println("ID: " + p.id );
	            System.out.println("Dado: " + p.data );
	            System.out.println("\n");
	            p = p.next;
	        }
	    }
		
		System.out.println("size = " + size + "\n");
	}
	
	public void showReverse()
	{
		System.out.println("Ops! Esta é uma lista simplesmente encadeada. \n");
		System.out.println("size = " + size + "\n");
	}

	public void addFirst(T dado)
	{
		Node novo = new Node(dado);
	    
		// Anexa elemento NOVO (cuidado com a ordem! Dica: comece atribuindo os campos null)
		if(head == null) {
			head = novo;	// novo será o primeiro elemento
			tail = novo;	// novo será o último elemento
		} 
		else {
			// Anexa
			novo.next = head;
			head = novo;
		}
		
		size++;
	}
	

	public void addLast(T dado)
	{		 
	    Node novo = new Node(dado);    

	    // verifica se lista está vazia
	    if( head == null ) { 
	        head = novo;       	// novo será o primeiro elemento
	        tail = novo;		// novo será o último elemento
	    }
	    else
	    {
			// Anexa
	    	tail.next = novo;
	        tail = novo;
	    }
	    
	    size++;
	}

	
	public void addAfter(T dado, int idCrit)
	{
		// Antecessor
	    Node p = searchNode(idCrit);

	    if( p == null )	// Verifica se o criterio existe
	    {
	        System.out.println("Criterio invalido \n");
	    }
	    else
	    {
	        // Novo elemento 
	        Node novo = new Node(dado);

	        // Atualiza tail quando o elemento critério é o último
	        if(p.next == null) {
	        	tail = novo;
	        }
	        
	    	// Anexa (dicas: comece atribuindo os campos null)
	        novo.next = p.next;
		    p.next = novo;
		    
		    size++;
	    }
	}
	
	
	public T peekFirst()
	{	
		if( head == null ) {
	        System.out.println("Lista Vazia!!! \n");
	        return null;
	    }
		else {
			return head.data;
		}
	}
	
	
	public T peekLast()
	{
        if (tail == null) {
        	System.out.println("Lista Vazia!!! \n");
            return null;
        }
        else {
            return tail.data;
        }
	}
	

	private Node searchNode(int id)
	{
	    Node p = head;		// ponteiro temporario

	    while( p != null )
	    {
	        if( p.id == id ) {
	            return p;
	        }
	        p = p.next;
	    }
	    
	    return null;
	}

	
	public T search(int id)
	{
		Node p = searchNode(id);
		
		if(p == null) {
			return null;
		} else {
			return p.data;
		}
	}

	
	
	public T removeFirst()
	{	
		Node p = head;
		T dadoRetorno = null;

		if( head == null ) {
	        System.out.println("Lista Vazia!!! \n");
	    }
		else
		{
			dadoRetorno = p.data;
			
			if (head == tail) 
			{
				System.out.println("Remove unico elemento\n");
                head = null;
                tail = null;
            } 
			else {
				System.out.println("Remove primeiro elemento, mas há mais outros\n");
                head = head.next;
			}
			
			p.next = null; // isola elemento removido
			
			size--;
		}

		return dadoRetorno;
	}
	
	
	public T removeLast()
	{
		T dadoRetorno = null;

        if (tail == null) {
        	System.out.println("Lista Vazia!!! \n");
            return null;
        }
        else 
        {
            dadoRetorno = tail.data;
            
            if (head == tail) 
            {
            	System.out.println("Remove unico elemento\n");
            	head = null;
            	tail = null;
            } 
            else 
            {
            	System.out.println("Remove ultimo elemento, mas há mais outros\n");
        		Node p = head;
        		// Procuro o penultimo elemento
                while (p.next != tail) {
                	p = p.next;
                }
                
                tail = p;
                tail.next = null;
            }
            
            // OBS: nao precisa isolar elemento pois o next do tail é sempre null.
            
            size--;
        }

        return dadoRetorno;
	}
	

	private Node searchBefore(int id)
	{
	    Node p = head; 	   			// ponteiro temporario
		Node anterior = null;	   	// ponteiro anterior

	    while (p != null)
	    {
	    	anterior = p;
	        p = p.next;
	        
	        if (p != null && p.id == id) {
	           return anterior;
	        }
	    }
	    
	    return null;
	}
	
	
	public T remove(int id)
	{	
		Node anterior = null;
		Node removido = null;
		T dadoRetorno = null;

		if( head == null ) {
	        System.out.println("Lista Vazia!!! \n");
	        return null;
	    }

		anterior = searchBefore(id); // null: ID não existe OU ID está no 1o elemento

		if( anterior == null ) 
		{
			if(head.id != id)
			{
		        System.out.println("ID nao existe!!! \n");
		        return null;
			}
			else
			{
				removido = head;
				
				if( head == tail )
				{
					System.out.println("Remove o primeiro elemento, que é o unico \n");
					head = null;
					tail = null;
					// OBS: nao precisa isolar elemento pois o next do tail é sempre null.
				}				
				else 
				{
					System.out.println("Remove o primeiro elemento, mas não é o único \n");
	    			head = head.next;
	            	removido.next = null; // isola elemento removido
				}
			}
		}
		else
		{
			System.out.println("Remove elemento meio ou ultimo \n");
			
			removido = anterior.next;

			if(removido == tail) {
				System.out.println("Remove ultimo \n");
				tail = anterior;		// atualiza tail
				tail.next = null;	// se desliga do elemento removido
				// OBS: nao precisa isolar elemento removido pois o next do tail é sempre null.
			}
			else {
				System.out.println("Remove meio \n");
				anterior.next = removido.next;	// se desliga do elemento removido
		        removido.next = null;			// isola elemento removido
			}
		}

		dadoRetorno = removido.data;
		size--;
		
		return dadoRetorno;
	}

	
}
