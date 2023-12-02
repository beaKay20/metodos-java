package metodos;


import java.util.Scanner;

public class conversorTemp {

    public static double converterCelsiusParaFahrenheit(double temperaturaCelsius) {
        double temperaturaFahrenheit = (temperaturaCelsius * 9 / 5) + 32;
        return temperaturaFahrenheit;
    }

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Informe a temperatura em graus Celsiues para ser convertida: ");
        double temperaturaCelsius = sc.nextDouble();


        double temperaturaFahrenheit = converterCelsiusParaFahrenheit(temperaturaCelsius);

        System.out.println(temperaturaCelsius + " A temperatura em graus Celsius é equivalente a " + temperaturaFahrenheit + "F° graus Fahrenheit.");
    }

}

