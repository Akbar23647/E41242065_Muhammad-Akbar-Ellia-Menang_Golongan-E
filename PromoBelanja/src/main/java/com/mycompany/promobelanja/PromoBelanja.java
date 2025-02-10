/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.promobelanja;

import java.util.Scanner;

/**
 *
 * @author MUHAMMAD AKBAR ELLIA
 */
public class PromoBelanja {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("----------------------------------------");
            System.out.println("Akdimi Plaza Jaya ( APJ )");
            System.out.println("Promo Belanja Berhadiah");
            System.out.println("Khusus Pembelian 5 Barang Pertama");
            System.out.println("Dengan harga minimum Rp 10000,00");
            System.out.println("========================================");
            
            System.out.print("Masukkan nama pembeli: ");
            String nama = input.nextLine();
            
            int totalHarga = 0;
            for (int i = 1; i <= 5; i++) {
                System.out.print("Masukkan harga barang ke-" + i + " : ");
                int harga = input.nextInt();
                totalHarga += harga;
            }
            
            System.out.println("\nTotal harga pembelian atas nama " + nama + " adalah Rp " + totalHarga);
            
            if (totalHarga >= 100000) {
                System.out.println("\nSelamat....");
                System.out.println("Anda mendapat hadiah 1 buah hadiah menarik");
            }
            
            System.out.println("----------------------------------------");
            System.out.println("Terima Kasih");
            System.out.println("Anda sudah belanja di Akdimi Plaza Jaya");
        }
    }
}
