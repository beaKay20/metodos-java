package metodos;

import java.util.Scanner;

public class Soma {
    static int soma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Crie um método chamado soma que recebe dois números como parâmetros e retorna a soma deles.");

        System.out.print("Informe o primeiro número: ");
        int num1 = scanner.nextInt();


        System.out.print("Informe o segundo número: ");
        int num2 = scanner.nextInt();


        int resultado = soma(num1, num2);
        System.out.println("A soma dos números é: " + resultado);
        scanner.close();
    }
}
