package pack2_listas_encadeadas.comum;

public interface MyInterfaceListV2comID <T>
{	
    void addFirst(T value);
    void addLast(T value);
    void addAfter(T dado, int idCrit);
    
    T peekFirst();
    T peekLast();
    
    T search(int idCrit);
    
    T removeFirst();
    T removeLast();
    T remove(int idCrit); 
    
	void show();			// opcional
	void showReverse();		// opcional
}
