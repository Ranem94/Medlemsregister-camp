public class Medlem {
    private String namn;
    private int nummer;

    public Medlem(String namn, int nummer) {
        this.namn = namn;
        this.nummer = nummer;
    }

    public String getNamn() {
        return namn;
    }

    public int getNummer() {
        return nummer;
    }
}