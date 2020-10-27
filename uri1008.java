/*Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que 
recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, 
com duas casas decimais.

Entrada
O arquivo de entrada contém 2 números inteiros e 1 número com duas casas decimais, representando o número, 
quantidade de horas trabalhadas e o valor que o funcionário recebe por hora trabalhada, respectivamente.

Saída
Imprima o número e o salário do funcionário, conforme exemplo fornecido, com um espaço em branco antes e 
depois da igualdade. No caso do salário, também deve haver um espaço em branco após o $.*/
package uri;
import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
public class uri1008 {
	public static void main (String args[]) throws IOException
	{
		Scanner ler = new Scanner(System.in);
		int numero,horas;
		double valorPorHora,salario;
		DecimalFormat df = new DecimalFormat("0.00");
		
		numero = ler.nextInt();
		horas = ler.nextInt();
		valorPorHora = ler.nextDouble();
		
		salario = horas*valorPorHora;
		
		System.out.println("NUMBER = "+numero);
		System.out.println("SALARY = U$ "+df.format(salario));
	}
}
