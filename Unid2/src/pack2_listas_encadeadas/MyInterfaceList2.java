package pack2_listas_encadeadas;

public interface MyInterfaceList2 <T>
{
	void show();
	void showReverse();
	
    void addFirst(T value);
    void addLast(T value);
    void addAfter(T dado, T crit);
    
    T peekFirst();
    T peekLast();
    
    T search(T crit);
    
    T removeFirst();
    T removeLast();
    T remove(T crit); 
}
