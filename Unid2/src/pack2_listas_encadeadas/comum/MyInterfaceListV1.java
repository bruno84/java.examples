package pack2_listas_encadeadas.comum;

public interface MyInterfaceListV1 <T>
{	
    void addFirst(T value);
    void addLast(T value);
    void addAfter(T dado, T crit);
    
    T peekFirst();
    T peekLast();
    
    T search(T crit);
    
    T removeFirst();
    T removeLast();
    T remove(T crit); 
    
	void show();			// opcional
	void showReverse();		// opcional
}
