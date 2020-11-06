package uri;
import java.io.IOException;
import java.util.Scanner;
public class uri1044 {
	public static void main(String[] args) throws IOException {
		 
		Scanner ler = new Scanner(System.in);
		int A, B;

		A = ler.nextInt();
		B = ler.nextInt();

		if ((A % B == 0) | (B % A == 0)) {
			System.out.println("Sao Multiplos");
		} 
		else {
			System.out.println("Nao sao Multiplos");
		}
	 
	}
	 
}

