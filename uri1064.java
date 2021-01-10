/*Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos. Na pr�xima linha, deve-se mostrar a m�dia de todos os valores positivos digitados, com um d�gito ap�s o ponto decimal.

Entrada
A entrada cont�m 6 n�meros que podem ser valores inteiros ou de ponto flutuante. Pelo menos um destes n�meros ser� positivo.

Sa�da
O primeiro valor de sa�da � a quantidade de valores positivos. A pr�xima linha deve mostrar a m�dia dos valores positivos digitados.*/

package uri;
import java.util.Scanner;
import java.io.IOException;

public class uri1064 {
	public static void main(String[] args) throws IOException {
		
		Scanner leitor = new Scanner(System.in);
		int cont = 0;
        double media = 0;
        double x;

        for (int i = 0; i < 6; i++) {
        	x = leitor.nextDouble();
            if (x > 0) {
            	cont++;
                media += x;
            }
        }

        media = media / cont;
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }
 
}