// Hafizh Arrasyiid Syahbana
// 254107060026
// SIB 1A
// SOAL KE-1
// https://github.com/nNasq/KUIS2_PRAKTIKUM/tree/main/Kuis2/src

import java.util.Scanner;

public class Soal110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Meminta input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();

        // Membaca n nilai dan menyimpannya dalam array
        int[] nilai = new int[n];

        System.out.println("\nMasukkan nilai mahasiswa:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        // Menghitung rata-rata, jumlah lulus dan tidak lulus
        int total = 0;
        int lulus = 0;
        int tidakLulus = 0;

        for (int i = 0; i < n; i++) {
            total += nilai[i];

            if (nilai[i] >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        double rataRata = (double) total / n;

        //  Menampilkan seluruh nilai, rata-rata, jumlah lulus & tidak lulus
        System.out.println("\n=== HASIL ===");
        System.out.print("Nilai yang diinput: ");
        for (int i = 0; i < n; i++) {
            System.out.print(nilai[i] + " ");
        }

        System.out.println("\nRata-rata nilai: " + rataRata);
        System.out.println("Jumlah mahasiswa lulus     : " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);
    }
}

