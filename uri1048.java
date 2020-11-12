/*
 * A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:
 * 
 * Salário	
0 - 400.00
400.01 - 800.00
800.01 - 1200.00
1200.01 - 2000.00
Acima de 2000.00

Percentual de Reajuste
15%
12%
10%
7%
4%

Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice reajustado, em percentual.

Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

Saída
Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste e o percentual de reajuste ganho, conforme exemplo abaixo.
*/
package uri;

import java.io.IOException;
import java.util.Scanner;

public class uri1048 {
	public static void main(String[] args) throws IOException {
		 
		Scanner ler = new Scanner(System.in);
		double numero = ler.nextDouble();

        double r1 = numero + (numero * 0.15), m1 = (numero * 0.15);
        double r2 = numero + (numero * 0.12), m2 = (numero * 0.12);
        double r3 = numero + (numero * 0.10), m3 = (numero * 0.10);
        double r4 = numero + (numero * 0.07), m4 = (numero * 0.07);
        double r5 = numero + (numero * 0.04), m5 = (numero * 0.04);

        if (numero >= 0.00 && numero <= 400.00) {
            System.out.printf("Novo salario: %.2f\n", r1);
            System.out.printf("Reajuste ganho: %.2f\n", m1);
            System.out.println("Em percentual: 15 %");
        }
        else if (numero >= 400.01 && numero <= 800.00) {
        	System.out.printf("Novo salario: %.2f\n", r2);
        	System.out.printf("Reajuste ganho: %.2f\n", m2);
        	System.out.println("Em percentual: 12 %");
        } 
        else if (numero >= 800.01 && numero <= 1200.00) {
        	System.out.printf("Novo salario: %.2f\n", r3);
        	System.out.printf("Reajuste ganho: %.2f\n", m3);
        	System.out.println("Em percentual: 10 %");
    	} 
        else if (numero >= 1200.01 && numero <= 2000.00) {
        	System.out.printf("Novo salario: %.2f\n", r4);
        	System.out.printf("Reajuste ganho: %.2f\n", m4);
        	System.out.println("Em percentual: 7 %");
        } 
        else if (numero >= 2000.01) {
        	System.out.printf("Novo salario: %.2f\n", r5);
        	System.out.printf("Reajuste ganho: %.2f\n", m5);
        	System.out.println("Em percentual: 4 %");
        }
    }
}