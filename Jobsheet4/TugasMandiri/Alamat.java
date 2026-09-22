public class Alamat {
    private String kota;
    private String jalan;

    public Alamat(String kota, String jalan) {
        this.kota = kota;
        this.jalan = jalan;
    }

    public String info() {
        return jalan + ", " + kota;
    }
}