public class Toko {
    private String namaToko;
    private Alamat alamat;
    private Produk produkAndalan;

    public Toko(String namaToko, String kota, String jalan) {
        this.namaToko = namaToko;
        this.alamat = new Alamat(kota, jalan);
    }

    public void setProdukAndalan(Produk produk) {
        this.produkAndalan = produk;
    }

    public void prosesPengiriman(Kurir kurir, String tujuan) {
        System.out.println(namaToko + " menyiapkan pesanan...");
        if (produkAndalan != null) {
            kurir.kirim(produkAndalan.getNamaBarang(), tujuan);
        } else {
            System.out.println("Belum ada produk yang dipilih!");
        }
    }

    public void info() {
        System.out.println("Toko           : " + namaToko);
        System.out.println("Lokasi Alamat  : " + alamat.info());
        if (produkAndalan != null) {
            System.out.println("Produk Andalan : " + produkAndalan.getNamaBarang());
        }
    }
}