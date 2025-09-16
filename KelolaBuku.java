package Modul_5;

// Import kelas Scanner dari java.util untuk membaca input dari pengguna
import java.util.Scanner;

// Deklarasi kelas KelolaBuku
public class KelolaBuku {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan jumlah buku baru
        System.out.print("Masukkan jumlah buku baru: ");
        int jumlahBuku = input.nextInt();
        input.nextLine(); // membersihkan newline

        // Membuat array Buku dengan ukuran sesuai jumlah buku yang dimasukkan pengguna
        Buku[] daftarBuku = new Buku[jumlahBuku];

        // Loop untuk mengisi data buku
        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("\nMasukkan data untuk buku ke-" + (i + 1) + ":");

            System.out.print("Kode Buku: ");
            String kodeBuku = input.nextLine();

            System.out.print("Judul: ");
            String judul = input.nextLine();

            System.out.print("Tahun Terbit: ");
            int tahunTerbit = input.nextInt();
            input.nextLine(); // membersihkan newline

            System.out.print("Masukkan jumlah pengarang: ");
            int jumlahPengarang = input.nextInt();
            input.nextLine(); // membersihkan newline

            // Membuat array Pengarang dengan ukuran sesuai jumlah pengarang yang dimasukkan pengguna
            Pengarang[] pengarangs = new Pengarang[jumlahPengarang];
            for (int j = 0; j < jumlahPengarang; j++) {
                System.out.println("\nMasukkan data untuk pengarang ke-" + (j + 1) + ":");

                System.out.print("NIK: ");
                String NIK = input.nextLine();

                System.out.print("Nama: ");
                String nama = input.nextLine();

                System.out.print("Alamat: ");
                String alamat = input.nextLine();

                // Membuat objek Pengarang dan menambahkannya ke array pengarang
                pengarangs[j] = new Pengarang(NIK, nama, alamat);
            }

            // Membuat objek Buku dengan data yang dimasukkan pengguna dan menambahkannya ke array daftarBuku
            Buku buku = new Buku(kodeBuku, judul, tahunTerbit);
            buku.setPengarang(pengarangs);
            daftarBuku[i] = buku;
        }

        // Menampilkan data buku beserta pengarangnya
        System.out.println("\nData Buku beserta Pengarangnya:");
        for (Buku buku : daftarBuku) {
            System.out.println("\nKode Buku: " + buku.kodeBuku);
            System.out.println("Judul: " + buku.judul);
            System.out.println("Tahun Terbit: " + buku.tahunTerbit);
            System.out.println("Pengarang:");

            Pengarang[] pengarangs = buku.getPengarang();
            for (Pengarang pengarang : pengarangs) {
                System.out.println(" - NIK: " + pengarang.NIK);
                System.out.println("    Nama: " + pengarang.nama);
                System.out.println("    Alamat: " + pengarang.alamat);
            }
        }

        // Meminta pengguna untuk memasukkan tahun untuk menampilkan jumlah buku terbit
        System.out.print("\nMasukkan tahun untuk menampilkan jumlah buku terbit: ");
        int tahunCari = input.nextInt();

        // Menghitung jumlah buku yang terbit pada tahun yang dimasukkan pengguna
        int jumlahBukuTahun = 0;
        for (Buku buku : daftarBuku) {
            if (buku.tahunTerbit == tahunCari) {
                jumlahBukuTahun++;
            }
        }
        System.out.println("Jumlah buku terbit pada tahun " + tahunCari + " adalah: " + jumlahBukuTahun);

        // Mencari buku terlama dan terbaru
        Buku bukuTerlama = daftarBuku[0];
        Buku bukuTerbaru = daftarBuku[0];

        for (Buku buku : daftarBuku) {
            if (buku.tahunTerbit < bukuTerlama.tahunTerbit) {
                bukuTerlama = buku;
            }
            if (buku.tahunTerbit > bukuTerbaru.tahunTerbit) {
                bukuTerbaru = buku;
            }
        }

        // Menampilkan buku terlama
        System.out.println("\nBuku terbitan paling lama:");
        System.out.println("Kode Buku: " + bukuTerlama.kodeBuku);
        System.out.println("Judul: " + bukuTerlama.judul);
        System.out.println("Tahun Terbit: " + bukuTerlama.tahunTerbit);

        // Menampilkan buku terbaru
        System.out.println("\nBuku terbitan paling baru:");
        System.out.println("Kode Buku: " + bukuTerbaru.kodeBuku);
        System.out.println("Judul: " + bukuTerbaru.judul);
        System.out.println("Tahun Terbit: " + bukuTerbaru.tahunTerbit);
    }
}

