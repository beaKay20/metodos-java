package metodos;
import java.util.Arrays;


public class orderCrescente {
    public static void ordenarCrescente(int[] array) {
        int n = array.length;
        boolean troca;

        do {
            troca = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    // Trocar elementos se estiverem fora de ordem
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    troca = true;
                }
            }
            n--;
        } while (troca);
    }

    public static void main(String[] args) {
        // Exemplo de uso
        int[] numeros = {5, 2, 8, 1, 7};

        System.out.println("Números antes de ordenar na ordem crescente: " + Arrays.toString(numeros));

        ordenarCrescente(numeros);

        System.out.println("Array após a ordenação dos números em crescente: " + Arrays.toString(numeros));
    }
}
