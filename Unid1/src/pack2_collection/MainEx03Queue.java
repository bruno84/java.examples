package pack2_collection;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MainEx03Queue 
{
	/**
	 * Queue
	 * Interface que embasa estruturas de fila. 
	 * Permite elementos com repetição de chaves.
	 * Facilita a inserção de elementos no fim e a remoção/acesso de elementos no inicio da fila.
	 */
	
	public static void main(String[] args) 
	{
		/**
		 * LinkedList
		 * Conserva a ordem de inserção.
		 */
		System.out.println("LinkedList");
        Queue<String> linkedList = new LinkedList<String>(); 
		
        linkedList.add("zzz"); 		// insere no fim
        linkedList.add("aaa"); 
        linkedList.add("ttt"); 
        linkedList.add("bbb"); 
        linkedList.add("ccc"); 
        
		System.out.println(linkedList); 
		System.out.println("size: " + linkedList.size()); 
		
		String str = linkedList.peek(); 			// apenas consulta inicio
		System.out.println("inicio: " + str); 		// zzz
		
		str = linkedList.remove(); 					// remove do inicio
		System.out.println("removed: " + str); 		// zzz
		
		System.out.println(linkedList); 
		System.out.println("size: " + linkedList.size()); 
		System.out.println();	
		
		
		/**
		 * PriorityQueue
		 * Não aceita elementos null.
		 * Como não foi definida prioridades (em compareTo), a estrutra usa a ordem padrão, diferente de LinkedList que mantem a ordem de inserção.
		 */
		System.out.println("PriorityQueue");
        Queue<String> priorityQueue = new PriorityQueue<String>(); 
		
        priorityQueue.add("zzz"); 		// insere no fim
        priorityQueue.add("aaa"); 
        priorityQueue.add("ttt"); 
        priorityQueue.add("ttt"); 		// permite repetição
        priorityQueue.add("bbb"); 
        priorityQueue.add("ccc"); 
        
		System.out.println(priorityQueue); 
		System.out.println("size: " + priorityQueue.size()); 
		
		str = priorityQueue.peek(); 				// apenas consulta inicio
		System.out.println("inicio: " + str); 		// zzz
		
		str = priorityQueue.remove(); 				// remove do inicio
		System.out.println("removed: " + str); 		// zzz
		
		System.out.println(priorityQueue); 
		System.out.println("size: " + priorityQueue.size()); 
		
		
	}

}
