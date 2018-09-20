
public class Ejemplo_Del_profe {

	public static void main(String[] args) {
		
		double sqrt2 = Math.sqrt(2.0);
		
		/**
		 * El API de string es uno dinamico, o de instacia, lo que significa que se le pregunta directamente al objeto, en este caso al string, about itself.
		 * This is in contrast of static methods, lo cual le preguntan a la clase en general, que hacer
		 * Porque los strings son objetos, asi que se necesita que el 
		 * 
		 * 
		 * We're going to learn about Cesar's Cipher
		 * Esto es la manera mas basica, y mega facil de crack, de encryption
		 * 
		 * 
		 * "clear text" is a fancy word for uncrypted text
		 * Lo que se hace es que se toma el codigo, digamos que es solamente de letras, y se le hace un shift (un key) de 5 letras mas alante. 
		 * Asi que si el codigo fuese "Hello", y el key fuese de 5, el cypher text (codigo encrypto) seria MJQQT
		 * Si se usara una letra al final de alfabeto, pues se haria que el alfabet looped para que la Z, se codifique a una E
		 * 
		 * 
		 */
		CaesarCypher firstCypher = new CaesarCypher(6);
		firstCypher = new CaesarCypher(22);
		// Sept 4, 2019
		
		CaesarCypher c = new CaesarCypher(3);
		String clear = "HELLO";
		String cyphered = c.encode(clear);
		System.out.println(cyphered);
		
		
	}
}
