/*Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos n�meros impares entre eles.

Entrada
O arquivo de entrada cont�m dois valores inteiros.

Sa�da
O programa deve imprimir um valor inteiro. Este valor � a soma dos valores �mpares que est�o entre os valores fornecidos na entrada que dever� caber em um inteiro.
 */
package uri;

import java.io.IOException;
import java.util.Scanner;

public class uri1071 {
	public static void main(String[] args) throws IOException {
		 
		Scanner input = new Scanner(System.in);
		int i, X, Y, soma = 0;

		X = input.nextInt();
		Y = input.nextInt();

		if (X < Y) {
			for (i = X + 1; i < Y; i++) {
				if (i % 2 != 0) {
						soma += i;
				}
			}
		} 
		
		else {
			for (i = Y + 1; i < X; i++) {
				if (i % 2 != 0) {
					soma += i;
				}
	        }
		}

		System.out.println(soma);
	}
}