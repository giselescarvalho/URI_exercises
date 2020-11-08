package uri;
import java.util.Scanner;
import java.io.IOException;
public class uri1073 {
	Scanner input = new Scanner(System.in);
    int N;
    N = input.nextInt();

    for (int i=2; i<=N; i+=2) {
        System.out.println(i + "^2 = " + i*i);
    }
}

}

