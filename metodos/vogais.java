package metodos;

public class vogais {
    private static int contarVogais(String texto) {
        int contarVogais = 0;

        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contarVogais++;
            }
        }
        return contarVogais;
    }

    public static void main(String[] args) {
        // Exemplo de uso
        String texto = "Toda dor é passageira, lembre-se";
        int quantidadeVogais = contarVogais(texto);
        System.out.println("O texto \"" + texto + "\" tem " + quantidadeVogais + " vogais.");
    }
}
