// Hafizh Arrasyiid Syahbana
// 254107060026
// SIB 1A
// SOAL KE-3
// https://github.com/nNasq/KUIS2_PRAKTIKUM/tree/main/Kuis2/src

import java.util.Scanner;

public class Soal310 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // deklarasi double array penjualan
        int[][] penjualan = new int[7][4];
        
        String[] namaProduk = {"Produk A", "Produk B", "Produk C", "Produk D"};
        String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};

        // Masukkan data penjualan
        System.out.println("Masukkan data penjualan produk selama seminggu:");
        for (int i = 0; i < 7; i++) {
            System.out.println("\nHari " + namaHari[i] + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print(" Jumlah penjualan " + namaProduk[j] + ": ");
                penjualan[i][j] = sc.nextInt();
            }
        }

        // Menu berulang 
        int pilihan;
        do {
            // Menampilkan menu
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tampilkam Total penjualan per produk");
            System.out.println("2. Tampilkan Total penjualan harian");
            System.out.println("3. Tampilkan Produk dengan penjualan tertinggi");
            System.out.println("4. Tampilkan Hari dengan penjualan tertinggi");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = sc.nextInt();

            // Menangani pilihan menu
            switch (pilihan) {
                // Implementasi setiap pilihan menu
                // Total penjualan per produk
                case 1:
                    System.out.println("\n--- Total Penjualan Per Produk ---");
                    for (int p = 0; p < 4; p++) {
                        int total = 0;
                        for (int h = 0; h < 7; h++) {
                            total += penjualan[h][p];
                        }
                        System.out.println("Produk " + namaProduk[p] + ": " + total);
                    }
                    break;

                // Total penjualan harian
                case 2:
                    System.out.println("\n--- Total Penjualan Per Hari ---");
                    for (int h = 0; h < 7; h++) {
                        int total = 0;
                        for (int p = 0; p < 4; p++) {
                            total += penjualan[h][p];
                        }
                        System.out.println(namaHari[h] + ": " + total);
                    }
                    break;

                // Produk dengan penjualan tertinggi
                case 3:
                    System.out.println("\n--- Produk dengan Penjualan Tertinggi ---");
                    int idxProdukMax = 0;
                    int maxProduk = 0;

                    for (int p = 0; p < 4; p++) {
                        int total = 0;
                        for (int h = 0; h < 7; h++) {
                            total += penjualan[h][p];
                        }
                        if (total > maxProduk) {
                            maxProduk = total;
                            idxProdukMax = p;
                        }
                    }

                    System.out.println("Produk dengan penjualan tertinggi: " +
                            namaProduk[idxProdukMax] + " (" + maxProduk + ")");
                    break;

                // Hari dengan penjualan tertinggi
                case 4:
                    System.out.println("\n--- Hari dengan Penjualan Tertinggi ---");
                    int idxHariMax = 0;
                    int maxHari = 0;

                    for (int h = 0; h < 7; h++) {
                        int total = 0;
                        for (int p = 0; p < 4; p++) {
                            total += penjualan[h][p];
                        }
                        if (total > maxHari) {
                            maxHari = total;
                            idxHariMax = h;
                        }
                    }

                    System.out.println("Hari dengan penjualan tertinggi: " +
                            namaHari[idxHariMax] + " (" + maxHari + ")");
                    break;

                case 5:
                    System.out.println("Keluar dari program");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan!=5);
    }
}
