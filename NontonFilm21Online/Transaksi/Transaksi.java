package NontonFilm21Online.Transaksi;

import NontonFilm21Online.User.User;
import NontonFilm21Online.Bioskop.Studio;
import NontonFilm21Online.Transaksi.SaldoKurangException; // <-- Ditambahkan agar sinkron

public class Transaksi {
    private final User user;
    private final Studio studio;
    private final String kodeKursi;

    public Transaksi(User user, Studio studio, String kodeKursi) {
        this.user = user;
        this.studio = studio;
        this.kodeKursi = kodeKursi;
    }

    public void prosesPembayaran() throws SaldoKurangException {
        // LOGIKA TRANSAKSI 1: Menghitung total harga berdasarkan tipe studio (VIP/Reguler)
        double totalHarga = studio.hitungHargaTiket();

        // LOGIKA TRANSAKSI 2: Seleksi kondisi apakah saldo user kurang?
        if (user.getSaldo() < totalHarga) {
            // Jika kurang, lemparkan error dan batalkan pemotongan saldo
            throw new SaldoKurangException("Transaksi Gagal! Saldo Anda kurang Rp " + (totalHarga - user.getSaldo()));
        }

        // LOGIKA TRANSAKSI 3: Jika saldo cukup, lakukan mutator pengurangan saldo
        user.setSaldo(user.getSaldo() - totalHarga);
        studio.getFilm().tambahPenonton(); // Naikkan angka tren film populer
        
        // LOGIKA TRANSAKSI 4: Cetak struk pembelian ke layar
        cetakTiket(totalHarga);
    }

    private void cetakTiket(double totalHarga) {
        System.out.println("\n=================================");
        System.out.println("        CINEMAX TICKET MASTER     ");
        System.out.println("=================================");
        System.out.println(" Nama Penonton : " + user.getNama());
        System.out.println(" Film          : " + studio.getFilm().getJudul());
        System.out.println(" Tipe Studio   : " + studio.getNamaStudio());
        System.out.println(" Nomor Kursi   : " + kodeKursi);
        System.out.println(" Total Bayar   : Rp " + totalHarga);
        System.out.println(" Sisa Saldo    : Rp " + user.getSaldo());
        System.out.println("=================================");
        System.out.println("Status: TIKET BERHASIL DICETAK! 🎉\n");
    }
}