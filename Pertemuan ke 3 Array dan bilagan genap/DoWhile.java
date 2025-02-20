/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bilangangenap;

/**
 *
 * @author MUHAMMAD AKBAR ELLIA
 */
public class DoWhile {
    public static void main(String[] args) {
        System.out.println("Bilangan kelipatan 2 (1-100)");
        System.out.println("============================");

        int i = 1;
        do {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 100);
    }
    
}
