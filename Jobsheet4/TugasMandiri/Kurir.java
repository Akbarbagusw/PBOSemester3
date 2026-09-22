public class Kurir {
    private String namaEkspedisi;

    public Kurir(String namaEkspedisi) {
        this.namaEkspedisi = namaEkspedisi;
    }

    public void kirim(String barang, String tujuan) {
        System.out.println("[" + namaEkspedisi + "] Mengirim " + barang + " ke " + tujuan);
    }
}