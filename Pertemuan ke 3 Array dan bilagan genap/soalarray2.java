/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.array;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author MUHAMMAD AKBAR ELLIA
 */
public class soalarray2 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.print("Masukkan jumlah elemen array: ");
        int jumlah = scanner.nextInt();
        
        int[] arrayAcak = new int[jumlah];
        
        for (int i = 0; i < jumlah; i++) {
            arrayAcak[i] = random.nextInt(100) + 1; 
        }
        
        System.out.println("Array yang dihasilkan:");
        for (int angka : arrayAcak) {
            System.out.print(angka + " ");
        }

        scanner.close();

     }
        
}
