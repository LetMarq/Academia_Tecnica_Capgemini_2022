package anagrama;

import java.util.Scanner;

public class Anagrama {

	public static boolean compareStrings(String first, String second) {
		if (first.length() != second.length()) {
			return false; // Verifica se as janelas possuem o mesmo tamanho
		}
		int i = 0, j = 0;
		while (true) {

			if (first.charAt(i) == second.charAt(j)) {
				first = first.substring(0, i) + first.substring(i + 1); // Remove o caracter das Strings caso sejam
																		// iguais
				second = second.substring(0, j) + second.substring(j + 1);
				if (i > first.length() - 1) { // Caso o i esteja na ultima posi��o, sai do la�o
					break;
				} else if (j > second.length() - 1) {
					j = 0; //Caso o j esteja na ultima posi��o, voltar� a posi��o inicial
				}
			} else if (j < second.length() - 1) { //Caso os caracteres n�o sejam iguais, procede a busca
				j++;
			} else if (i < first.length() - 1) {
				i++;
				j = 0;
			} else
				break;

		}
		if (first.length() == second.length() && first.length() == 0) {
			return true; //Se o tamanho das duas strings for zero, elas s�o anagrama

		}
		return false; //Se o tamanho das duas strings for diferente de zero, elas n�o s�o anagrama
	}

	public static int testSubstring(String text) {
		int text_len = text.length();
		int count = 0;
		for (int window_size = 1; window_size < text_len; window_size++) { // Define o tamanho das janelas de testes
			for (int init = 0; init < (text_len - window_size); init++) { // Come�a o movimento da primeira janela
				for (int init_window = (init + 1); init_window <= (text_len - window_size); init_window++) {// Come�a o
																											// movimento
																											// da
																											// segunda
																											// janela
					if (init != init_window) { // Caso as janelas n�o estejam no mesmo lugar
						if (compareStrings(text.substring(init, init + window_size),
								text.substring(init_window, init_window + window_size))) {
							count++; //Caso seja anagrama, soma-se o contador
						}
					}
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira a String a ser testada:  ");
		String text = sc.nextLine(); // Salva o input do usuario
		sc.close();
		System.out.println(testSubstring(text));
	}

}