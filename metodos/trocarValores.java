package metodos;

public class trocarValores {
    public static void trocarValores(int a, int b) {
        System.out.println("Valores antes da troca: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Valores depois da troca: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;

        System.out.println("Valores originais: numero1 = " + numero1 + ", numero2 = " + numero2);

        trocarValores.trocarValores(numero1, numero2);

        System.out.println("Valores originais após o método: numero1 = " + numero1 + ", numero2 = " + numero2);
    }
}
