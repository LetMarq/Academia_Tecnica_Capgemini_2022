package asterisco;

import java.util.Scanner;

public class AsteriscoEspaco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Entre com o valor de linhas:  "); 
		int n = sc.nextInt(); //Pegando input do usuário
		sc.close();
		System.out.println(returnAsterisco(n));
	}

	public static String returnAsterisco(int n) {
		StringBuilder builder = new StringBuilder();
		String space = " ";
		String asterisk = "*";
		for (int line = 1; line <= n; line++) { //Adicionando a quantidade de espaços e asteriscos repetidamente

			builder.append(space.repeat(n - line) + asterisk.repeat(line) + '\n');  //Adicionando quantidade de asteriscos correspondente
		}                                                                          // a sua linha e completando com espaço
		return builder.toString();
	}

}
