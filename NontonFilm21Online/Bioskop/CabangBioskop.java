package NontonFilm21Online.Bioskop;

public class CabangBioskop {
    private String namaCabang;
    private Studio[] daftarStudio;

    public CabangBioskop(String namaCabang, Studio[] daftarStudio) {
        this.namaCabang = namaCabang;
        this.daftarStudio = daftarStudio;
    }

    public String getNamaCabang() { return namaCabang; }
    public Studio[] getDaftarStudio() { return daftarStudio; }
}