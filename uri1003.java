/* Leia dois valores inteiros, no caso para vari�veis A e B. A seguir, calcule a soma entre elas e atribua � 
 * vari�vel SOMA. A seguir escrever o valor desta vari�vel.

Entrada
O arquivo de entrada cont�m 2 valores inteiros.

Sa�da
Imprima a mensagem "SOMA" com todas as letras mai�sculas, com um espa�o em branco antes e depois da igualdade 
seguido pelo valor correspondente � soma de A e B. Como todos os problemas, n�o esque�a de imprimir o fim de 
linha ap�s o resultado, caso contr�rio, voc� receber� "Presentation Error".
 */

package uri;
import java.io.IOException;
import java.util.*;
public class uri1003 {
	public static void main(String[] args) throws IOException 
	{
		int a,b,soma;
		Scanner ler = new Scanner(System.in);
		
		a = ler.nextInt();
		b=ler.nextInt();
		soma=a+b;
		
		System.out.println("SOMA = "+soma);
	}
}
