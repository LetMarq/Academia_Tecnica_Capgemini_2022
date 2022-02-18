package asterisco;
import java.util.Scanner;

public class AsteriscoEspaco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Entre com o valor de linhas:  ");  
		int n = sc.nextInt();
		sc.close();
		System.out.println(printAsterisco(n)); 
	}
	public static String printAsterisco(int n) {
		StringBuilder builder = new StringBuilder();
		String space = " ";
		String asterisk = "*";
		for(int line = 1; line <= n; line++) {

			builder.append(space.repeat(n-line) + asterisk.repeat(line) + '\n');
//			System.out.println(space.repeat(n-line) + asterisk.repeat(line));
			
		}
		return builder.toString();
	}

}
