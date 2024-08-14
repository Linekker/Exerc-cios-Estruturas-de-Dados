import java.util.*;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.print("Digite dois inteiros: ");

        a = sc.nextInt();
        b = sc.nextInt();

        System.out.printf("Máximo divisor comum: %d\n", calcularMdc(a, b));

        sc.close();
    }

    static int calcularMdc(int a, int b) {

        if (b == 0)
            return a;

        return calcularMdc(b, a % b);
    }
}
