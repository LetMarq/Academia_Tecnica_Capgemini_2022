package testes;

import static org.junit.Assert.*;

import org.junit.Test;
import senha.SenhaSegura;

public class TesteUnitarioSenhaSegura {

	@Test
	public void test() {
		assertEquals(3,SenhaSegura.passwordCheck("Ya3"));
		assertEquals(0,SenhaSegura.passwordCheck("AbC3#q1"));
		assertEquals(1,SenhaSegura.passwordCheck("Abb23"));
	}

}
