package pack2_listas_encadeadas;

public interface MyInterfaceList <T>
{
	void show();
	void showReverse();
	
    void addFirst(T value);
    void addLast(T value);
    void addAfter(T dado, int idCrit);
    
    T peekFirst();
    T peekLast();
    
    T search(int idCrit);
    
    T removeFirst();
    T removeLast();
    T remove(int idCrit); 
}
