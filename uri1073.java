/*Leia um valor inteiro N. Este valor ser� a quantidade de valores inteiros X que ser�o lidos em seguida.
Mostre quantos destes valores X est�o dentro do intervalo [10,20] e quantos est�o fora do intervalo, mostrando essas informa��es.

Entrada
A primeira linha da entrada cont�m um valor inteiro N (N < 10000), que indica o n�mero de casos de teste.
Cada caso de teste a seguir � um valor inteiro X (-107 < X <107).
 

Sa�da
Para cada caso, imprima quantos n�meros est�o dentro (in) e quantos valores est�o fora (out) do intervalo.*/
package uri;
import java.util.Scanner;

public class uri1073 {
	
	public static void main (String args[])
	{
		Scanner ler = new Scanner(System.in);
		int N;
		N = ler.nextInt();

		for (int i=2; i<=N; i+=2) {
			System.out.println(i + "^2 = " + i*i);
		}
}

}

