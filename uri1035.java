/*Leia 4 valores inteiros A, B, C e D. A seguir, se B for maior do que C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se C e D, ambos, forem positivos e se a vari�vel A for par escrever a mensagem "Valores aceitos", sen�o escrever "Valores nao aceitos".

Entrada
Quatro n�meros inteiros A, B, C e D.

Sa�da
Mostre a respectiva mensagem ap�s a valida��o dos valores.*/
package uri;
import java.io.IOException;
import java.util.Scanner;

public class uri1035 {
	public static void main(String[] args) throws IOException {
		 
        Scanner ler = new Scanner(System.in);
        int A, B, C, D;

        A = ler.nextInt();
        B = ler.nextInt();
        C = ler.nextInt();
        D = ler.nextInt();

        if ((B > C) & (D > A) & ((C + D) > (A + B)) & (C > 0 & D > 0) & (A % 2 == 0) ) {
            System.out.println("Valores aceitos");
        }
        else {
            System.out.println("Valores nao aceitos");
        }
    }
}