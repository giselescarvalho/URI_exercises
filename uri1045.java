/*Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:
se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
Entrada
A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) , B (0 < B) e C (0 < C).

Saída
Imprima todas as classificações do triângulo especificado na entrada.*/
package uri;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class uri1045 {
	public static void main(String[] args) throws IOException {
		 
		Scanner ler = new Scanner(System.in);
		double A, B, C, A2, B2, C2;

		A = ler.nextDouble();
		B = ler.nextDouble();
		C = ler.nextDouble();
		
		List <Double> lista = Arrays.asList(A, B,C);
		Collections.sort(lista, Collections.reverseOrder());
		A = lista.get(0);
		B = lista.get(1);
		C = lista.get(2);

		A2 = A * A;
		B2 = B * B;
		C2 = C * C;

		if (A >= (B + C)) {
			System.out.println("NAO FORMA TRIANGULO");
		} 
		else if ((A2) == (B2 + C2)) {
			System.out.println("TRIANGULO RETANGULO");
		}  
		else if ((A2) > (B2 + C2)) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}  
		else if ((A2) < (B2 + C2)) {
		    System.out.println("TRIANGULO ACUTANGULO");
		}
		if ((A == B) && (B == C)) {
			System.out.println("TRIANGULO EQUILATERO");
		} 
		else if ((B == C) || (B == A) || (A == C)) {
			System.out.println("TRIANGULO ISOSCELES");
		}
		
	}

}
