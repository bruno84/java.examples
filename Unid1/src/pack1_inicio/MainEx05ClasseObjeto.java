package pack1_inicio;

public class MainEx05ClasseObjeto 
{
	public static void main(String[] args) 
	{
		MyClass obj1 = new MyClass(1, "Ana");
		MyClass obj2 = new MyClass(2, "Bruno");
		MyClass obj3 = new MyClass(3, "Clara");

		System.out.println( obj1.toString() );
		System.out.println( obj2.toString() );
		System.out.println( obj3 );
		System.out.println();
				
		obj1.setInteiro(10);
		obj1.setNome("Alice");
		
		System.out.println( obj1.getInteiro() );
		System.out.println( obj1.getNome() );
		System.out.println();
		
		// Passagem de parametro: sempre por valor.
		// STACK: � a copia do valor que esta na stack. OK.
		// HEAP: com a copia do valor da referancia do objeto (que fica na stack), acessamos o objeto na heap.
		
		int num = 10;
		System.out.println("antes  =   " + num );
		System.out.println("antes  =   " + obj1 );
		
		change(num, obj1);
		
		System.out.println("depois =   " + num ); 	// 10
		System.out.println("depois =   " + obj1 );	// Alice, 1000
	}


	public static void change(int myNum, MyClass myObject)
	{
		myNum = 1000;
		myObject.setInteiro(1000);
		System.out.println("dentro =   " + myNum );
		System.out.println("dentro =   " + myObject );
	}
	
	
}
