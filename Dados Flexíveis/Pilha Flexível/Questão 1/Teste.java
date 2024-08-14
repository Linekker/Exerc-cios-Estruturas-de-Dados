
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 1, num2 = 1, n;
        System.out.print("Digite um valor inteiro positivo n: ");
        n = sc.nextInt();
        PilhaFlexivel p = new PilhaFlexivel();
        p.inserir(1);
        p.inserir(1);

        for (int i = 2; i < n; i++) {
            int fib = num1 + num2;
            p.inserir(fib);
            num1 = num2;
            num2 = fib;
        }
        p.mostrar();
        sc.close();

    }

}
