package testes;

import static org.junit.Assert.*;

import org.junit.Test;
import senha.SenhaSegura;

public class TesteUnitarioSenhaSegura {

	@Test
	public void test() { //Verifica se o número indicado é igual ao de caracteres faltantes obtidos 
		assertEquals(3, SenhaSegura.passwordCheck("Ya3")); //pela função passwordCheck()
		assertEquals(0, SenhaSegura.passwordCheck("AbC3#q1"));
		assertEquals(1, SenhaSegura.passwordCheck("Abb23"));
	}

}
