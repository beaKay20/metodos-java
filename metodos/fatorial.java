package metodos;

public class fatorial {
    public static int calcularFatorial(int numero){
        if (numero  == 0 || numero == 1){
            return 1;
        } else {
            return numero * calcularFatorial(numero - 1);
        }
    }
    public static void main (String[] args){
        int numFatorial = 5;
        int resultado = calcularFatorial(numFatorial);
    System.out.println("O fatorial de "+numFatorial+ " é: "+resultado);
    }
}
