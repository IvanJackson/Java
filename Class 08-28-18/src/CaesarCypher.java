
public class CaesarCypher {

	/* Pensando ahead, el cypher necesita el shift (key)
	 * 
	 */
	private int key;
	
	private final static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	/* Private significa que otras clases no saben que esta existe
	 * Final siginifica que el valor de esta variable no va a cambiar
	 * 
	 */
	//Vamos a crear otro alphabet con las letras shited al key, para que ahora el alphabet empieze con las letras shifted
	private static String shiftedAlphabet;
	
	public CaesarCypher (int key) {
		this.key = key;
		String leftSubstring = alphabet.substring(0, this.key);
		String rightSubstring = alphabet.substring(this.key);
		shiftedAlphabet = rightSubstring + leftSubstring;
		System.out.println(shiftedAlphabet);
		
	}

	
	public String encode(String clear) {
		// TODO Auto-generated method stub
		String newString= "";
		System.out.println(shiftedAlphabet);
		for (int i=0; i < clear.length(); i++) {
			
			char letter = clear.charAt(i);
			newString += letter;
//			letter = shiftedAlphabet[i];
		}
		return newString;
	}
	
	// Usamos el API para buscar el substring() method
	
	
}
