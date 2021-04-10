package pack1_pilhas_filas;

public interface MyInterfaceStack <T>
{
    void push(T number);
    T pop();
    
    T peek();
    
    boolean isEmpty();
    boolean isFull();
    
    void show();
}
