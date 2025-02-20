/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.segitiga;

/**
 *
 * @author MUHAMMAD AKBAR ELLIA
 */
public class Segitiga {

    public static void main(String[] args) {
        int tinggi = 10; // Jumlah baris segitiga

        for (int i = 1; i <= tinggi; i++) {
            // Mencetak spasi
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }
            // Mencetak bintang
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Pindah ke baris berikutnya
            System.out.println();
        }
    }
}
