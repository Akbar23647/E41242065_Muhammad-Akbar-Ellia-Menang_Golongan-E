/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cafeceria;

import java.util.Scanner;

/**
 *
 * @author MUHAMMAD AKBAR ELLIA
 */
public class CafeCeria {

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("CAFE CERIA");
            System.out.println("ANEKA MINUMAN");
            System.out.println("------------------------------");
            System.out.println("SPECIAL MENU :");
            System.out.println("1. Soft drinks");
            System.out.println("2. Mix juice");
            System.out.println("3. Nescafe");
            System.out.println("4. Soda milk");
            System.out.println("5. Tea");
            System.out.println("------------------------------");
            
            System.out.print("Masukkan nama pembeli: ");
            String nama = input.nextLine();
            
            System.out.print("Silahkan masukkan pilihan anda : ");
            int pilihan = input.nextInt();
            
            String minuman;
            minuman = switch (pilihan) {
                case 1 -> "Soft drinks";
                case 2 -> "Mix juice";
                case 3 -> "Nescafe";
                case 4 -> "Soda milk";
                case 5 -> "Tea";
                default -> "Pilihan tidak tersedia";
            };
            
            if (!minuman.equals("Pilihan tidak tersedia")) {
                System.out.println("Minuman yang anda pesan adalah " + minuman);
                System.out.println("Pesanan akan segera kami antar");
            } else {
                System.out.println(minuman);
            }
            
            System.out.println("Terima kasih " + nama + " telah berkunjung di Cafe Ceria");
        }
    }
}
