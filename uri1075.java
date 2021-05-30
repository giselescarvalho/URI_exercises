import java.util.Scanner;

public class uri1075 {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        int a = ler.nextInt();

        for (int c = 1; a < 10000; a++){
            if (c % a == 2)
                System.out.println(c);
        }

    }
}

/*Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	for (int i = 1; i < 10000; i++) {
    		if (i % N == 2) System.out.println(i);
    	}
	}

}*/