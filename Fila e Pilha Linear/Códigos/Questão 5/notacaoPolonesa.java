import java.util.Scanner;

public class notacaoPolonesa {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String expressao;

        System.out.print("Digite a expressão em notação polonesa reversa: ");
        expressao = sc.nextLine();

        Pilha pi = new Pilha(5);

        for (int i = 0; i < expressao.length(); i++) {
            char c = expressao.charAt(i);

            if (c == '+' || c == '-' || c == '*' || c == '/') {

                double a = pi.removerFim();
                double b = pi.removerFim();

                double resultado = 0;

                switch (c) {
                    case '+':
                        resultado = b + a;
                        break;
                    case '-':
                        resultado = b - a;
                        break;
                    case '*':
                        resultado = b * a;
                        break;
                    case '/':
                        resultado = b / a;
                        break;
                }

                pi.inserirFim(resultado);

            } else {
                int valorFinal = Character.getNumericValue(c);
                pi.inserirFim(valorFinal);
            }
        }

        pi.mostrarPilha();

    }
}