/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bilangangenap;

/**
 *
 * @author MUHAMMAD AKBAR ELLIA
 */
public class BilanganGenap {

    public static void main(String[] args) {
        int batasAwal = 2; 
        int batasAkhir = 60; 
        
        // Menampilkan bilangan genap menggunakan perulangan for 
        System.out.println("Bilangan genap dari " + batasAwal + " hingga " + batasAkhir + " adalah:");
        for (int i = batasAwal; i <= batasAkhir; i += 2) {
            System.out.print(i + " ");
        }
    }
}
