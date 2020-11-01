/*Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de combustível gasto (em litros).

Entrada
O arquivo de entrada contém dois valores: um valor inteiro X representando a distância total percorrida (em Km), e um valor real Y representando o total de combustível gasto, com um dígito após o ponto decimal.

Saída
Apresente o valor que representa o consumo médio do automóvel com 3 casas após a vírgula, seguido da mensagem "km/l".

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
