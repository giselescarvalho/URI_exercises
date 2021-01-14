/*Você deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

Entrada
Não há nenhuma entrada neste problema.

Saída
Imprima a sequencia conforme exemplo abaixo
I=1 J=7
I=1 J=6
*/
package uri;

import java.io.IOException;

public class uri1096 {

public static void main(String[] args) throws IOException {
    int contador = 0;
    int sequencial = 7;
    for (int i = 1; i <= 9;) {
        System.out.println("I=" + i + " J=" + sequencial);
        sequencial--;
        contador++;
        if (contador == 3) {
            i = i + 2;
            contador = 0;
            sequencial = 7;
        }
    }
	}
}