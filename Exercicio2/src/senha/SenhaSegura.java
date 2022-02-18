package senha;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SenhaSegura {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Insira a senha a ser testada:  ");
		String password = sc.nextLine();
		sc.close();
		System.out.println("O número de caracteres mínimos que faltam é: " + passwordCheck(password));
	}

	public static int passwordCheck(String password) {
		int pass_len = password.length();
		int password_last = 0;
		boolean uppercase = false, lowercase = false, special_char = false, digit = false;
		List<Character> special_character = Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+');

		for (int i = 0; i < pass_len; i++) {
			char letter = password.charAt(i);
			if (Character.isUpperCase(letter)) {
				uppercase = true;

			} else if (Character.isLowerCase(letter)) {
				lowercase = true;

			} else if (special_character.stream().anyMatch(value -> value == letter)) {
				special_char = true;

			} else if (Character.isDigit(letter)) {
				digit = true;
			}
		}
		if (!uppercase)
			password_last++;
		if (!lowercase)
			password_last++;
		if (!special_char)
			password_last++;
		if (!digit)
			password_last++;
		if (pass_len < 6 && (6 - pass_len) > password_last) {
			password_last = 6 - pass_len;
		}

		return password_last;
	}

}
