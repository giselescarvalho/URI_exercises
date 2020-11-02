/*Leia um valor inteiro. A seguir, calcule o menor n�mero de notas poss�veis (c�dulas) no qual o valor pode ser decomposto. As notas consideradas s�o de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a rela��o de notas necess�rias.

Entrada
O arquivo de entrada cont�m um valor inteiro N (0 < N < 1000000).

Sa�da
Imprima o valor lido e, em seguida, a quantidade m�nima de notas de cada tipo necess�rias, conforme o exemplo fornecido. N�o esque�a de imprimir o fim de linha ap�s cada linha, caso contr�rio seu programa apresentar� a mensagem: �Presentation Error�.*/
package uri;
import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
public class uri1018 {
	public static void main(String[] args) throws IOException
	{
		
		Scanner ler = new Scanner(System.in);
		int N, valor, n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0, n1 = 1;
        N = ler.nextInt();

        valor = N;
        n100 = N / 100;
        N %= 100;
        n50 = N / 50;
        N %= 50;
        n20 = N / 20;
        N %= 20;
        n10 = N / 10;
        N %= 10;
        n5 = N / 5;
        N %= 5;
        n2 = N / 2;
        N %= 2;
        n1 = N;

        System.out.println(valor);
        System.out.println(n100 + " nota(s) de R$ 100,00");
        System.out.println(n50 + " nota(s) de R$ 50,00");
        System.out.println(n20 + " nota(s) de R$ 20,00");
        System.out.println(n10 + " nota(s) de R$ 10,00");
        System.out.println(n5 + " nota(s) de R$ 5,00");
        System.out.println(n2 + " nota(s) de R$ 2,00");
        System.out.println(n1 + " nota(s) de R$ 1,00");

	}
}
