/*Fa�a um programa que leia tr�s valores e apresente o maior dos tr�s valores lidos seguido da mensagem �eh o maior�. Utilize a f�rmula:
 * Maior = ((a+b)+abs(a-b))/2
 * 
 Obs.: a f�rmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto � necess�rio para chegar no resultado esperado.

Entrada
O arquivo de entrada cont�m tr�s valores inteiros.

Sa�da
Imprima o maior dos tr�s valores seguido por um espa�o e a mensagem "eh o maior".
*/

package uri;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.Math.abs;

public class uri1013 {
	public static void main (String args[]) throws IOException
	{
		Scanner ler = new Scanner(System.in);
		int a,b,c,maior;
		
		a = ler.nextInt();
		b = ler.nextInt();
		c = ler.nextInt();
		
		maior = ((a+b) + Math.abs(a-b))/2;
		maior = (maior + c + Math.abs(maior - c))/2;
		
		System.out.println(maior+" eh o maior");
	}

}
