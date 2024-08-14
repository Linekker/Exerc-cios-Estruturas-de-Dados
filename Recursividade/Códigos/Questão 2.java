import java.util.*;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int m, n, inicio;

        System.out.println("Digite m e n");
        m = sc.nextInt();
        n = sc.nextInt();

        inicio = m;

        System.out.println("Resultado: " + soma(m, n, inicio));

        sc.close();

    }

    public static int soma(int m, int n , int inicio) {

        if (n == inicio) {
            return m;
        }

        return m + soma(m + 1, n - 1, inicio);

    }
}
