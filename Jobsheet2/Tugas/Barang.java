public class Barang{
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual() {
        int nilaiDiskon = (int) (diskon * hargaDasar);
        return hargaDasar - nilaiDiskon;
    }

    public void tampilData() {
        System.out.println("Kode Barang  : " + kode);
        System.out.println("Nama Barang  : " + namaBarang);
        System.out.println("Harga Dasar  : Rp" + hargaDasar);
        System.out.println("Diskon       : " + (diskon * 100) + "%");
        System.out.println("Harga Jual   : Rp" + hitungHargaJual());
        System.out.println("------------------------------");
    }
}