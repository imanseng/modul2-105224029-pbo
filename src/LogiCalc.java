import java.util.Scanner;

// Iman Dwi Satrio (105224029)
// Take Home Task Basic Java 1

public class LogiCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("SISTEM LOGICALC FASTSEND");
        System.out.print("Masukkan Nama Klien: ");
        String namaKlien = input.nextLine();

        System.out.print("Masukkan Berat (Kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan Jarak (Km): ");
        int jarak = input.nextInt();

        System.out.print("Masukkan Jumlah Box: ");
        int jumlahBox = input.nextInt();

        // 1. Manajemen Armada (1 Truk = 150 Box)
        int trukPenuh = jumlahBox / 150;
        int sisaBox = jumlahBox % 150;

        // 2. Estimasi Waktu (Kecepatan 60 km/jam). karena 60km/jam, maka 1 km = 1 menit
        int jam = jarak / 60;
        int menit = jarak % 60;

        // 3. Kalkulasi Biaya
        double tarifJarak = 15000.0 * jarak;
        double tarifBerat = 5500.0 * berat;
        double dasarBiaya = tarifJarak + tarifBerat;
        double asuransi = 0.035 * dasarBiaya;
        double totalBayar = dasarBiaya + asuransi;

        System.out.println("=== RESI PENGIRIMAN ===");
        System.out.println("Klien: " + namaKlien);
        System.out.println("Total Box: " + jumlahBox + " box");
        System.out.println("Kebutuhan Armada: [" + trukPenuh + "] Truk Penuh dan sisa [" + sisaBox + "] box via Pikap.");
        System.out.println("Estimasi Waktu: [" + jam + "] Jam [" + menit + "] Menit (Asumsi 60km/jam)");

        System.out.println("\n=== RINCIAN BIAYA ===");
        System.out.println("Dasar Biaya: Rp [" + dasarBiaya + "]");
        System.out.println("Asuransi (3.5%): Rp [" + asuransi + "]");
        System.out.println("-----------------------------------");
        System.out.println("TOTAL BAYAR: Rp [" + totalBayar + "]");

        input.close();
    }
}
