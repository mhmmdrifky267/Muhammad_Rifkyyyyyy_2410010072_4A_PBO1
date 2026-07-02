package NontonFilm21Online.Bioskop;

public class Film {
    private final String judul;
    private final double hargaDasar;
    private int jumlahPenonton;

    public Film(String judul, double hargaDasar, int jumlahPenonton) {
        this.judul = judul;
        this.hargaDasar = hargaDasar;
        this.jumlahPenonton = jumlahPenonton;
    }

    public String getJudul() { return judul; }
    public double getHargaDasar() { return hargaDasar; }
    public int getJumlahPenonton() { return jumlahPenonton; }
    
    public void tambahPenonton() { this.jumlahPenonton++; }
}