public class TestBarang{
    public static void main(String[] args) {
        Barang brg = new Barang();
        brg.kode = "BRG-001";
        brg.namaBarang = "Keyboard Mechanical";
        brg.hargaDasar = 750000;
        brg.diskon = 0.15f;
        
        brg.tampilData();
    }
}