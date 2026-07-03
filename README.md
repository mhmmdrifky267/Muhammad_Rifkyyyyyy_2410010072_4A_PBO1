# Sistem Pemesanan Tiket Bioskop Online (CineMax)

**Nama  :** Muhammad Rifky
**NPM   :** 2410010072
**Kelas :** 4A REG
**Mata Kuliah :** Pemrograman Berbasis Objek 1

## Deskripsi Studi Kasus

Program ini adalah simulasi sistem pemesanan tiket bioskop online (**CineMax**) yang mengelola pemesanan tiket pada beberapa lokasi cabang bioskop (Banjarmasin & Banjarbaru). Sistem ini memungkinkan pengguna untuk memilih lokasi cabang terdekat, memilih film yang sedang tayang, melihat denah kursi studio secara interaktif berbasis teks, melakukan pemesanan kursi, hingga memproses pembayaran tiket menggunakan saldo akun pengguna.

Studi kasus ini dipilih karena merepresentasikan alur bisnis nyata pada aplikasi hiburan digital, sekaligus menjadi sarana yang natural untuk menerapkan konsep **inheritance** dan **polymorphism** — karena setiap jenis studio (Reguler & VIP) memiliki perhitungan harga tiket dan fasilitas yang berbeda, namun tetap diturunkan dari satu class induk yang sama (`Studio`). Selain itu, penggunaan array dua dimensi sangat pas diimplementasikan untuk menyimulasikan denah baris dan kolom kursi bioskop secara mandiri di setiap cabang.

## Struktur Program

| Paket (Package) | File Class | Keterangan |
|---|---|---|
| `NontonFilm21Online` | `main.java` | Program utama (Controller) dengan menu interaktif, Scanner IO, looping, dan Try-Catch. |
| `NontonFilm21Online.User` | `User.java` | Mengelola data personal pengguna seperti Nama dan Saldo dompet digital. |
| `NontonFilm21Online.Bioskop` | `CabangBioskop.java` | Mengelola data lokasi cabang bioskop dan daftar studio di dalamnya. |
| | `Film.java` | Menyimpan data film (Judul, Harga Dasar) dan melacak statistik tren film populer. |
| | `Studio.java` | Class abstract (induk) — mengelola inisialisasi dan manipulasi denah kursi via Array 2D. |
| | `StudioReguler.java` | Turunan dari Studio — meng-override perhitungan harga untuk tiket kelas reguler. |
| | `StudioVip.java` | Turunan dari Studio — meng-override perhitungan harga dengan tambahan biaya fasilitas VIP. |
| `NontonFilm21Online.Transaksi` | `Transaksi.java` | Memproses validasi pembayaran, pengurangan saldo pengguna, dan pencetakan struk tiket resmi. |
| | `SaldoKurangException.java`| Custom Exception untuk menangani error handling ketika saldo user tidak mencukupi. |

## Cara Menjalankan

1. Ekstrak atau clone repositori ini ke komputer Anda.
2. Buka proyek menggunakan IDE NetBeans.
3. Klik kanan pada proyek `NontonFilm21` -> Pilih **Clean and Build**.
4. Jalankan file `main.java` yang berada di dalam paket `NontonFilm21Online`.
5. Ikuti panduan menu interaktif yang tampil di layar terminal/output.

## Tabel Penilaian (Self-Assessment)

| No | Materi | Bobot | Bukti Implementasi | Nilai |
|---|---|---|---|---|
| 1 | Class | 5 | Pembuatan class terpisah seperti `User`, `Film`, `CabangBioskop`, `Studio`, `StudioReguler`, `StudioVip`, `Transaksi`, dan `main`. | 5 |
| 2 | Object | 5 | Instansiasi objek user (`new User(...)`), objek film, objek studio, serta objek transaksi di dalam `main.java`. | 5 |
| 3 | Atribut | 5 | Atribut seperti `nama`, `saldo`, `judul`, `hargaDasar`, dan `kursi` dideklarasikan dengan modifier akses yang aman (`private` / `protected`). | 5 |
| 4 | Constructor | 5 | Implementasi constructor di setiap class untuk inisialisasi data awal, termasuk pemanggilan `super(...)` pada subclass studio. | 5 |
| 5 | Mutator | 5 | Method `setSaldo()` pada class `User` untuk memotong/menambah saldo, dan `tambahPenonton()` pada class `Film`. | 5 |
| 6 | Accessor | 5 | Method getter seperti `getNama()`, `getSaldo()`, `getJudul()`, `getNamaStudio()`, dan `getFilm()`. | 5 |
| 7 | Encapsulation | 5 | Semua atribut diset `private`/`protected` dan hanya bisa diakses atau diubah secara aman melalui metode getter dan setter. | 5 |
| 8 | Inheritance | 5 | Class `StudioReguler` dan `StudioVip` menjadi subclass yang mewarisi seluruh sifat dari abstract class `Studio` (`extends Studio`). | 5 |
| 9 | Polymorphism | 10 | *Overriding* pada method `hitungHargaTiket()` yang diimplementasikan secara berbeda antara `StudioReguler` dan `StudioVip`. | 10 |
| 10 | Seleksi | 5 | Penggunaan `switch-case` untuk kontrol menu utama dan `if-else` untuk validasi ketersediaan kursi serta kecukupan saldo. | 5 |
| 11 | Perulangan | 5 | Penggunaan loop `while` untuk menjaga program tetap berjalan, dan *nested for loop* (perulangan bertingkat) untuk mencetak denah kursi matriks. | 5 |
| 12 | IO Sederhana | 10 | Menggunakan `Scanner` untuk menerima input pilihan menu, nomor cabang, dan kode kursi, serta `System.out.println` untuk mencetak struk tiket. | 10 |
| 13 | Array | 15 | Menggunakan Array 1D untuk daftar studio dan cabang, serta **Array 2D (`char[][] kursi`)** untuk merepresentasikan denah tata ruang kursi bioskop. | 15 |
| 14 | Error Handling | 15 | Menggunakan blok `try-catch` untuk menangani salah input tipe data pada menu dan menangkap custom exception `SaldoKurangException`. | 15 |
| **TOTAL** | | **100** | | **100** |