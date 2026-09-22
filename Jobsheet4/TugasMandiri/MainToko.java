public class MainToko {
    public static void main(String[] args) {
        Toko toko = new Toko("Agres", "Malang", "Jl. Gajayana No. 1");
        Produk laptop = new Produk("Laptop Gaming", 15000000);
        toko.setProdukAndalan(laptop);
        toko.info();
        Kurir jne = new Kurir("JNE Express");
        toko.prosesPengiriman(jne, "Pasuruan");
    }
}