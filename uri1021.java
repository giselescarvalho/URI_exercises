/*

Exemplo de Entrada	Exemplo de Saída
576.73              NOTAS:
5 nota(s) de R$ 100.00
1 nota(s) de R$ 50.00
1 nota(s) de R$ 20.00
0 nota(s) de R$ 10.00
1 nota(s) de R$ 5.00
0 nota(s) de R$ 2.00
MOEDAS:
1 moeda(s) de R$ 1.00
1 moeda(s) de R$ 0.50
0 moeda(s) de R$ 0.25
2 moeda(s) de R$ 0.10
0 moeda(s) de R$ 0.05
3 moeda(s) de R$ 0.01
*/

import java.util.*;

public class uri1021 {
    public static void main (String args[]) {
        System.out.println("valor:");
        Scanner ler = new Scanner(System.in);
        float  valor = ler.nextFloat();
        int cem, cinq, vinte, dez, cinco, dois, um, ccinq, cvtcinco, cdez, ccinco, cum;
        cem = (int) (valor/100.0);
       // cinq = (int) (valor-cem*100)/50;
        cinq = (int) (valor % 100) / 50;
       // vinte = (int) (((valor-cem*100)-cinq*50)/20);
        vinte = (int) ((valor % 100) % 50) / 20;
       // dez = (int) ((valor-(cem*100)-(cinq*50)-(vinte*20))/10);
        dez = (int) (((valor % 100) % 50) % 20) / 10;
       // cinco = (int) ((valor-(cem*100)-(cinq*50)-(vinte*20)-(dez*10))/5);
        cinco = (int) ((((valor% 100) % 50) % 20) % 10) / 5;
       // dois = (int) ((valor-(cem*100)-(cinq*50)-(vinte*20)-(dez*10)-(cinco*5))/2);
        dois = (int) (((((valor% 100) % 50) % 20) % 10) % 5) / 2;

        um = (int) (((((((valor%100)%50)%20)%10)%5)%2)/1);
        ccinq = (int) (((((((((valor%100)%50)%20)%10)%5)%2)%1))/0.50);
        cvtcinco = (int) ((((((((((valor%100)%50)%20)%10)%5)%2)%1)%0.50))/0.25);
        cdez = (int) ((((((((((valor%100)%50)%20)%10)%5)%2)%1)%0.50)%0.25)/0.10);
        ccinco = (int) ((((((((((((valor%100)%50)%20)%10)%5)%2)%1)%0.50)%0.25))%0.10)/0.05);
        cum = (int) (((((((((((((valor%100)%50)%20)%10)%5)%2)%1)%0.50)%0.25))%0.10)%0.05)/0.01);

        System.out.println("NOTAS:");
        System.out.println(cem + " nota(s) de R$ 100.00");
        System.out.println(cinq + " nota(s) de R$ 50.00");
        System.out.println(vinte + " nota(s) de R$ 20.00");
        System.out.println(dez + " nota(s) de R$ 10.00");
        System.out.println(cinco + " nota(s) de R$ 5.00");
        System.out.println(dois + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(um + " moeda(s) de R$ 1.00");
        System.out.println(ccinq + " moeda(s) de R$ 0.50");
        System.out.println(cvtcinco + " moeda(s) de R$ 0.25");
        System.out.println(cdez + " moeda(s) de R$ 0.10");
        System.out.println(ccinco + " moeda(s) de R$ 0.05");
        System.out.println(cum + " moeda(s) de R$ 0.01");
    }
}
