package pack3_uteis;

public class MainExRegex 
{

	public static void main(String[] args) 
	{
		String str = "12y9,9@";
		
       	if( str.matches(".*[A-Za-z].*") ) {
       		System.out.println("tem letras");
    	}
    	else {
    		System.out.println("nao tem letras");
    	}
	}

}
