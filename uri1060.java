/*Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). A seguir, mostre a quantidade de valores positivos digitados.

Entrada
Seis valores, negativos e/ou positivos.

Saída
Imprima uma mensagem dizendo quantos valores positivos foram lidos.*/
package uri;

import java.io.IOException;
import java.util.Scanner;

public class uri1060 {
	
	public static void main(String[] args) throws IOException {
		 
		Scanner input = new Scanner(System.in);
            
		double n;
        int totalPositivos = 0;

        for (int i = 0; i < 6; i++) {
        	n = input.nextDouble();
        		
        	if (n > 0) {
        		totalPositivos += 1;
        	}
        }
        
        System.out.print(totalPositivos + " valores positivos\n");

	}

    }