package pack2_collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import pack1_inicio.MyClass;

/**
 * Map
 * Estrutura em que cada elemento é composto por um par <chave, valor>.
 * Não pode haver repetição de elementos com a mesma chave.
 * @author bruno.monteiro
 */
public class MainEx05Map 
{	
	public static void main(String[] args) 
	{
		/**
		 * HashMap
		 * Tem boa eficiencia, com complexidade O(1).
		 * Permite apenas uma chave null.
		 * Não ordenada. OBS: A ordenação é baseada apenas na ordem natural da chave.
		 */
		System.out.println("HashMap");
		Map<String, MyClass> hashMap = new HashMap<String, MyClass>();
		hashMap.put("a", new MyClass(0, "zero") );
		hashMap.put("b", new MyClass(1, "um") );
		hashMap.put("b", new MyClass(1111, "ummmmm") );		// Cuidado! Substitui o outro elemento que também tinha chave "b" 
		hashMap.put("d", new MyClass(3, "tres") );
		hashMap.put("c", new MyClass(2, "dois") );
		hashMap.put(null, new MyClass(4, "quatro") );
		
		System.out.println( hashMap );
		System.out.println( hashMap.size() );
		
		System.out.println( hashMap.remove( "b" ) );
		System.out.println( hashMap.size() );
		
		System.out.println( hashMap.keySet() );

		for(String key: hashMap.keySet() ) { 
            System.out.print( hashMap.get(key) + " ");  
        }
		System.out.println("\n\n");
		
		
		
		/**
		 * LinkedHashMap
		 * Tem boa eficiencia, com complexidade O(1).
		 * Permite apenas uma chave null.
		 * Mantem a ordem de inserção.
		 */
		System.out.println("LinkedHashMap");
		Map<String, MyClass> linkedHashMap = new LinkedHashMap<String, MyClass>();
		linkedHashMap.put("a", new MyClass(0, "zero") );
		linkedHashMap.put("b", new MyClass(1, "um") );
		linkedHashMap.put("b", new MyClass(1111, "ummmmm") );		// Cuidado! Substitui o outro elemento que também tinha chave "b" 
		linkedHashMap.put("d", new MyClass(3, "tres") );
		linkedHashMap.put("c", new MyClass(2, "dois") );
		linkedHashMap.put(null, new MyClass(4, "quatro") );
		
		System.out.println( linkedHashMap );
		System.out.println( linkedHashMap.size() );
		
		System.out.println( linkedHashMap.remove( "b" ) );
		System.out.println( linkedHashMap.size() );
		
		System.out.println( linkedHashMap.keySet() );

		for(String key: linkedHashMap.keySet() ) { 
            System.out.print( linkedHashMap.get(key) + " ");  
        }
		System.out.println("\n\n");
		
		
		/**
		 * TreeMap
		 * Tem eficiencia média, com complexidade O(log n).
		 * Não permite nenhuma chave null.
		 * Elementos são ordenados (por padrão natural ou por compareTo).
		 */
		System.out.println("TreeMap");
		Map<String, MyClass> treeMap = new TreeMap<String, MyClass>();
		treeMap.put("a", new MyClass(0, "zero") );
		treeMap.put("b", new MyClass(1, "um") );
		treeMap.put("b", new MyClass(1111, "ummmmm") );		// Cuidado! Substitui o outro elemento que também tinha chave "b" 
		treeMap.put("d", new MyClass(3, "tres") );
		treeMap.put("c", new MyClass(2, "dois") );
		// treeMap.put(null, new MyClass(4, "quatro") );	// não pode!
		
		System.out.println( treeMap );
		System.out.println( treeMap.size() );
		
		System.out.println( treeMap.remove( "b" ) );
		System.out.println( treeMap.size() );
		
		System.out.println( treeMap.keySet() );

		for(String key: treeMap.keySet() ) { 
            System.out.print( treeMap.get(key) + " ");  
        }
		System.out.println("\n\n");

	}

}
