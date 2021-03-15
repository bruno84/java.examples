package pack1_inicio;

public class MainEx12GenericMethod 
{
	public static void main(String[] args) 
	{
		// printObject
		printObject(100);
		printObject(100.1);
		printObject('X');
		printObject(new MyClass(99, "noventa e nove"));
		System.out.println();
		
		// printArray
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
	

}
