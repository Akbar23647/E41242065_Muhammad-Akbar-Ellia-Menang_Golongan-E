/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

/**
 *
 * @author MUHAMMAD AKBAR ELLIA
 */
public class Person {
    // Variabel untuk menyimpan nama dan usia
    private String name;
    private int age;

    // Konstruktor tanpa parameter
    public Person() {
        this.name = "";
        this.age = 0;
    }

    // Konstruktor dengan parameter untuk menginisialisasi name dan age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method untuk mendapatkan nama
    public String getName() {
        return name;
    }

    // Method untuk mendapatkan usia
    public int getAge() {
        return age;
    }

    // Method untuk mengatur usia
    public void setAge(int age) {
        this.age = age;
    }
}
