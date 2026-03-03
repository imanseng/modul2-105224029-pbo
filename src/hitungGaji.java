import java.util.Scanner;

public class hitungGaji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== SISTEM PAYROLL PERUSAHAAN ===");
        System.out.print("Nama Karyawan\t: ");
        String namaKaryawan = input.nextLine();
        System.out.print("Gaji Pokok (Rp)\t: ");
        double gajiPokok = input.nextDouble(); 
        System.out.print("Jumlah Jam Lembur : ");
        int jamLembur = input.nextInt();
        
        // 1. Upah Lembur per Jam (Gaji Pokok / 173)
        double upahLembur = gajiPokok / 173;
        // 2. Total Uang Lembur (Jam Lembur * Upah Lembur per Jam)
        double totalUangLembur = jamLembur * upahLembur;
        // 3. Gaji Kotor (Bruto) (Gaji Pokok + Total Uang Lembur)
        double gajiKotor = gajiPokok + totalUangLembur;
        // 4. Pajak Penghasilan (5% dari Gaji Kotor)
        double pajak = 0.05 * gajiKotor;
        // 5. Potongan BPJS (1% dari Gaji Pokok)
        double bpjs = 0.01 * gajiPokok;
        // 6. Gaji Bersih (Netto) (Gaji Kotor - Pajak - BPJS)
        double gajiBersih = gajiKotor - pajak - bpjs;

        System.out.println("Karyawan          : " + namaKaryawan);
        System.out.println("Upah Lembur/Jam   : Rp " + upahLembur);
        System.out.println("Total Uang Lembur : Rp " + totalUangLembur);
        System.out.println("Gaji Bruto        : Rp " + gajiKotor);
        System.out.println("---------------------------------");
        System.out.println("Potongan Pajak    : Rp " + pajak);
        System.out.println("Potongan BPJS     : Rp " + bpjs);
        System.out.println("---------------------------------");
        System.out.println("GAJI BERSIH       : Rp " + gajiBersih);
        input.close();
    }
}
