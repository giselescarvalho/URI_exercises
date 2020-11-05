/*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o ponto, ou se est� sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem �Origem�.   Q2|Q1
															  _|_
															 Q3|Q4

Se o ponto estiver sobre um dos eixos escreva �Eixo X� ou �Eixo Y�, conforme for a situa��o.

Entrada
A entrada contem as coordenadas de um ponto.

Sa�da
A sa�da deve apresentar o quadrante em que o ponto se encontra.*/
package uri;
import java.io.IOException;
import java.util.Scanner;
public class uri1041 {
	public static void main(String[] args) throws IOException {
		 
		Scanner ler = new Scanner(System.in);

		double x = ler.nextDouble();
		double y = ler.nextDouble();

		if ((x == 0) & (y == 0)) {
			System.out.println("Origem");
		} 
		else if (y == 0) {
			System.out.println("Eixo X");
		} 
		else if (x == 0) {
			System.out.println("Eixo Y");
		} 
		else if ((x > 0) & (y > 0)) {
			System.out.println("Q1");                                                  
		} 
		else if ((x < 0) & (y > 0)) {
			System.out.println("Q2");
		} 
		else if ((x < 0) & (y < 0)) {
			System.out.println("Q3");
		} 
		else if ((x > 0) & (y < 0)) {
			System.out.println("Q4");
        }
    }
}