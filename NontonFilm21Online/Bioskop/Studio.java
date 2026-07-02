package NontonFilm21Online.Bioskop;

public abstract class Studio {
    private String namaStudio;
    private Film film;
    protected char[][] kursi; 

    public Studio(String namaStudio, Film film) {
        this.namaStudio = namaStudio;
        this.film = film;
        this.kursi = new char[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                kursi[i][j] = 'O'; 
            }
        }
    }

    public void tampilkanDenah() {
        System.out.println("\nDENAH KURSI " + namaStudio.toUpperCase() + ":");
        System.out.println("    [ LAYAR BIOSKOP ]");
        System.out.println("    1   2   3   4");
        for (int i = 0; i < 3; i++) {
            char baris = (char) ('A' + i);
            System.out.print(baris + "  ");
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + kursi[i][j] + "] ");
            }
            System.out.println();
        }
    }

    public boolean bokingKursi(int barisIdx, int kolomIdx) {
        if (kursi[barisIdx][kolomIdx] == 'X') {
            return false; 
        }
        kursi[barisIdx][kolomIdx] = 'X'; 
        return true;
    }

    public String getNamaStudio() { return namaStudio; }
    public Film getFilm() { return film; }

    public abstract double hitungHargaTiket();
}