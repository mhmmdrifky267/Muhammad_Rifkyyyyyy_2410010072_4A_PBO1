package NontonFilm21Online.Transaksi;

// Ini adalah syarat custom exception untuk error handling transaksi
public class SaldoKurangException extends Exception {
    public SaldoKurangException(String pesan) {
        super(pesan);
    }
}