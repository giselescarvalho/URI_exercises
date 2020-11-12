/*
Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema abaixo, da esquerda para a direita.  Em seguida conclua qual dos animais seguintes foi escolhido, através das três palavras fornecidas.
 * Entrada
A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o animal segundo a figura acima, com todas as letras minúsculas.

Saída
Imprima o nome do animal correspondente à entrada fornecida.*/
package uri;
import java.io.IOException;
import java.util.Scanner;
public class uri1049 {
	public static void main(String[] args) throws IOException 
	{
	Scanner ler = new Scanner(System.in);

    String A, B, C;

    A = ler.next();
    B = ler.next();
    C = ler.next();

    if (A.equals("vertebrado") && B.equals("ave") && C.equals("carnivoro")) {
        System.out.print("aguia\n");
    }
    if (A.equals("vertebrado") && B.equals("ave") && C.equals("onivoro")) {
        System.out.print("pomba\n");
    }
    if (A.equals("vertebrado") && B.equals("mamifero") && C.equals("onivoro")) {
        System.out.print("homem\n");
    }
    if (A.equals("vertebrado") && B.equals("mamifero") && C.equals("herbivoro")) {
        System.out.print("vaca\n");
    }
    //-----------------------------------------------------------------

    if (A.equals("invertebrado") && B.equals("inseto") && C.equals("hematofago")) {
        System.out.print("pulga\n");
    }
    if (A.equals("invertebrado") && B.equals("inseto") && C.equals("herbivoro")) {
        System.out.print("lagarta\n");
    }
    if (A.equals("invertebrado") && B.equals("anelideo") && C.equals("hematofago")) {
        System.out.print("sanguessuga\n");
    }
    if (A.equals("invertebrado") && B.equals("anelideo") && C.equals("onivoro")) {
        System.out.print("minhoca\n");
    }

}

}