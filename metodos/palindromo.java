package metodos;

public class palindromo {
    public static boolean ehPalindromo(String str) {
        String textoFormatado = str.replaceAll("\\s", "").toLowerCase();

        int comprimento = textoFormatado.length();

        for (int i = 0; i < comprimento / 2; i++) {
            if (textoFormatado.charAt(i) != textoFormatado.charAt(comprimento - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String palavra1 = "radar";
        String palavra2 = "java";

        System.out.println(palavra1 + " é um palíndromo? " + ehPalindromo(palavra1));
        System.out.println(palavra2 + " é um palíndromo? " + ehPalindromo(palavra2));
    }
}
