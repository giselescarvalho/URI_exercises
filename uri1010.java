/*Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, 
 * o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o 
 * valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores, respectivamente dois 
inteiros e um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os 
dois pontos e um espaço após o "R$". O valor deverá ser apresentado com 2 casas após o ponto.
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
