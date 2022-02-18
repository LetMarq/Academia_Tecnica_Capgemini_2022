package testes;

import static org.junit.Assert.*;

import asterisco.AsteriscoEspaco;

import org.junit.Test;

public class TesteUnitarioStringAsterisco {

	@Test
	public void test() { //Verifica se a String de teste é igual ao resultado de returnAsterisco
		assertEquals("", AsteriscoEspaco.returnAsterisco(0));
		assertEquals("  *\n **\n***\n", AsteriscoEspaco.returnAsterisco(3));
		assertEquals("         *\n        **\n       ***\n      ****\n"
				+ "     *****\n    ******\n   *******\n  ********\n" + " *********\n**********\n",
				AsteriscoEspaco.returnAsterisco(10));
	}

}
