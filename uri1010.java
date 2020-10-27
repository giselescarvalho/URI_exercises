/*Neste problema, deve-se ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, 
 * o c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Ap�s, calcule e mostre o 
 * valor a ser pago.

Entrada
O arquivo de entrada cont�m duas linhas de dados. Em cada linha haver� 3 valores, respectivamente dois 
inteiros e um valor com 2 casas decimais.

Sa�da
A sa�da dever� ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espa�o ap�s os 
dois pontos e um espa�o ap�s o "R$". O valor dever� ser apresentado com 2 casas ap�s o ponto.
*/
package uri;

import java.text.DecimalFormat;
import java.util.Scanner;

public class uri1010 {
	public static void main (String args[])
	{
		Scanner ler = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int a,b,d,e;
		double c,f,res;
		
		a = ler.nextInt();
		b = ler.nextInt();
		c = ler.nextDouble();
		d = ler.nextInt();
		e = ler.nextInt();
		f = ler.nextDouble();
		
		res = (b*c) + (e*f);
		
		System.out.print("VALOR A PAGAR: R$ "+df.format(res));
	}
}
