/*Leia um valor inteiro, que � o tempo de dura��o em segundos de um determinado evento em uma f�brica, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada cont�m um valor inteiro N.

Sa�da
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
*/
package uri;
import java.io.IOException;
import java.util.Scanner;
public class uri1019 {
	public static void main(String[] args) throws IOException {
	
	Scanner ler = new Scanner(System.in);
	
	int n = ler.nextInt();
	int hora = n/3600;
	int min = (n%3600)/60;
	int seg = n%60;
	
	System.out.println(hora+":"+min+":"+seg);
	}
}
