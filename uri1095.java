/*Voc� deve fazer um programa que apresente a sequencia conforme o exemplo abaixo.

Entrada
N�o h� nenhuma entrada neste problema.

Sa�da
Imprima a sequencia conforme exemplo abaixo
I=1 J=60
I=4 J=55
I=7 J=50
...
I=? J=0
*/


package uri;

import java.io.IOException;

public class uri1095 {
	public static void main(String[] args) throws IOException {
		
		int i = 1;
        for (int j = 60; j >= 0; j = j - 5) {
        	System.out.println("I=" + i + " J=" +j);
        	i = i + 3;
        }
    }
}