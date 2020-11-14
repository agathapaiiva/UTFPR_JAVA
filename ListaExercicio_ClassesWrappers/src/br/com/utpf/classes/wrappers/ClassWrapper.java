/**
 * @author agatha-paiva
 */

package br.com.utpf.classes.wrappers;

public class ClassWrapper {
	public static void main(String[] args) {
			    
	    System.out.println("******************************************************\n");
	    
	    // xxxValue() é utilizado quando precisa realizar uma conversão do valor de um objeto wrapper para um objeto primitivo.

	    Integer myInt = 5; 
	    System.out.println("Valor Integer " +  myInt);
	    System.out.println("Convertendo de Classe Wrapper Integer para tipo primitivo double " + myInt.doubleValue());
	    System.out.println("Convertendo de Classe Wrapper Integer para tipo primitivo byte " + myInt.byteValue());
	    System.out.println("Convertendo de Classe Wrapper Integer para tipo primitivo float " + myInt.floatValue());
	    
	    System.out.println("******************************************************\n");
	    
	    Double myDouble = 5.99; 
	    System.out.println("Valor Double " +  myDouble);
	    System.out.println("Convertendo de Classe Wrapper Double para tipo primitivo byte " + myDouble.byteValue()+"\n");
	    
	    System.out.println("******************************************************\n");
	    
	    Character myChar = 'A'; 
	    System.out.println("Valor Charecter " +  myChar);
	    System.out.println("Convertendo de Classe Wrapper Charecter para tipo primitivo char " + myChar.charValue()+"\n");
	    
		
	}
	
}
