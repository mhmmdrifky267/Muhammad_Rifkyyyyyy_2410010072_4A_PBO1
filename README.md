# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh aplikasi pengolahan data pemesanan tiket bioskop secara online (CineMax) menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa pilihan lokasi cabang bioskop, pilihan film, serta baris dan nomor kursi yang diinginkan oleh penonton. Output yang diberikan berupa denah kursi bioskop interaktif serta cetakan struk tiket fisik otomatis jika saldo pengguna mencukupi untuk melakukan pembayaran. Proyek ini mencakup data 12 film terbaru serta 5 lokasi cabang operasional di wilayah Kalimantan Selatan.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Polymorphism (Overriding & Overloading), Seleksi, Perulangan, IO Sederhana, Array (1D & 2D), dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

### 1. Class

Class adalah template atau blueprint dari object. Pada kode ini, `User`, `Studio`, `Transaksi`, dan `main` adalah contoh dari class.

```java
public class User {
    ...
}

public abstract class Studio {
    ...
}

public class Transaksi {
    ...
}

public class main {
    ...
}
```

### 2. Object

Object adalah instance dari class. Pada kode ini, `User user = new User("Muhammad Rifky", 100000);` dan `studioBJM[0] = new StudioVip(film1);` adalah contoh pembuatan object.

```java
User user = new User("Muhammad Rifky", 100000);
daftarCabang[0] = new CabangBioskop("CineMax - Banjarmasin (BJM)", studioBJM);
```

### 3. Atribut

Atribut adalah variabel yang ada dalam class. Pada kode ini, `nama`, `saldo`, `judul`, dan matriks kursi adalah contoh atribut.

```java
private String nama;
private double saldo;
private String judul;
protected char[][] kursi;
```

### 4. Constructor

Constructor adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `User`, `Studio`, dan subclass seperti `StudioVip`.

```java
public User(String nama, double saldo) {
    this.nama = nama;
    this.saldo = saldo;
}

public StudioVip(Film film) {
    super("Studio VIP (Include Snack)", film);
}
```

### 5. Mutator

Mutator atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setSaldo` di class `User` dan `tambahPenonton` di class `Film` adalah contoh method mutator.

```java
public void setSaldo(double saldo) {
    this.saldo = saldo;
}

public void tambahPenonton() {
    this.jumlahPenonton++;
}
```

### 6. Accessor

Accessor atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, `getSaldo`, `getJudul`, dan `getNamaStudio` adalah contoh method accessor.

```java
public String getNama() { 
    return nama; 
}

public double getSaldo() { 
    return saldo; 
}
```

### 7. Encapsulation

Encapsulation adalah konsep menyembunyikan data dengan membuat atribut menjadi private atau protected dan hanya bisa diakses melalui method. Pada kode ini, atribut dienkapsulasi agar aman dari perubahan luar secara langsung.

```java
private String nama;
private double saldo;
private String judul;
```

### 8. Inheritance

Inheritance adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `StudioReguler` dan `StudioVip` mewarisi abstract class `Studio` dengan sintaks `extends`.

```java
public class StudioReguler extends Studio {
    ...
}

public class StudioVip extends Studio {
    ...
}
```

### 9. Polymorphism

Polymorphism adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, overriding diimplementasikan pada method `hitungHargaTiket()` di subclass `StudioVip` dan `StudioReguler`, sedangkan overloading dicontohkan pada pembuatan constructor bernilai ganda atau method cetak info tambahan.

```java
// Contoh Overriding di StudioVip
@Override
public double hitungHargaTiket() {
    return getFilm().getHargaDasar() + 25000;
}

// Contoh Overriding di StudioReguler
@Override
public double hitungHargaTiket() {
    return getFilm().getHargaDasar();
}
```

### 10. Seleksi

Seleksi adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi if-else untuk mengecek kecukupan saldo serta validasi koordinat kursi, dan seleksi switch-case untuk navigasi menu utama.

```java
if (user.getSaldo() < totalHarga) {
    throw new SaldoKurangException("Transaksi Gagal! Saldo Anda kurang Rp " + (totalHarga - user.getSaldo()));
}

switch (pilihanMenu) {
    case 1:
        // Proses boking tiket
        break;
    case 2:
        // Proses top up saldo
        break;
}
```

### 11. Perulangan

Perulangan adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop while untuk looping menu utama dan nested for loop (perulangan bertingkat) untuk mencetak denah matriks kursi bioskop.

```java
while (berjalan) {
    ...
}

for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 4; j++) {
        System.out.print("[" + kursi[i][j] + "] ");
    }
    System.out.println();
}
```

### 12. Input Output Sederhana

Input Output Sederhana digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input pilihan user dan method `System.out.println` untuk menampilkan output struk tiket resmi.

```java
Scanner input = new Scanner(System.in);
System.out.print("Pilih menu (1-3): ");
int pilihanMenu = input.nextInt();

System.out.println(" Nama Penonton : " + user.getNama());
System.out.println(" Sisa Saldo    : Rp " + user.getSaldo());
```

### 13. Array

Array adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, digunakan Array 1D untuk menampung 12 studio (`new Studio[12]`) dan 5 cabang bioskop (`new CabangBioskop[5]`), serta Array 2D (`char[][] kursi`) untuk denah baris dan kolom tempat duduk.

```java
Studio[] studioBJM = new Studio[12];
CabangBioskop[] daftarCabang = new CabangBioskop[5];
this.kursi = new char[3][4];
```

### 14. Error Handling

Error Handling digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan blok try-catch untuk menangkap input yang salah dari keyboard serta menangani custom exception `SaldoKurangException` saat penonton kehabisan saldo uang.

```java
try {
    int pilihanMenu = input.nextInt();
    ...
} catch (SaldoKurangException e) {
    System.out.println("\n" + e.getMessage() + "\n");
} catch (Exception e) {
    System.out.println("\n[ERROR] Terjadi kesalahan input teks/angka.");
    input.next();
}
```

## Usulan Nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

**Nama:** Muhammad Rifky  
**NPM:** 2410010072
