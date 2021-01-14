/*Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

Entrada
Não há nenhuma entrada neste problema.

Saída
Imprima a sequencia conforme exemplo abaixo.
I=1 J=7
I=1 J=6
*/
package uri;

import java.io.IOException;

public class uri1097 {
	public static void main(String[] args) throws IOException {

		int i=1, j=7;
        while (i <= 9) {
          for (int k = 0; k < 3; k++) {
        	  System.out.println("I=" + i + " J=" + j);
        	  j--;
          }
          j+=5;
          i+=2;
        }
    }
}