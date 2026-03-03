import java.util.Scanner;
public class aktivitasPraktikum {
    public static void main(String[] args) throws Exception {
        String nama = "Iman Dwi Satrio";
        int sks = 24;
        double ipk = 3.7;
        boolean isLulus = true;

        System.out.println("Nama\t: " + nama);
        System.out.println("SKS\t: " + sks);
        System.out.println("IPK\t: " + ipk);
        System.out.println("Lulus\t: " + isLulus);

        int a = 20, b = 10;
        int c = 10, d = 3;
        double hasil = c / d;

        System.out.println("a + b = " + (a + b));
        System.out.println("c - d = " + (c - d));
        System.out.println("a * b = " + (a * b));
        System.out.println("c / d = " + (c / d));
        System.out.println("c / d = " + hasil);
        System.out.println("c / d = " + ((double)a / b));

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tanggal lahir: ");
        int tanggalLahir = input.nextInt();
        System.out.print("Masukkan bulan lahir: ");
        int bulanLahir = input.nextInt();
        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = input.nextInt();
        System.out.println("Tanggal lahir: " + tanggalLahir + "-" + bulanLahir + "-" + tahunLahir);
        input.close();
    }
}
