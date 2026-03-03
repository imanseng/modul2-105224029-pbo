import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan celcius: ");
        double celcius = input.nextDouble();

        double fahrenheit = (celcius * 9/5) + 32;
        double kelvin = celcius + 273.15;
        double reamur = celcius * 4/5;

        System.out.printf("Celcius\t\t: %.2f °C\n", celcius);
        System.out.printf("Fahrenheit\t: %.2f °F\n", fahrenheit);
        System.out.printf("Kelvin\t\t: %.2f K\n", kelvin);
        System.out.printf("Reamur\t\t: %.2f °R\n", reamur);

        input.close();
    }
}
