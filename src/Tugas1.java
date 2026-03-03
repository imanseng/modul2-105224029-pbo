import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar: ");
        double lebar = input.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();

        // Hitung luas permukaan 4 sisi dinding
        double luasDinding = 2 * (panjang + lebar) * tinggi;

        // Hitung kebutuhan cat (1 liter = 10 m luas dinding)
        double literCat = Math.ceil(luasDinding / 10.0);

        System.out.println("Luas permukaan dinding : " + luasDinding + " m2");
        System.out.println("Jumlah cat yang dibutuhkan : " + (int)literCat + " Liter");

        input.close();
    }
}
