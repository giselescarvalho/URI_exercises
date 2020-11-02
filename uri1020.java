/*Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

Entrada
O arquivo de entrada contém um valor inteiro.

Saída
Imprima a saída conforme exemplo fornecido.*/
package uri;
import java.io.IOException;
import java.util.Scanner;

public class uri1020 {
	public static void main(String[] args) throws IOException
	{
		
		Scanner ler = new Scanner(System.in);
		int a, idadeAnos, idadeMeses, idadeDias;
		
		a = ler.nextInt();
		
		idadeAnos = a/365;
		idadeMeses = (a%365)/30;
		idadeDias = (a%365)%30;
		
		 System.out.println(idadeAnos+" ano(s)");
		 System.out.println(idadeMeses+" mes(es)");
		 System.out.println(idadeDias+" dia(s)");
		
	}
}
