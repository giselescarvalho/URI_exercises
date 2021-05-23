/*Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo.
Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:

Perimetro = XX.X

Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem

Area = XX.X

Entrada
   A entrada contém três valores reais.                   6.0 4.0 2.0          6.0 4.0 2.1

Saída
   O resultado deve ser apresentado com uma casa decimal. Area = 10.0      Perimetro = 12.1


*/

import java.util.*;
public class uri1043 {
    public static void main (String args[]) {
        Scanner ler = new Scanner(System.in);
        double a = ler.nextDouble();
        double b = ler.nextDouble();
        double c = ler.nextDouble();

        double area, perimetro;
        area = (a+b)*c/2.0;
        perimetro = a + b +c;


        if ( ((b - c) < a && a < (b + c))  &&  ((a - c) < b && b < (a + c))  &&  ((a - b) < c && c < (a + b)) ){
            System.out.println("Perimetro = " + perimetro);
        }
        else{
            System.out.println("Area = " + area);
        }

    }
}

/*
um de seus lados deve ser maior que o valor absoluto (módulo) da diferença dos outros dois lados e menor que a soma dos outros dois lados.
| b - c | < a < b + c
| a - c | < b < a + c
| a - b | < c < a + b

 */