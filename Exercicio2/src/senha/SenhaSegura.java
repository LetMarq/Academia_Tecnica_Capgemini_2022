package senha;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SenhaSegura {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Insira a senha a ser testada:  ");
		String password = sc.nextLine(); //Salvando o input do usuário
		sc.close();
		System.out.println("O número de caracteres mínimos que faltam é: " + passwordCheck(password)); 
	}

	public static int passwordCheck(String password) {
		int pass_len = password.length();
		int password_last = 0;
		boolean uppercase = false, lowercase = false, special_char = false, digit = false; //Inicializando todas os critérios com false
		List<Character> special_character = Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'); //Array de caracteres especiais

		for (int i = 0; i < pass_len; i++) { //Varrendo a String char a char
			char letter = password.charAt(i); //Salva o char da String na posiçãoo i
			if (Character.isUpperCase(letter)) {
				uppercase = true; //Caso maiuscula, critério é verdadeiro

			} else if (Character.isLowerCase(letter)) {
				lowercase = true;//Caso minuscula, critério é verdadeiro

			} else if (special_character.stream().anyMatch(value -> value == letter)) { //Procura se existe o char na lista de caracteres especiais
				special_char = true;//Caso tenha char especial, critério é verdadeiro

			} else if (Character.isDigit(letter)) {
				digit = true;//Caso dígito numérico, critério é verdadeiro
			}
		}
		if (!uppercase) //Caso exista algum critério faltante, password_last é incrementado
			password_last++;
		if (!lowercase)
			password_last++;
		if (!special_char)
			password_last++;
		if (!digit)
			password_last++;
		if (pass_len < 6 && (6 - pass_len) > password_last) { //Caso a quantidade de caracteres faltantes seja menor que o número mínimo de
			password_last = 6 - pass_len;                     //caracteres (6) e seja maior que a soma dos criterios ausentes, 
		}                                                     //a quantidade que falta será 6 menos o tamanho da string

		return password_last;
	}

}
