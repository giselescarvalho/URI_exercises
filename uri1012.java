/*screva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
Entrada
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima, sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.*/
package uri;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class uri1012 {
	public static void main (String args[]) throws IOException
	{
		Scanner ler = new Scanner(System.in);
		double a,b,c,triangulo,circulo,trapezio,quadrado,retangulo;
		
		a = ler.nextDouble();
		b = ler.nextDouble();
		c = ler.nextDouble();
		
		triangulo = (a*c)/2.0;			//AreaTriangulo = (base*altura)/2
		circulo = ((c*c)*3.14159);  	//AreaCirculo = (raio*pi)
		trapezio = ((a+b)*c)/2.0;		//AreaTrapezio = ((BaseMaior+baseMenor)*altura)/2
		quadrado = b*b;					//AreaQuadrado = lado*lado ou lado^2
		retangulo = a*b;				//AreaRetangulo = base*altura
		
		System.out.println(String.format("TRIANGULO: %.3f",triangulo));
		System.out.println(String.format("CIRCULO: %.3f",circulo));
		System.out.println(String.format("TRAPEZIO: %.3f",trapezio));
		System.out.println(String.format("QUADRADO: %.3f",quadrado));
		System.out.println(String.format("RETANGULO: %.3f",retangulo));
	
	}
}