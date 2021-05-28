/*
Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são pares e mostre esta informação.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.

Exemplo de Entrada      	Exemplo de Saída
7
-5                          3 valores pares
6
-4
12

 */

import java.util.Scanner;
public class uri1065 {
    public static void main (String args[]) {
        Scanner ler = new Scanner(System.in);
        int a, pares = 0;

        for (int i = 0;i < 5; i++){
            a = ler.nextInt();
            if (a % 2 == 0 ) pares++;
        }

        System.out.println(pares + " valores pares");
    }
}
