/*Escreva um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que 
recebe por hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, 
com duas casas decimais.

Entrada
O arquivo de entrada cont�m 2 n�meros inteiros e 1 n�mero com duas casas decimais, representando o n�mero, 
quantidade de horas trabalhadas e o valor que o funcion�rio recebe por hora trabalhada, respectivamente.

Sa�da
Imprima o n�mero e o sal�rio do funcion�rio, conforme exemplo fornecido, com um espa�o em branco antes e 
depois da igualdade. No caso do sal�rio, tamb�m deve haver um espa�o em branco ap�s o $.*/
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
