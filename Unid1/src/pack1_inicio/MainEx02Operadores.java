package pack1_inicio;

public class MainEx02Operadores 
{

	public static void main(String[] args) 
	{
	    int int1 = 11;
		int int2 = 4;
		int resultInt;
		
		resultInt = int1 + int2;
	    System.out.println("Soma: " + resultInt);
	    
		resultInt = int1 - int2;
		System.out.println("Subtracao: " + resultInt);

		resultInt = int1 * int2;
		System.out.println("Multiplicacao: " + resultInt);

		resultInt = int1 / int2;
		System.out.println("Divisao: " + resultInt);
		
		resultInt = int1 % int2;
		System.out.println("Resto: " + resultInt + "\n");
	    
		
	    
		float float1 = 11;
		float float2 = 4;
		float resultFloat;

		resultFloat = float1 + float2;
		System.out.println("Soma: " + resultFloat);
	    
		resultFloat = float1 - float2;
		System.out.println("Subtracao: " + resultFloat);

		resultFloat = float1 * float2;
		System.out.println("Multiplicacao: " + resultFloat);

		resultFloat = float1 / float2;
		System.out.println("Divisao: " + resultFloat);
		
		resultFloat = float1 % float2;		// Diferente de C, é feito cast interno.
	    System.out.println("Resto: " + resultFloat + "\t\t Atenção! \n");
	    
	    
	    
		boolean A = true; 
		boolean B = false; 
		boolean resultBool;
		
		resultBool = (A || B)  &&  !(A && B);
		//		      V    F         V    F
		//               V 			   !F 		
		//				 V				V 
		//				         V 
	    System.out.println("resultBool: " + resultBool + "\n");
	    
	    
	    
	    boolean pai = true; // TRUE
	    boolean mae = false; // FALSE

	    if(pai != mae) { 
	    	System.out.println("Diferentes"); 
	    } 

	    if(pai == mae) { 
	    	System.out.println("Iguais"); 
	    } 
	        
	    if( !(pai == mae)  ) { 
	    	System.out.println("O operador ! inverte o resultado da expressao"); 
	    } 
	    
	    if(pai == true && mae == false) { 
	    	System.out.println("Com && (E) todos precisam ser TRUE para a expressao ser TRUE"); 
	    } 
	    
	    if(pai == true || mae == false) { 
	    	System.out.println("Com || (OU) somente um precisa ser TRUE para a expressao ser TRUE \n"); 
	    } 
	    

	    
		int a = 5; 								// 0101 
		int b = 7; 								// 0111 
		int r;
		
		r = a | b; 								// 0111
		System.out.println("a | b = " + r); 
	    
		r = a & b; 								// 0101
		System.out.println("a & b = " + r); 
		
		r = a ^ b; 								// 0010		XOR 
		System.out.println("a ^ b = " + r); 
		
		r = ~a; 								// 1010
		System.out.println("~a = " + r + "\n"); 
		
		
		int c = 64; 							// 01000000 
		
		r = c >> 1;								// 00100000		Signed Right Shift 
		System.out.println("c >> 1 = " + r); 
		
		r = c << 1;								// 10000000		Signed Left Shift
		System.out.println("c << 1 = " + r); 
		
		r = c >>> 1;							// 00100000		Unsigned Right Shift
		System.out.println("c >>> 1 = " + r + "\n"); 
		
		
		c = -64; 								// 11111111 11111111 11111111 11111111 11111111 11111111 11111111 11000000 
		
		r = c >> 1;								// 11111111 11111111 11111111 11111111 11111111 11111111 11111111 11100000		Signed Right Shift 
		System.out.println("c >> 1 = " + r); 
		
		r = c << 1;								// 11111111 11111111 11111111 11111111 11111111 11111111 11111111 10000000		Signed Left Shift
		System.out.println("c << 1 = " + r); 
		
		r = c >>> 1;							// 00000000 00000000 00000000 00000000 01111111 11111111 11111111 11100000 		Unsigned Right Shift 		
		System.out.println("c >>> 1 = " + r + "\n"); 
		
		// ATENÇÃO: NAO EXISTE <<<				Unsigned Left Shift = Signed Left Shift
		
	}

	

	
	
}
