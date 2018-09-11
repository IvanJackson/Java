import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarCypherTest {

	
	// por ahora no funciona pq no se wtf is encode
	@Test
	void testEncode1() {
		fail("Not yet implemented");
		CaesarCypher c = new CaesarCypher(3);
		assertEquals("KHOOR", c.encode("HELLO"));
	}
	void testEncode2() {
		fail("Not yet implemented");
		CaesarCypher c = new CaesarCypher(3);
		assertEquals("RHOOK", c.encode("HELLO"));
	}

}
