package pack1_pilhas_filas;

import pack0_utils.MyException;

public interface MyInterfaceStack <T>
{
    void push(T number) throws MyException; 	// empilhar
    T pop() throws MyException;					// desempilhar
    
    T peek() throws MyException;				// consultar (topo)
    
    boolean isEmpty();
    boolean isFull();
    
    void show();	// opcional e auxiliar
}
