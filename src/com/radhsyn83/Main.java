package com.radhsyn83;

/*
 *
 * Fathur Radhy
 * 10115046
 * PDO11K
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner s = new Scanner(System.in);
        Kalkulator k = new Kalkulator();

        System.out.println("============ Aplikasi Kalkulator Bilangan ============");

        System.out.print("Masukkan angka ke-1 : ");
        k.setValue1(s.nextDouble());
        System.out.print("Masukkan angka ke-2 : ");
        k.setValue2(s.nextDouble());

        System.out.println("Hasil Pertambahan : "+k.tambahBilangan());
        System.out.println("Hasil Pengurangan : "+k.kurangBilangan());
        System.out.println("Hasil Perkalian : "+k.kaliBilangan());
        System.out.println("Hasil Pembagian : "+k.bagiBilangan());
        System.out.println("Hasil Sisa : "+k.sisaBilangan());
    }
}
