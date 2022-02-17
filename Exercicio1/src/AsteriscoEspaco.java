import java.util.Scanner;

public class AsteriscoEspaco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		String space = " ";
		String asterisk = "*";
		System.out.print("Entre com o valor de linhas:  ");  
		int n = sc.nextInt();
		sc.close();
		for(int line = 1; line <= n; line++) {
			System.out.println(space.repeat(n-line) + asterisk.repeat(line));
		}
	}

}
