import java.util.Scanner;

public class Teste {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String expressao;
        System.out.print("Digite a expressão em notação polonesa reversa: ");
        expressao = sc.nextLine();
        PilhaFlexivel pi = new PilhaFlexivel();

        for (int i = 0; i < expressao.length(); i++) {
            char c = expressao.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/') {
                
                double a = pi.remover();
                double b = pi.remover();
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
                pi.inserir(resultado);
            } else {
                int valorFinal = Character.getNumericValue(c);
                pi.inserir(valorFinal);
            }
        }
        pi.mostrar();
    }
}