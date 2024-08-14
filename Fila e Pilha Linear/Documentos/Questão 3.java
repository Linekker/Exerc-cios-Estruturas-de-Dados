import java.util.*;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        decimalParaBinario(25);

    }

    public static void decimalParaBinario(int num) {

        if (num > 0) {
            decimalParaBinario(num / 2);
            System.out.print(num % 2);

        }

    }
}
