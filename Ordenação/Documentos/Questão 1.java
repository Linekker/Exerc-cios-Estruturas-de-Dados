import java.util.*;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n1, n2;

        System.out.println("Digite o valor n1");
        n1 = sc.nextInt();

        System.out.println("Digite o valor de n2");
        n2 = sc.nextInt();

        System.out.println(multi(n1, n2));
        sc.close();

    }

    public static int multi(int n1, int n2) {

        if (n2 == 0) {
            return 1;
        }

        return n1 * multi(n1, n2 - 1);

    }
}
