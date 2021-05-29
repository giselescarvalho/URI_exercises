import java.util.Scanner;

public class uri1070 {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        int par = ler.nextInt();
        int cont = 0;

        while ( cont < 6){
            if (par % 2 == 1 ){
                System.out.println(par);
                cont++;
            }
        par++;
        }

    }
}
