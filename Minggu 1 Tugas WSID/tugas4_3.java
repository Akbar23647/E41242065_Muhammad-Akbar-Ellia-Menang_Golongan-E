/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author MUHAMMAD AKBAR ELLIA
 */
public class tugas4_3 {
    public static void main(String[] args) {

        // Inisialisasi type data
        int Proyek, waktu;
        char UmpanBalik;
        String evaluasi = null;

        // Input Variabel
        Proyek = 20;
        waktu = 7; // Hari
        UmpanBalik = 'A'; // A = Selalu positif, B = Sebagian besar positif

        // Algoritma penentuan hasil evaluasi
        if (Proyek > 20 && waktu < 7 && UmpanBalik == 'A') {
            evaluasi = "Sangat Memuaskan";
        } else if (Proyek < 20 && Proyek > 10 && waktu <= 14 && waktu >= 7 && UmpanBalik == 'B') {
            evaluasi = "Memuaskan";
        }

        // Mencetak hasil evaluasi
        System.out.println("Hasil Evaluasi : " + evaluasi);

    }
    
}
