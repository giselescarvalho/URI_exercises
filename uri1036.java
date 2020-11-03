/*Leia 3 valores de ponto flutuante e efetue o c�lculo das ra�zes da equa��o de Bhaskara. Se n�o for poss�vel calcular as ra�zes, mostre a mensagem correspondente �Impossivel calcular�, caso haja uma divis�o por 0 ou raiz de numero negativo.

Entrada
Leia tr�s valores de ponto flutuante (double) A, B e C.

Sa�da
Se n�o houver possibilidade de calcular as ra�zes, apresente a mensagem "Impossivel calcular". Caso contr�rio, imprima o resultado das ra�zes com 5 d�gitos ap�s o ponto, com uma mensagem correspondente conforme exemplo abaixo. Imprima sempre o final de linha ap�s cada mensagem

Exemplos de Entrada	: 10.0 20.1 5.1

Exemplos de Sa�da : R1 = -0.29788 
					R2 = -1.71212
*/
package uri;

import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.*;

public class uri1036 {
	public static void main(String[] args) throws IOException {
		 
        Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00000");
        double a, b, c, r1, r2;
        
        a = ler.nextDouble();
        b = ler.nextDouble();
        c = ler.nextDouble();
        
        if (a==0 || ((b*b)-(4*a*c))<0){
        	System.out.println("Impossivel calcular");
        }
        else {
        	r1 = ((-b)+Math.sqrt((b*b)-(4*a*c)))/(2*a);
        	r2 = ((-b)-Math.sqrt((b*b)-(4*a*c)))/(2*a);
        	System.out.println("R1 = "+df.format(r1));
        	System.out.println("R2 = "+df.format(r2)); 
        }
     
	}
}
