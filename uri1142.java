/*Escreva um programa que leia um valor inteiro N. Este N � a quantidade de linhas de sa�da que ser�o apresentadas na execu��o do programa.

Entrada
O arquivo de entrada cont�m um n�mero inteiro positivo N.

Sa�da
Imprima a sa�da conforme o exemplo fornecido.
Entrada : 7
Sa�da: 1 2 3 PUM
*/
package uri;

import java.io.IOException;
import java.util.Scanner;

public class uri1142 {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int N;
        N = input.nextInt();

        for (int i=1; i <= N*4; i+=4) {
            System.out.print(i + " ");
            System.out.print(i+1 + " ");
            System.out.print(i+2 + " ");
            System.out.println("PUM");
        }
    }
}