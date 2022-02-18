package testes;

import static org.junit.Assert.*;
import anagrama.Anagrama;

import org.junit.Test;

public class TestesUnitariosAnagrama {

	@Test
	public void test() {
		assertEquals(2, Anagrama.testSubstring("ovo"));
		assertEquals(3, Anagrama.testSubstring("ifailuhkqq"));
		assertEquals(4, Anagrama.testSubstring("ovvo"));
		assertEquals(0, Anagrama.testSubstring("abcdefg"));
	}

}
