/*Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.

Entrada
A entrada contem três números inteiros.

Saída
Imprima a saída conforme foi especificado.*/
package uri;

import java.io.IOException;
import java.util.Scanner;

public class uri1042 {
	public static void main(String[] args) throws IOException {
		 
		Scanner ler = new Scanner(System.in);
		int a = ler.nextInt();
		int b = ler.nextInt();
		int c = ler.nextInt();
		
		if ((a>b) && (b>c)) {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		else if ((a>c) && (c>b)) {
			System.out.println(a);
			System.out.println(c);
			System.out.println(b);
		}
		
		else if ((b>a) && (a>c)) {
			System.out.println(b);
			System.out.println(a);
			System.out.println(c);
		}
		
		else if ((b>c) && (c>a)) {
			System.out.println(b);
			System.out.println(c);
			System.out.println(a);
		}
		
		else if ((c>a) && (b>a)) {
			System.out.println(c);
			System.out.println(a);
			System.out.println(b);
			
		}
		
		else {
			System.out.println(c);
			System.out.println(b);
			System.out.println(a);
		}
		
		System.out.println("\n" + a);
		System.out.println(b);
		System.out.println(c);
	}
}