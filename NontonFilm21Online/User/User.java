package NontonFilm21Online.User;

public class User {
    private String nama;
    private double saldo;

    public User(String nama, double saldo) {
        this.nama = nama;
        this.saldo = saldo;
    }

    public String getNama() { return nama; }
    public double getSaldo() { return saldo; }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}