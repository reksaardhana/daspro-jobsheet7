import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jenisKendaraan;
        int lamaParkir;
        int totalBayar = 0;

        while (true) {
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("0. Selesai");
            System.out.print("Masukkan jenis kendaraan: ");
            jenisKendaraan = input.nextInt();

            if (jenisKendaraan == 0) {
                break;
            }

            System.out.print("Lama parkir (jam): ");
            lamaParkir = input.nextInt();

            if (jenisKendaraan == 1) {
                int biaya = lamaParkir * 3000;
                totalBayar += biaya;
                System.out.println("Biaya parkir: Rp " + biaya);
            } else if (jenisKendaraan == 2) {
                int biaya = lamaParkir * 2000;
                totalBayar += biaya;
                System.out.println("Biaya parkir: Rp " + biaya);
            } else {
                System.out.println("Jenis kendaraan tidak valid.");
            }
        }
        System.out.println("Total pembayaran parkir: Rp " + totalBayar);
        input.close();
    }
}