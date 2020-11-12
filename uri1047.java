/*Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.

Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

Entrada
Quatro números inteiros representando a hora de início e fim do jogo.

Saída
Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .*/
package uri;

import java.io.IOException;
import java.util.Scanner;

public class uri1047 {
	public static void main(String[] args) throws IOException {
		 
		Scanner ler = new Scanner(System.in);
		
		int hi = ler.nextInt();
	    int mi = ler.nextInt();
	    int hf = ler.nextInt();
	    int mf = ler.nextInt();

	    int começo = (hi*60) + mi;
	    int fin = (hf*60) + mf;
	    int h24 = (24*60);
	    int resultado = 0;

	    if(fin>começo){
	       resultado = fin-começo;
	       System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",(resultado/60), (resultado%60));
	    }
	        
	    else if(começo>fin){
	    	resultado = (h24-começo)+(fin);
	    	System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",(resultado/60), (resultado%60));
	    }
	    else if(fin==começo){
	    	System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",24, 0);
	    }
	
	}
}
