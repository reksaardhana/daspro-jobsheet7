import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket;
        int totalTiket = 0;
        int hargaTiket = 50000;
        double diskon;
        double totalBayar;
        double totalPenjualan = 0;

        System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
        jumlahTiket = sc.nextInt();

        while (jumlahTiket != 0) {
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan ulang!");
            } else {
                if (jumlahTiket > 10) {
                    diskon = 0.15;
                } else if (jumlahTiket > 4) {
                    diskon = 0.10;
                } else {
                    diskon = 0;
                }

                totalBayar = jumlahTiket * hargaTiket;
                totalBayar = totalBayar - (totalBayar * diskon);
                totalTiket += jumlahTiket;
                totalPenjualan += totalBayar;

                System.out.println("Jumlah tiket: " + jumlahTiket);
                System.out.println("Diskon: " + (diskon * 100) + "%");
                System.out.println("Total bayar: Rp " + totalBayar);
            }
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();
        }
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalPenjualan);
        sc.close();
    }
}