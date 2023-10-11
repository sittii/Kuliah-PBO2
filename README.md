# Toko Perhiasan - Laporan Program

**Disusun oleh:**  
**Nama:** Siti Nikmatul Ula  
**NIM:** 2209116059

## Deskripsi Program
Program Java "Toko Perhiasan" memungkinkan pengguna mengelola data perhiasan dan riwayat transaksi. Berbasiskan konsep pemrograman berorientasi objek (OOP), program ini memberikan kemudahan dalam mengelola informasi perhiasan dan transaksi di sebuah toko perhiasan.

## Struktur Program
Program ini terdiri dari beberapa kelas:

1. `TokoPerhiasan.java`: Kelas utama dengan metode `main` yang menjalankan program dan menampilkan menu utama.
2. `Perhiasan.java`: Kelas yang merepresentasikan perhiasan dengan properti seperti nama, harga, dan stok. Kelas ini juga memiliki metode untuk mengelola stok perhiasan.
3. `Transaksi.java`: Kelas abstrak yang digunakan sebagai dasar untuk jenis transaksi. Kelas ini memiliki properti tanggal transaksi dan total harga.
4. `RiwayatTransaksi.java`: Subkelas dari `Transaksi` yang merepresentasikan riwayat transaksi, termasuk nama perhiasan yang terlibat dan jumlahnya.

### TokoPerhiasan.java
- Ini adalah kelas utama yang berisi metode `main` untuk menjalankan program.
- Program dimulai dengan menampilkan menu utama yang memungkinkan pengguna untuk memilih beberapa opsi: mengelola data perhiasan, mengelola transaksi, atau keluar dari program.

### Perhiasan.java
- Ini adalah kelas yang digunakan untuk merepresentasikan perhiasan.
- Properti:
  - `nama`: Nama perhiasan.
  - `harga`: Harga perhiasan.
  - `stok`: Jumlah stok perhiasan.
- Metode:
  - `kurangiStok()`: Mengurangi stok perhiasan jika ada transaksi yang sukses.
  - `getJumlahTotalPerhiasan()`: Mengembalikan jumlah total stok perhiasan yang ada.

### Transaksi.java
- Ini adalah kelas abstrak yang digunakan sebagai dasar untuk jenis transaksi.
- Properti:
  - `tanggalTransaksi`: Tanggal transaksi.
  - `totalHarga`: Total harga transaksi.
- Metode abstrak:
  - `tampilkanDetailTransaksi()`: Digunakan untuk menampilkan detail transaksi, tetapi setiap subkelas harus mengimplementasikan metode ini.

### RiwayatTransaksi.java
- Ini adalah subkelas dari `Transaksi` yang digunakan untuk merepresentasikan riwayat transaksi.
- Properti tambahan:
  - `namaPerhiasan`: Nama perhiasan yang terlibat dalam transaksi.
  - `jumlah`: Jumlah perhiasan yang terjual.
- Implementasi metode abstrak `tampilkanDetailTransaksi()`.

### Penjelasan Fungsi Utama Program
1. **Menu Utama (`main` method di `TokoPerhiasan.java`)**
   - Program dimulai dengan menampilkan menu utama yang memungkinkan pengguna untuk memilih tiga opsi.
   - Pilihan:
     - "Kelola Data Perhiasan": Memungkinkan pengguna mengelola data perhiasan seperti menambah, mengedit, atau menghapus perhiasan, serta melihat data perhiasan yang ada.
     - "Kelola Transaksi": Memungkinkan pengguna menambahkan transaksi baru atau melihat riwayat transaksi.
     - "Keluar": Mengakhiri program.

2. **Menu Perhiasan**
   - Ketika pengguna memilih "Kelola Data Perhiasan," program memungkinkan pengguna untuk:
     - Menambah data perhiasan baru, termasuk nama, harga, dan stok.
     - Mengedit data perhiasan yang ada dengan mengganti harga dan stoknya.
     - Menghapus data perhiasan.
     - Melihat data perhiasan yang ada.
     - Menampilkan jumlah stok keseluruhan dari semua perhiasan yang tersedia.

3. **Menu Transaksi**
   - Ketika pengguna memilih "Kelola Transaksi," program memungkinkan pengguna untuk:
     - Menambahkan transaksi baru dengan memilih perhiasan dan jumlah yang dibeli.
     - Melihat riwayat transaksi yang telah dilakukan.
     - Pengguna juga dapat melihat jumlah stok keseluruhan dari semua perhiasan yang tersedia saat berada di menu transaksi.

4. **Fungsi Tambahan**
   - Ada fungsi untuk menghitung total harga suatu transaksi berdasarkan nama perhiasan dan jumlah yang dibeli.
   - Ada juga metode untuk mengurangi stok perhiasan saat ada transaksi yang berhasil.
   - Program ini juga menghitung jumlah stok keseluruhan dari semua perhiasan yang ada dan menampilkannya dalam beberapa menu.

## Kesimpulan
Program "Toko Perhiasan" adalah sebuah aplikasi sederhana yang menggunakan Java untuk mengelola data perhiasan dan transaksi di toko perhiasan. Dengan pendekatan berorientasi objek dan menu yang terstruktur dengan baik, program ini memudahkan pengguna dalam mengatur bisnis perhiasan. Program ini dapat dijadikan landasan untuk pengembangan lebih lanjut dan disesuaikan sesuai kebutuhan.
