/*Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os �mpares de 1 at� X, um valor por linha, inclusive o X, se for o caso.

Entrada
O arquivo de entrada cont�m 1 valor inteiro qualquer.

Sa�da
Imprima todos os valores �mpares de 1 at� X, inclusive X, se for o caso.*/

package uri;
import java.io.IOException;
import java.util.Scanner;

public class uri1067 {
	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
	    int X;
	    X = input.nextInt();

	    for (int i=1; i<=X; i+=2) {
	    	System.out.println(i);
	    }
	}
}