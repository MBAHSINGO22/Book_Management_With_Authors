package Modul_5;

// Import kelas Scanner dari java.util untuk membaca input dari pengguna
import java.util.Scanner;

// Deklarasi kelas Buku
class Buku {
    // Atribut untuk menyimpan kode buku
    String kodeBuku;
    // Atribut untuk menyimpan judul buku
    String judul;
    // Atribut untuk menyimpan array dari objek Pengarang
    Pengarang[] pengarang;
    // Atribut untuk menyimpan tahun terbit buku
    int tahunTerbit;

    // Konstruktor untuk menginisialisasi objek Buku dengan kodeBuku, judul, dan tahunTerbit
    Buku(String kodeBuku, String judul, int tahunTerbit) {
        // Menginisialisasi atribut kodeBuku dengan nilai yang diterima sebagai parameter
        this.kodeBuku = kodeBuku;
        // Menginisialisasi atribut judul dengan nilai yang diterima sebagai parameter
        this.judul = judul;
        // Menginisialisasi atribut tahunTerbit dengan nilai yang diterima sebagai parameter
        this.tahunTerbit = tahunTerbit;
    }

    // Metode untuk mengatur array pengarang
    void setPengarang(Pengarang[] pengarang) {
        // Menginisialisasi atribut pengarang dengan array yang diterima sebagai parameter
        this.pengarang = pengarang;
    }

    // Metode untuk mendapatkan array pengarang
    Pengarang[] getPengarang() {
        // Mengembalikan array pengarang
        return this.pengarang;
    }
}