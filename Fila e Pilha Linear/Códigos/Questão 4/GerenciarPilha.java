import java.util.Scanner;

public class GerenciarPilha {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int num1 = 1, num2 = 1;

        System.out.print("Digite um valor inteiro positivo n: ");
        int n = sc.nextInt();

        Pilha p = new Pilha(n);

        p.inserirFim(1);
        p.inserirFim(1);

        for (int i = 2; i < n; i++) {
            int fib = num1 + num2;
            p.inserirFim(fib);
            num1 = num2;
            num2 = fib;
        }
        p.mostrarPilhaInvertida();

        sc.close();

    }
}