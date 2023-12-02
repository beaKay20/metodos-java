package metodos;

import java.util.Scanner;

public class numeroPrimo {
    static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                // Se o número for divisível por algum outro número, não é primo
                return false;
            }
        }
        // Se nenhum divisor for encontrado, o número é primo
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número para verificar se é primo: ");
        int numero = sc.nextInt();

        // Verifica se o número informado é primo e exibe o resultado
        System.out.println(numero + " é primo? " + ehPrimo(numero));

        sc.close();
    }
}
