import java.util.Scanner;

public class main {
    public static void main(String[] arg) {

        Scanner digitado = new Scanner(System.in);

        int operacao;
        int operacao2;

        System.out.println("Informe o qual operação deseja realizar: 1- Somar, 2- Subtrair, 3- Multiplicar, 4- Dividir: ");
        operacao = digitado.nextInt();

        while (operacao > 4) {
            System.out.println("Informe um valor valido 1- Somar, 2- Subtrair, 3- Multiplicar, 4- Dividir");
            System.out.println("Informe o qual operação deseja realizar: ");
            operacao = digitado.nextInt();
        }

        if (operacao == 1) {
            System.out.println("Informe o primeiro valor: ");
            int n1 = digitado.nextInt();
            System.out.println("Informe o segundo valor: ");
            int n2 = digitado.nextInt();
            System.out.println("A soma dos dois valores é: " + (n1 + n2));
        }
        if (operacao == 2) {
            System.out.println("Informe o primeiro valor: ");
            int n1 = digitado.nextInt();
            System.out.println("Informe o segundo valor: ");
            int n2 = digitado.nextInt();
            System.out.println("A soma dos dois valores é: " + (n1 - n2));
        }
        if (operacao == 3) {
            System.out.println("Informe o primeiro valor: ");
            int n1 = digitado.nextInt();
            System.out.println("Informe o segundo valor: ");
            int n2 = digitado.nextInt();
            System.out.println("A soma dos dois valores é: " + (n1 * n2));
        }
        if (operacao == 4) {
            System.out.println("Informe o primeiro valor: ");
            int n1 = digitado.nextInt();
            System.out.println("Informe o segundo valor: ");
            int n2 = digitado.nextInt();
            System.out.println("A divisão dos dois valores é: " + (n1 / n2));
            System.out.println("e o resto da divisão é:" + (n1 % n2));
        }
        else {
            System.out.println("Até breve.");
        }
    }
}