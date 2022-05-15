import java.security.InvalidParameterException;
import java.util.Scanner;

public class Calculadora {

    public Double realizarCalculo(Operacao operacao, Double num1, Double num2) {
        if (operacao == null)
            throw new InvalidParameterException("Operacao invalida");

        return operacao.calcular(num1, num2);
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Primeiro numero: ");
        double num1 = entrada.nextDouble();

        System.out.print("Operacao (+, -, /, *): ");
        char op = entrada.next().charAt(0);

        System.out.print("Segundo numero: ");
        double num2 = entrada.nextDouble();

        Operacao operacao;

        switch (op) {
            case '+':
                operacao = new Adicao();
                break;
            case '-':
                operacao = new Subtracao();
                break;
            case '*':
                operacao = new Multiplicacao();
                break;
            case '/':
                operacao = new Divisao();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + op);
        }

        var resultado = calc.realizarCalculo(operacao, num1, num2);
        System.out.print("Resultado: " + resultado);

    }
}
