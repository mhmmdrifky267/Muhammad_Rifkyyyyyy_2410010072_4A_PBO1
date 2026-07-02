package NontonFilm21Online;

import java.util.Scanner;
import NontonFilm21Online.User.User;
import NontonFilm21Online.Bioskop.*;
import NontonFilm21Online.Transaksi.*;

public class main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            User user = new User("Muhammad Rifky", 100000);
            
            Film film1 = new Film("Avengers: Endgame", 40000, 150);
            Film film2 = new Film("Spider-Man: No Way Home", 35000, 45);
            
            // Cabang Banjarmasin (BJM)
            Studio[] studioBJM = new Studio[2];
            studioBJM[0] = new StudioVip(film1);
            studioBJM[1] = new StudioReguler(film2);
            
            // Cabang Banjarbaru (BJB)
            Studio[] studioBJB = new Studio[2];
            studioBJB[0] = new StudioVip(film1);
            studioBJB[1] = new StudioReguler(film2);
            
            CabangBioskop[] daftarCabang = new CabangBioskop[2];
            daftarCabang[0] = new CabangBioskop("CineMax - Banjarmasin (BJM)", studioBJM);
            daftarCabang[1] = new CabangBioskop("CineMax - Banjarbaru (BJB)", studioBJB);
            
            boolean berjalan = true;
            
            while (berjalan) {
                System.out.println("=================================");
                System.out.println("   WELCOME TO CINEMAX BOOKING    ");
                System.out.println("=================================");
                System.out.println("User: " + user.getNama() + " | Saldo: Rp " + user.getSaldo());
                System.out.println("---------------------------------");
                System.out.println("1. Pilih Lokasi Cabang & Boking Tiket");
                System.out.println("2. Top-Up Saldo");
                System.out.println("3. Keluar");
                System.out.print("Pilih menu (1-3): ");
                
                try {
                    int pilihanMenu = input.nextInt();
                    
                    switch (pilihanMenu) {
                        case 1 -> {
                            System.out.println("\n--- SILAHKAN PILIH LOKASI BIOSKOP ---");
                            for (int i = 0; i < daftarCabang.length; i++) {
                                System.out.println("[" + (i + 1) + "] " + daftarCabang[i].getNamaCabang());
                            }
                            System.out.print("Pilih Nomor Cabang: ");
                            int pilCabang = input.nextInt() - 1;
                            
                            if (pilCabang < 0 || pilCabang >= daftarCabang.length) {
                                System.out.println("[Error] Cabang tidak valid!");
                                break;
                            }
                            
                            CabangBioskop cabangTerpilih = daftarCabang[pilCabang];
                            Studio[] katalogStudio = cabangTerpilih.getDaftarStudio();
                            
                            System.out.println("\n--- DAFTAR FILM DI " + cabangTerpilih.getNamaCabang().toUpperCase() + " ---");
                            for (int i = 0; i < katalogStudio.length; i++) {
                                String tagPopuler = (katalogStudio[i].getFilm().getJumlahPenonton() > 100) ? " 🔥 [POPULER]" : "";
                                System.out.println("[" + (i + 1) + "] " + katalogStudio[i].getFilm().getJudul()
                                        + " (" + katalogStudio[i].getNamaStudio() + ")"
                                                + " - Rp " + katalogStudio[i].hitungHargaTiket() + tagPopuler);
                            }
                            System.out.print("Pilih nomor film: ");
                            int pilFilm = input.nextInt() - 1;
                            
                            if (pilFilm < 0 || pilFilm >= katalogStudio.length) {
                                System.out.println("[Error] Film tidak tersedia!");
                                break;
                            }
                            
                            Studio studioPilihan = katalogStudio[pilFilm];
                            studioPilihan.tampilkanDenah();
                            
                            System.out.print("Pilih Baris (A/B/C): ");
                            char barisChar = input.next().toUpperCase().charAt(0);
                            System.out.print("Pilih Nomor Kolom (1-4): ");
                            int kolomNum = input.nextInt();
                            
                            int barisIdx = barisChar - 'A';
                            int kolomIdx = kolomNum - 1;
                            
                            if (barisIdx < 0 || barisIdx > 2 || kolomIdx < 0 || kolomIdx > 3) {
                                System.out.println("[Error] Kode kursi tidak valid!");
                                break;
                            }
                            
                            String kodeKursi = "" + barisChar + kolomNum;
                            if (studioPilihan.bokingKursi(barisIdx, kolomIdx)) {
                                Transaksi t = new Transaksi(user, studioPilihan, kodeKursi);
                                t.prosesPembayaran();
                            } else {
                                System.out.println("\n[GAGAL] Kursi " + kodeKursi + " di cabang ini sudah terisi!\n");
                            }
                        }
                            
                        case 2 -> {
                            System.out.print("Masukkan nominal Top-Up: Rp ");
                            double isiSaldo = input.nextDouble();
                            if(isiSaldo > 0) {
                                user.setSaldo(user.getSaldo() + isiSaldo);
                                System.out.println("Top-Up berhasil! Saldo sekarang: Rp " + user.getSaldo() + "\n");
                            }
                        }
                            
                        case 3 -> {
                            berjalan = false;
                            System.out.println("Terima kasih!");
                        }
                            
                        default -> System.out.println("Pilihan tidak valid!");
                    }
                } catch (SaldoKurangException e) {
                    System.out.println("\n" + e.getMessage() + "\n");
                } catch (Exception e) {
                    System.out.println("\n[ERROR] Terjadi kesalahan input teks/angka.");
                    input.next();
                    System.out.println();
                }
            }
        }
    }
}