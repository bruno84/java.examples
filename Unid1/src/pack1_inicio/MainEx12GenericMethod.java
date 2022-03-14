package pack1_inicio;

import java.util.Arrays;
import java.util.List;

public class MainEx12GenericMethod 
{
	public static void main(String[] args) 
	{
		// Generic: Object <T>
		printObject(100);
		printObject(100.1);
		printObject('X');
		printObject(new MyClass(99, "noventa e nove"));
		System.out.println();
		
		// Generic: Element <E>
		Integer[] intArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
		Character[] charArray = {'O', 'L', 'A'};
		MyClass[] myClassArray = { new MyClass(1, "um"),  new MyClass(2, "dois") };

		System.out.println("intArray:");
		printArray(intArray);

		System.out.println("doubleArray:");
		printArray(doubleArray);

		System.out.println("charArray:");
		printArray(charArray);
		
		System.out.println("myClassArray:");
		printArray(myClassArray);
		
		// Generic: Wildcard (se aproveita da herança)
        List<Integer> list1 = Arrays.asList(4, 5, 6, 7);
        System.out.println("Soma (Integer):" + soma(list1));
 
        List<Double> list2 = Arrays.asList(4.1, 5.1, 6.1, 7.1);
        System.out.print("Soma (Double):" + soma(list2));
	}
	
	
	public static <T> void printObject(T myObj) 
	{
		System.out.println(myObj + " ");
	}
	
	public static <E> void printArray(E[] myArray) 
	{
		for(E element : myArray) {
			System.out.print(element + " ");
		}
		System.out.println("\n");
	}
	
    private static double soma(List<? extends Number> list)
    {
        double soma = 0.0;
        
        for (Number n : list) {
        	// Number eh classe pai de Integer e Double
            soma = soma + n.doubleValue();
        }
 
        return soma;
    }
	

}
