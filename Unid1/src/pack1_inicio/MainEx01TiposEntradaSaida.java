package pack1_inicio;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MainEx01TiposEntradaSaida 
{
	private static Scanner scanner = new Scanner( System.in ); 
	
	
	public static void main(String[] args) 
	{		
		// BYTE
		System.out.print("Informe um byte: ");
		byte numByte = scanner.nextByte();
		System.out.println("numByte = " + numByte);
		
		String strByte1 = Integer.toBinaryString(numByte);
		System.out.println("binary: " + strByte1);
		
		String strByte2 = String.format("%8s", Integer.toBinaryString(numByte & 0xFF) );
		System.out.println("binary: " + strByte2);
		strByte2 = strByte2.replace(' ', '0');
		System.out.println("binary: " + strByte2);
		
		int size = Byte.BYTES;
		int min = Byte.MIN_VALUE;
		int max = Byte.MAX_VALUE;
		System.out.printf("printf: numByte = %d , size = %d , min = %d , max = %d \n\n", numByte, size, min, max);
		

		// SHORT
		System.out.print("Informe um short: ");
		short numShort = scanner.nextShort();
		System.out.println("numShort = " + numShort);
		System.out.printf("printf = %d \n\n", numShort);
		
		// INT
		System.out.print("Informe um int: ");
		int numInt = scanner.nextInt();
		System.out.println("numInt = " + numInt);
		System.out.printf("printf = %d \n", numInt);
		
		strByte1 = Integer.toBinaryString(numInt);
		System.out.println("binary: " + strByte1);
		
		strByte2 = String.format("%8s", Integer.toBinaryString(numInt & 0xFF) );
		System.out.println("binary: " + strByte2);
		strByte2 = strByte2.replace(' ', '0');
		System.out.println("binary: " + strByte2 + "\n\n");
		
		// LONG
		System.out.print("Informe um long: ");
		long numLong = scanner.nextLong();
		System.out.println("numLong = " + numLong);
		System.out.printf("printf = %d \n\n", numLong);
		
		// FLOAT
		System.out.print("Informe um float: ");
		float numFloat = scanner.nextFloat();
		System.out.println("numFloat = " + numFloat);
		System.out.printf("printf = %f \n", numFloat);
		System.out.printf("printf = %.2f \n", numFloat);
		
		DecimalFormat df = new DecimalFormat("#.###"); 
		String strFloat = df.format(numFloat); 
		System.out.println("strFloat = " + strFloat + "\n"); 

		
		// DOUBLE
		System.out.print("Informe um double: ");
		double numDouble = scanner.nextDouble();
		System.out.println("numDouble = " + numDouble);
		System.out.printf("printf = %e \n\n", numDouble);
		scanner.nextLine(); // limpa buffer (enter)
		
		// CHAR
		System.out.print("Informe um char: ");
		char char1 = ' ';
		try {
			char1 = (char)System.in.read();
			System.out.println("char1 = " + char1);
			System.out.printf("printf = %c \n\n", char1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		scanner.nextLine(); // limpa buffer (enter)
		
		// BOOLEAN
		System.out.print("Informe um boolean (true ou false): ");
		boolean bool1 = scanner.nextBoolean();
		System.out.println("bool1 = " + bool1);
		System.out.printf("printf = %b \n\n", bool1);
		scanner.nextLine(); // limpa buffer (enter)
		
		// STRING sem espaço
		System.out.print("Informe seu primeiro nome: ");
		String str1 = scanner.next();
		scanner.nextLine(); // limpa buffer (enter)
		System.out.println("str1 = " + str1);
		System.out.printf("printf = %s \n\n", str1);
		
		// STRING com espaço
		System.out.print("Informe seu nome completo: ");
		String str2 = scanner.nextLine();
		System.out.println("str2 = " + str2);
		System.out.printf("printf = %s \n\n", str2);
				
	}

}
