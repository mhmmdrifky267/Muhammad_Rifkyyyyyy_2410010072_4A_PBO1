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
            Film film3 = new Film("Avatar 3: Fire and Ash", 45000, 150);
            Film film4 = new Film("The Batman Part II", 40000, 95);
            Film film5 = new Film("Avengers: Doomsday", 45000, 210);
            Film film6 = new Film("Shrek 5", 35000, 180);
            Film film7 = new Film("Superman", 40000, 130);
            Film film8 = new Film("KKN di Desa Penari 2", 35000, 250);
            Film film9 = new Film("Siksa Kubur Part 2", 35000, 140);
            Film film10 = new Film("Mencuri Raden Saleh 2", 35000, 115);
            Film film11 = new Film("Spider-Man: Beyond the Spider-Verse", 40000, 190);
            Film film12 = new Film("Filosofi Kopi: New Chapter", 30000, 55);
            
            // Cabang Banjarmasin (BJM)
            Studio[] studioBJM = new Studio[12]; 
            studioBJM[0] = new StudioVip(film1);
            studioBJM[1] = new StudioReguler(film2);
            studioBJM[2] = new StudioVip(film3);
            studioBJM[3] = new StudioReguler(film4);
            studioBJM[4] = new StudioReguler(film5);
            studioBJM[5] = new StudioVip(film6);
            studioBJM[6] = new StudioReguler(film7);
            studioBJM[7] = new StudioReguler(film8);
            studioBJM[8] = new StudioVip(film9);
            studioBJM[9] = new StudioReguler(film10);
            studioBJM[10] = new StudioReguler(film11);
            studioBJM[11] = new StudioReguler(film12);
            
            
            // Cabang Banjarbaru (BJB)
            Studio[] studioBJB = new Studio[12];
            studioBJM[0] = new StudioVip(film1);
            studioBJM[1] = new StudioReguler(film2);
            studioBJM[2] = new StudioVip(film3);
            studioBJM[3] = new StudioReguler(film4);
            studioBJM[4] = new StudioReguler(film5);
            studioBJM[5] = new StudioVip(film6);
            studioBJM[6] = new StudioReguler(film7);
            studioBJM[7] = new StudioReguler(film8);
            studioBJM[8] = new StudioVip(film9);
            studioBJM[9] = new StudioReguler(film10);
            studioBJM[10] = new StudioReguler(film11);
            studioBJM[11] = new StudioReguler(film12);
            
            // Cabang Tabalong (TJG)
            Studio[] studioTJG = new Studio[12];
            studioTJG[0] = new StudioVip(film1);
            studioTJG[1] = new StudioReguler(film2);
            studioTJG[2] = new StudioVip(film3);
            studioTJG[3] = new StudioReguler(film4);
            studioTJG[4] = new StudioReguler(film5);
            studioTJG[5] = new StudioVip(film6);
            studioTJG[6] = new StudioReguler(film7);
            studioTJG[7] = new StudioReguler(film8);
            studioTJG[8] = new StudioVip(film9);
            studioTJG[9] = new StudioReguler(film10);
            studioTJG[10] = new StudioReguler(film11);
            studioTJG[11] = new StudioReguler(film12);
            
            // Cabang Pelaihari (PLH)
            Studio[] studioPLH = new Studio[12];
            studioPLH[0] = new StudioVip(film1);
            studioPLH[1] = new StudioReguler(film2);
            studioPLH[2] = new StudioVip(film3);
            studioPLH[3] = new StudioReguler(film4);
            studioPLH[4] = new StudioReguler(film5);
            studioPLH[5] = new StudioVip(film6);
            studioPLH[6] = new StudioReguler(film7);
            studioPLH[7] = new StudioReguler(film8);
            studioPLH[8] = new StudioVip(film9);
            studioPLH[9] = new StudioReguler(film10);
            studioPLH[10] = new StudioReguler(film11);
            studioPLH[11] = new StudioReguler(film12);
            
            // Cabang KOta Baru (KTB)
            Studio[] studioKTB = new Studio[12];
            studioKTB[0] = new StudioVip(film1);
            studioKTB[1] = new StudioReguler(film2);
            studioKTB[2] = new StudioVip(film3);
            studioKTB[3] = new StudioReguler(film4);
            studioKTB[4] = new StudioReguler(film5);
            studioKTB[5] = new StudioVip(film6);
            studioKTB[6] = new StudioReguler(film7);
            studioKTB[7] = new StudioReguler(film8);
            studioKTB[8] = new StudioVip(film9);
            studioKTB[9] = new StudioReguler(film10);
            studioKTB[10] = new StudioReguler(film11);
            studioKTB[11] = new StudioReguler(film12);
            
            CabangBioskop[] daftarCabang = new CabangBioskop[5];
            daftarCabang[0] = new CabangBioskop("CineMax - Banjarmasin (BJM)", studioBJM);
            daftarCabang[1] = new CabangBioskop("CineMax - Banjarbaru (BJB)", studioBJB);
            daftarCabang[2] = new CabangBioskop("CineMax - Tabalong (TJG)", studioTJG);
            daftarCabang[3] = new CabangBioskop("CineMax - Pelaihari (PLH)", studioPLH);
            daftarCabang[4] = new CabangBioskop("CineMax - kotabaru (KTB)", studioKTB);
            
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