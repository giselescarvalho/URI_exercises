/*Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X que ser�o lidos em seguida.
Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos est�o fora do intervalo, mostrando essas informa��es.

Entrada
A primeira linha da entrada cont�m um valor inteiro N (N < 10000), que indica o n�mero de casos de teste.
Cada caso de teste a seguir � um valor inteiro X (-10^7 < X <10^7).
 

Sa�da
Para cada caso, imprima quantos n�meros est�o dentro (in) e quantos valores est�o fora (out) do intervalo.*/

package uri;

import java.io.IOException;
import java.util.Scanner;

public class uri1072 {
	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		int N, X, in=0, out=0;
		N = input.nextInt();

		for (int i=0; i<N; i++) {
		X = input.nextInt();
		if ((X >= 10) & (X <= 20)) {
			in++;
		} else {
			out++;
		}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
	}
}