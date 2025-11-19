// Hafizh Arrasyiid Syahbana
// 254107060026
// SIB 1A
// SOAL KE-2
// https://github.com/nNasq/KUIS2_PRAKTIKUM/tree/main/Kuis2/src

import java.util.Scanner;

public class Soal210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Meminta input jumlah kota k
        System.out.print("Masukkan jumlah kota k : ");
        int k = sc.nextInt();
        // Meminta input jumlah hari h
        System.out.print("Masukkan jumlah hari h : ");
        int h = sc.nextInt();
        
        // deklarasi double array suhu
        double[][] suhu = new double[k][h];

        // Menginput data suhu
        System.out.println("\nMasukkan data suhu : ");
        for (int i = 0; i < k; i++) {
            System.out.println("\nKota ke-" + (i + 1));
            for (int j = 0; j < h; j++) {
                System.out.print(" hari ke-" + (j + 1) + " : ");
                suhu[i][j] = sc.nextDouble();
            }
        }

        System.out.println("\n=== HASIL PER KOTA ===");
        // Menyimpan rata-rata suhu per kota
        double[] rataKota = new double[k];

        // Menghitung suhu maksimum, minimum, dan rata-rata per kota
        for (int i = 0; i < k; i++) {
            double max = suhu[i][0];
            double min = suhu[i][0];
            double total = 0;

            for (int j = 0; j < h; j++) {
                double s = suhu[i][j];
                total += s;

                if (s > max) max = s;
                if (s < min) min = s;
            }

            double rata = total / h;
            rataKota[i] = rata;

            //menampilkan hasil suhu maksimum,minimum, dan rata" per kota
            System.out.println("\nKota ke-" + (i + 1) + " : ");
            System.out.println(" Suhu maksimum : " + max);
            System.out.println(" Suhu minimum  : " + min);
            System.out.printf(" Rata-rata suhu: %.2f\n", rata);
        }

        // Mencari kota dengan rata-rata suhu tertinggi dan terendah
        double maxRata = rataKota[0];
        double minRata = rataKota[0];
        int kotaMax = 0;
        int kotaMin = 0;

        // Menemukan kota dengan rata-rata suhu tertinggi dan terendah
        for (int i = 1; i < k; i++) {
            if (rataKota[i] > maxRata) {
                maxRata = rataKota[i];
                kotaMax = i;
            }
            if (rataKota[i] < minRata) {
                minRata = rataKota[i];
                kotaMin = i;
            }
        }

        // menampilkan hasil akhir
        System.out.println("\n=== HASIL AKHIR ===");
        System.out.println("Kota dengan rata-rata suhu tertinggi : Kota ke-" + (kotaMax + 1) + " dengan rata-rata " + maxRata);
        System.out.println("Kota dengan rata-rata suhu terendah  : Kota ke-" + (kotaMin + 1) + " dengan rata-rata " + minRata);
    }
}