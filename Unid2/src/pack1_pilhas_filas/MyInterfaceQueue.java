package pack1_pilhas_filas;

public interface MyInterfaceQueue <T>
{
    void add(T number);
    T remove();
    
    T peek();
    
    boolean isEmpty();
    boolean isFull();
    
    void show();
}
