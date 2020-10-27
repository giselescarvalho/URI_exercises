/*Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele 
 * no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar
 *  o total a receber no final do mês, com duas casas decimais.

Entrada
O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2 valores de dupla precisão (double) com 
duas casas decimais, representando o salário fixo do vendedor e montante total das vendas efetuadas por este 
vendedor, respectivamente.

Saída
Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.
*/
package uri;
import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

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
		
		System.out.println("TOTAL = "+df.format(salarioBonus));
		
	}
}
