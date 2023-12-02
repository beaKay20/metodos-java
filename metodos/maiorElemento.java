package metodos;

public class maiorElemento {
    public static int encontrarMaiorElemento(int[][] matriz) {
        int maiorElemento = Integer.MIN_VALUE;

        for (int[] linha : matriz) {
            for (int elemento : linha) {
                if (elemento > maiorElemento) {
                    maiorElemento = elemento;
                }
            }
        }

        return maiorElemento;
    }

    public static void main(String[] args) {
        // Exemplo de uso
        int[][] matriz = {
                {1, 5, 3},
                {8, 2, 7},
                {4, 6, 9}
        };

        int maiorElemento = encontrarMaiorElemento(matriz);

        System.out.println("O maior elemento na matriz é: " + maiorElemento);
    }
}
