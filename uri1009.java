/*Fa�a um programa que leia o nome de um vendedor, o seu sal�rio fixo e o total de vendas efetuadas por ele 
 * no m�s (em dinheiro). Sabendo que este vendedor ganha 15% de comiss�o sobre suas vendas efetuadas, informar
 *  o total a receber no final do m�s, com duas casas decimais.

Entrada
O arquivo de entrada cont�m um texto (primeiro nome do vendedor) e 2 valores de dupla precis�o (double) com 
duas casas decimais, representando o sal�rio fixo do vendedor e montante total das vendas efetuadas por este 
vendedor, respectivamente.

Sa�da
Imprima o total que o funcion�rio dever� receber, conforme exemplo fornecido.
*/
package uri;
import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.DecimalFormat;
import java.util.Scanner;

public class uri1009 {
	public static void main (String args[]) throws IOException
	{
		Scanner ler = new Scanner(System.in);
		String nome = " ";
		double salarioFixo,vendas;
		DecimalFormat df = new DecimalFormat("0.00");
		
		nome = ler.next();
		salarioFixo = ler.nextDouble();
		vendas = ler.nextDouble();
		
		double salarioBonus = (vendas*0.15)+(salarioFixo);
		
		System.out.println("TOTAL = R$ "+df.format(salarioBonus));
		
	}
}
