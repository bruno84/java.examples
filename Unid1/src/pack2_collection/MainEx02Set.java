package pack2_collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import pack1_inicio.MyClass;

public class MainEx02Set 
{
	
	/**
	 * Set
	 * Interface que serve de base para estruturas que aceitam apenas valores (chaves) únicos.
	 * 
	 */
	
	public static void main(String[] args) 
	{
		/**
		 * HashSet
		 * Internamente utiliza tabela de dispersão, por isso, destaca-se pela eficiencia: Complexidade O(1) para operações de add e delete.
		 * Seus elementos não são ordenados.
		 */
		System.out.println("HashSet");
		Set<MyClass> hashSet = new HashSet<MyClass>();
		hashSet.add( new MyClass(0, "zero") );
		hashSet.add( new MyClass(1, "um") );
		hashSet.add( new MyClass(1, "ummmm") );		// Não será adicionado pois a chave é o atributo "inteiro" definido em hashCode() em MyClass. 
		hashSet.add( new MyClass(2, "dois") );
		hashSet.add( new MyClass(3, "tres") );
		hashSet.add( new MyClass(4, "quatro") );
		hashSet.add( new MyClass(5, "quatro") );	// Será adicionado, pois quem é a chave é o atributo "inteiro".
		
		System.out.println( hashSet );
		System.out.println( hashSet.size() );
		
		System.out.println( hashSet.remove( new MyClass(1, "um") ) );
		System.out.println( hashSet );
		System.out.println( hashSet.size() );
		System.out.println();
		
		
		/**
		 * TreeSet
		 * Internamente utiliza a interface SortedSet, que ordena automaticamente os elementos, por isso, tem menor eficiencia com complexidade O(log n).
		 */
		System.out.println("TreeSet");
		Set<MyClass> treeSet = new TreeSet<MyClass>();		// ATENÇÃO: é preciso sobrescrever o método compareTo em MyClass.
		treeSet.add( new MyClass(0, "zero") );
		treeSet.add( new MyClass(1, "um") );
		treeSet.add( new MyClass(1, "um") );		
		treeSet.add( new MyClass(2, "dois") );
		treeSet.add( new MyClass(3, "tres") );
		treeSet.add( new MyClass(4, "quatro") );
		treeSet.add( new MyClass(5, "quatro") );	
		
		System.out.println( treeSet );
		System.out.println( treeSet.size() );
		
		System.out.println( treeSet.remove( new MyClass(1, "um") ) );
		System.out.println( treeSet );
		System.out.println( treeSet.size() );
		System.out.println();
		
		
		/**
		 * LinkedHashSet
		 * Tem como diferencial ter boa eficiencia e manter a ordem de inserção, semelhante ao List.
		 */
		System.out.println("LinkedHashSet");
		Set<MyClass> linkedHashSet = new LinkedHashSet<MyClass>();		
		linkedHashSet.add( new MyClass(5, "quatro") );		// Será adicionado, pois quem é a chave é o atributo "inteiro".
		linkedHashSet.add( new MyClass(4, "quatro") );
		linkedHashSet.add( new MyClass(3, "tres") );
		linkedHashSet.add( new MyClass(2, "dois") );
		linkedHashSet.add( new MyClass(1, "um") );	
		linkedHashSet.add( new MyClass(1, "um") );			// Não será adicionado, pois há repetição da chave "inteiro"
		linkedHashSet.add( new MyClass(0, "zero") );	
				
		System.out.println( linkedHashSet );				// Preserva a ordem da adição
		System.out.println( linkedHashSet.size() );
		
		System.out.println( linkedHashSet.remove( new MyClass(1, "um") ) );
		System.out.println( linkedHashSet );
		System.out.println( linkedHashSet.size() );
		System.out.println();
		

	}

}
