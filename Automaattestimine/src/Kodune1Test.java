import static org.junit.Assert.*;

import org.junit.Test;


public class Kodune1Test {

	@Test
	public void testEmail() {
		assertEquals(true, Kodune1.emailVerifier("kristensala@gmail.com"));
		assertEquals(false, Kodune1.emailVerifier("salakristen@gmailcom"));

	}
	@Test
	public void testDomain(){
		assertEquals("iti0011", Kodune1.getDomain("iti0011@cs.ttu.ee"));
		
	}

}
