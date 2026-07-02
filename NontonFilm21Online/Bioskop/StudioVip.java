package NontonFilm21Online.Bioskop;

public class StudioVip extends Studio {
    public StudioVip(Film film) {
        super("Studio VIP (Include Snack)", film);
    }

    @Override
    public double hitungHargaTiket() {
        return getFilm().getHargaDasar() + 25000;
    }
}