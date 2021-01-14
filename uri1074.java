/*Leia um valor inteiro N. Este valor ser� a quantidade de valores que ser�o lidos em seguida. Para cada valor lido, mostre uma mensagem em ingl�s dizendo se este valor lido � par (EVEN), �mpar (ODD), positivo (POSITIVE) ou negativo (NEGATIVE). No caso do valor ser igual a zero (0), embora a descri��o correta seja (EVEN NULL), pois por defini��o zero � par, seu programa dever� imprimir apenas NULL.

Entrada
A primeira linha da entrada cont�m um valor inteiro N(N < 10000) que indica o n�mero de casos de teste. Cada caso de teste a seguir � um valor inteiro X (-10^7 < X <10^7).

Sa�da
Para cada caso, imprima uma mensagem correspondente, de acordo com o exemplo abaixo. Todas as letras dever�o ser mai�sculas e sempre dever� haver um espa�o entre duas palavras impressas na mesma linha.*/

package uri;

import java.io.IOException;
import java.util.Scanner;

public class uri1074 {
	 
	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		int N, X;
		N = input.nextInt();

		for (int i=0; i<N; i++) {
			X = input.nextInt();
			if (X == 0) {
				System.out.println("NULL");
			}
			else {
				if (X % 2 == 0) {
					System.out.print("EVEN ");
				}
				else {
					System.out.print("ODD ");
	            }
				if (X > 0) {
					System.out.println("POSITIVE");
				}
				else {
					System.out.println("NEGATIVE");
				}
			}
		}
	}
	 
}