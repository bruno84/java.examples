package pack1_pilhas_filas;

import pack0_utils.MyException;

public interface MyInterfaceQueue <T>
{
    void add(T number) throws MyException;
    T remove() throws MyException;
    
    T peek() throws MyException;	// consulta o início (primeiro elemento)
    
    boolean isEmpty();
    boolean isFull();
    
    void show(); // opcional e auxiliar
}
