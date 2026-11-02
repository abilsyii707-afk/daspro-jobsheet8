import java.util.Scanner;
public class Tugas3_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahToko;
        int totalBarangSemuaToko = 0;
        int tokoTerbanyak = 1;
        int barangTerbanyak = -1;

        System.out.print("Masukkan jumlah toko: ");
        jumlahToko = sc.nextInt();

        while (jumlahToko < 1) {
            System.out.print("Jumlah toko minimal 1. Masukkan lagi: ");
            jumlahToko = sc.nextInt();
        }

        for (int toko = 1; toko <= jumlahToko; toko++) {

            int jumlahPelanggan;
            int totalBarangToko = 0;

            System.out.print("\nMasukkan jumlah pelanggan toko " + toko + ": ");
            jumlahPelanggan = sc.nextInt();

            while (jumlahPelanggan < 0) {
                System.out.print("Jumlah pelanggan tidak boleh negatif. Masukkan lagi: ");
                jumlahPelanggan = sc.nextInt();
            }

            for (int pelanggan = 1; pelanggan <= jumlahPelanggan; pelanggan++) {

                int jumlahBarang;

                System.out.print("Jumlah barang yang dibeli pelanggan " + pelanggan + ": ");
                jumlahBarang = sc.nextInt();

                while (jumlahBarang < 0) {
                    System.out.print("Jumlah barang tidak boleh negatif. Masukkan lagi: ");
                    jumlahBarang = sc.nextInt();
                }

                totalBarangToko += jumlahBarang;
            }

            totalBarangSemuaToko += totalBarangToko;

            System.out.println("Toko " + toko + " - pelanggan: "
                    + jumlahPelanggan + ", total barang: " + totalBarangToko);

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = toko;
            }
        }

        System.out.println("\nTotal barang seluruh toko: " + totalBarangSemuaToko);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);

        sc.close();
    }
}

      

       