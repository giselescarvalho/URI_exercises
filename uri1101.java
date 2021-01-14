/*Leia um conjunto n�o determinado de pares de valores M e N (parar quando algum dos valores for menor ou igual a zero). Para cada par lido, mostre a sequ�ncia do menor at� o maior e a soma dos inteiros consecutivos entre eles (incluindo o N e M).

Entrada
O arquivo de entrada cont�m um n�mero n�o determinado de valores M e N. A �ltima linha de entrada vai conter um n�mero nulo ou negativo.

Sa�da
Para cada dupla de valores, imprima a sequ�ncia do menor at� o maior e a soma deles, conforme exemplo abaixo.
Entrada: 5 2
Sa�da: 2 3 4 5 Sum=14*/
package uri;

import java.io.IOException;
import java.util.Scanner;

public class uri1101 {
	 public static void main(String[] args) throws IOException {
		 
		 int a, b;
	     Scanner input =new Scanner(System.in);

	     while (((a = input.nextInt()) > 0 )&&((b = input.nextInt()) > 0 )) {
	     int sum = 0;
	     	if (a > b) {
	     		for (b = b; b <= a; b++) {
	     			sum+=b;
	                System.out.print(b+" ");
	     		}
	     		
	     		System.out.print("Sum="+sum+"\n");
	     	}
	     	else {
	     		for (a = a; a <= b; a++) {
	     			sum+=a;
	                System.out.print(a+" ");
	     		}
	     		
	     		System.out.print("Sum="+sum+"\n");
	     		}
	     }
	 }
}