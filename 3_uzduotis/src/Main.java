import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Temperature temperature = new Temperature();
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println("Temperatūrų skalės.");
        System.out.print("Įveskite temperatūrą Kelvino skalėje :");
        temperature.setTKelvin(reader.nextDouble());
        reader.close();
        System.out.println("1. "+decimalFormat.format(temperature.kelvinToCelcius())+" Celsijaus laipsnių");
        System.out.println("2. "+decimalFormat.format(temperature.kelvinToFarenheit())+" Farenheito laipsnių");
        System.out.println("3. "+decimalFormat.format(temperature.kelvinToReomur())+" Reomurio laipsnių");
        System.out.println("Programa darbą baigė. Ačiū kad skaičiavote.");

        // write your code here
    }
}
