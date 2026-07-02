package NontonFilm21Online.Bioskop;

public class StudioReguler extends Studio {
    public StudioReguler(Film film) {
        super("Studio Reguler", film);
    }

    @Override
    public double hitungHargaTiket() {
        return getFilm().getHargaDasar();
    }
}