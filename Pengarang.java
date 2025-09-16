package Modul_5;

// Import kelas Scanner dari java.util untuk membaca input dari pengguna
import java.util.Scanner;

// Deklarasi kelas Pengarang
class Pengarang {
    // Atribut untuk menyimpan NIK (Nomor Induk Kependudukan)
    String NIK;
    // Atribut untuk menyimpan nama
    String nama;
    // Atribut untuk menyimpan alamat
    String alamat;

    // Konstruktor untuk menginisialisasi objek Pengarang dengan NIK, nama, dan alamat
    Pengarang(String NIK, String nama, String alamat) {
        // Menginisialisasi atribut NIK dengan nilai yang diterima sebagai parameter
        this.NIK = NIK;
        // Menginisialisasi atribut nama dengan nilai yang diterima sebagai parameter
        this.nama = nama;
        // Menginisialisasi atribut alamat dengan nilai yang diterima sebagai parameter
        this.alamat = alamat;
    }
}

