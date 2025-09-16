# 📚 Book Management

Sistem Pengelolaan Buku dengan Pengarang di Java  
Proyek Java yang mengimplementasikan aplikasi untuk menambahkan buku beserta pengarang, menampilkan data, menghitung jumlah buku per tahun, dan menemukan buku terlama/terbaru.

---

## 📖 Deskripsi Proyek

Proyek ini berfokus pada:
- 📊 **Buku.java** → merepresentasikan buku dengan atribut kode buku, judul, tahun terbit, dan array pengarang.  
- 🔍 **Pengarang.java** → merepresentasikan pengarang dengan atribut NIK, nama, dan alamat.  
- 🛠️ **KelolaBuku.java** → mengelola penambahan buku dan pengarang melalui input konsol, menampilkan data, menghitung jumlah buku per tahun, serta identifikasi buku terlama dan terbaru. 

---

## 🧠 Teknologi
- Java

---

## 📂 Struktur File
```
Book_Management_With_Authors_Java/
├── src/Modul_5/
├── KelolaBuku.java         # 🛠️ Kelas utama untuk pengelolaan
├── Buku.java               # 📊 Kelas untuk data buku
├── Pengarang.java          # 🔍 Kelas untuk data pengarang
```
---

## 🟢 Catatan 
- Program menerima input jumlah buku, detail buku (kode, judul, tahun terbit), jumlah pengarang, dan detail pengarang (NIK, nama, alamat).  
- Filter tahun untuk jumlah buku dan identifikasi terlama/terbaru dihitung berdasarkan tahun terbit.   

---

## 📈 Contoh Output
```
Masukkan jumlah buku baru: 2

Masukkan data untuk buku ke-1:
Kode Buku: 001
Judul: JAVA
Tahun Terbit: 2005
Masukkan jumlah pengarang: 1

Masukkan data untuk pengarang ke-1:
NIK: 000000001
Nama: VANIA
Alamat: YOGYAKARTA

Masukkan data untuk buku ke-2:
Kode Buku: 002
Judul: PYTHON
Tahun Terbit: 2020
Masukkan jumlah pengarang: 1

Masukkan data untuk pengarang ke-1:
NIK: 000000002
Nama: EUGENIUS
Alamat: KLATEN

Data Buku beserta Pengarangnya:

Kode Buku: 001
Judul: JAVA
Tahun Terbit: 2005
Pengarang:
 - NIK: 000000001
    Nama: VANIA
    Alamat: YOGYAKARTA

Kode Buku: 002
Judul: PYTHON
Tahun Terbit: 2020
Pengarang:
 - NIK: 000000002
    Nama: EUGENIUS
    Alamat: KLATEN

Masukkan tahun untuk menampilkan jumlah buku terbit: 2020
Jumlah buku terbit pada tahun 2020 adalah: 1

Buku terbitan paling lama:
Kode Buku: 001
Judul: JAVA
Tahun Terbit: 2005

Buku terbitan paling baru:
Kode Buku: 002
Judul: PYTHON
Tahun Terbit: 2020
```

---

## 👨‍💻 Pengembang
**MBAHSINGO22** 🔗 [GitHub](https://github.com/MBAHSINGO22)
