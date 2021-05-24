/*
Leia um valor inteiro entre 1 e 12, inclusive. Correspondente a este valor, deve ser apresentado como resposta o mês do ano por extenso, em inglês, com a primeira letra maiúscula.

Entrada
A entrada contém um único valor inteiro.

Saída
Imprima por extenso o nome do mês correspondente ao número existente na entrada, com a primeira letra em maiúscula.

Exemplo de Entrada  	Exemplo de Saída
       4                   April
 */
import java.util.Scanner;
public class uri1052 {
    public static void main (String args[]) {
        Scanner ler = new Scanner(System.in);
        int m = ler.nextInt();
        if (m == 1) {
            System.out.println("January");
        } else if (m == 2) {
            System.out.println("February");
        } else if (m == 3) {
            System.out.println("March");
        } else if (m == 4) {
            System.out.println("April");
        } else if (m == 5) {
            System.out.println("May");
        } else if (m == 6) {
            System.out.println("June");
        } else if (m == 7) {
            System.out.println("July");
        } else if (m == 8) {
            System.out.println("August");
        } else if (m == 9) {
            System.out.println("September");
        } else if (m == 10) {
            System.out.println("October");
        } else if (m == 11) {
            System.out.println("November");
        } else if (m == 12) {
            System.out.println("December");
        }

    }

}