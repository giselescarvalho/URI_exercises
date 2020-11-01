/*Calcule o consumo m�dio de um autom�vel sendo fornecidos a dist�ncia total percorrida (em Km) e o total de combust�vel gasto (em litros).

Entrada
O arquivo de entrada cont�m dois valores: um valor inteiro X representando a dist�ncia total percorrida (em Km), e um valor real Y representando o total de combust�vel gasto, com um d�gito ap�s o ponto decimal.

Sa�da
Apresente o valor que representa o consumo m�dio do autom�vel com 3 casas ap�s a v�rgula, seguido da mensagem "km/l".

*/
package uri;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class uri1014 {
	public static void main(String[] args) throws IOException {
	int x;
	double y, consumo;
	Scanner ler = new Scanner (System.in);
	DecimalFormat df = new DecimalFormat("0.000");
	
	x = ler.nextInt();
	y = ler.nextDouble();
	consumo = x/y;
	
	System.out.println(df.format(consumo)+" km/l");
	
	}
}
