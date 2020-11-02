/*Dois carros (X e Y) partem em uma mesma dire��o. O carro X sai com velocidade constante de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h.

Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quil�metros do carro X, ou seja, consegue se afastar um quil�metro a cada 2 minutos.

Leia a dist�ncia (em Km) e calcule quanto tempo leva (em minutos) para o carro Y tomar essa dist�ncia do outro carro.

Entrada
O arquivo de entrada cont�m um n�mero inteiro.

Sa�da
Imprima o tempo necess�rio seguido da mensagem "minutos".
 * */

package uri;

import java.io.IOException;
import java.util.Scanner;
import static java.lang.Math.abs;

public class uri1016 {
	public static void main(String[] args) throws IOException
	{

        Scanner ler = new Scanner(System.in);
        int distancia;
        double t;

        distancia = ler.nextInt();


        t = abs(-distancia / (90 - 60.0)) * 60;

        System.out.println((int) t + " minutos");
	
	}
}
