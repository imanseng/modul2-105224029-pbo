import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan detik: ");
        int inputDetik = input.nextInt();
        int jam = inputDetik / 3600;
        int menit = (inputDetik % 3600) / 60;
        int detik = inputDetik % 60;

        // Menampilkan hasil
        System.out.println("Hasil: " + jam + " Jam, " + menit + " Menit, " + detik + " Detik.");

        input.close();
    }
}
