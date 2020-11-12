/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

Entrada
A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

Saída
Apresente a duração do jogo conforme exemplo abaixo. */
package uri;

import java.io.IOException;
import java.util.Scanner;

public class uri1046 {
	public static void main(String[] args) throws IOException {
		 
		Scanner ler = new Scanner(System.in);
	
		int ini, fim, duracao;

        ini = ler.nextInt();
        fim = ler.nextInt();

        if (ini == fim){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
        else if(ini > fim){
            duracao = (24 - ini) + fim ;
            System.out.println("O JOGO DUROU "+duracao+" HORA(S)");
        }
        else if(ini < fim){
            duracao = fim - ini;
            System.out.println("O JOGO DUROU "+duracao+" HORA(S)");
        }
	
	}
	
}
