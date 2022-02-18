import static org.junit.Assert.*;

import asterisco.AsteriscoEspaco;

import org.junit.Test;

public class TesteUnitarioAsterisco {

	@Test 
	public void test() {
		assertEquals("",AsteriscoEspaco.printAsterisco(0)); 
		assertEquals("  *\n **\n***\n",AsteriscoEspaco.printAsterisco(3)); 
		assertEquals("         *\n        **\n       ***\n      ****\n"
				+ "     *****\n    ******\n   *******\n  ********\n"
				+ " *********\n**********\n",AsteriscoEspaco.printAsterisco(10)); 
	}

}
