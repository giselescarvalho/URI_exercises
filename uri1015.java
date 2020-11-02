/*Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, segundo a fórmula:
			 _________________
Distancia = V(x2-x1)²+(y2-y1)²
Entrada
O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

Saída
Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.
*/
package uri;

import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class uri1015 {
	public static void main(String[] args) throws IOException
	{
		
		Scanner ler = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");
        double x1, y1, x2, y2, distancia;

        x1 = ler.nextDouble();
        y1 = ler.nextDouble();
        x2 = ler.nextDouble();
        y2 = ler.nextDouble();

        distancia = Math.pow(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2),0.5);

        System.out.println(df.format(distancia));
 	
	}
}
