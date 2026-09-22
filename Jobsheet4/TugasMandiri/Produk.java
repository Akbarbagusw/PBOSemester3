public class Produk {
    private String namaBarang;
    private int harga;

    public Produk(String namaBarang, int harga) {
        this.namaBarang = namaBarang;
        this.harga = harga;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public int getHarga() {
        return harga;
    }
}