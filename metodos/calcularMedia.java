package metodos;

public class calcularMedia {
    static double calculoMedia(int[] numeros) {
        if (numeros.length == 0) {
            System.out.println("Array vazio, não é possível calcular a média.");
            return 0;
        }
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        double media = (double) soma / numeros.length;
        return media;
    }

    public static void main(String[] args) {
        int[] arrayNumeros = {10, 5, 8, 12, 7};

        double resultadoMedia = calculoMedia(arrayNumeros);
        System.out.println("A média dos números no array é: " + resultadoMedia);
    }
}
