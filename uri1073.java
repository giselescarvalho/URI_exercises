/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações.

Entrada
A primeira linha da entrada contém um valor inteiro N (N < 10000), que indica o número de casos de teste.
Cada caso de teste a seguir é um valor inteiro X (-107 < X <107).
 

Saída
Para cada caso, imprima quantos números estão dentro (in) e quantos valores estão fora (out) do intervalo.*/
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

