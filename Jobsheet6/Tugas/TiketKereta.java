public class TiketKereta extends Tiket {
    public int nomorGerbong;
    public String nomorKursi;

    public TiketKereta() {
    }

    public TiketKereta(String kodeTiket, String namaPenumpang, String asal, String tujuan, int hargaDasar, int nomorGerbong, String nomorKursi) {
        super(kodeTiket, namaPenumpang, asal, tujuan, hargaDasar);
        this.nomorGerbong = nomorGerbong;
        this.nomorKursi = nomorKursi;
    }

    public void tampilKereta() {
        super.tampilTiket();
        System.out.println("Nomor Gerbong\t\t= " + nomorGerbong);
        System.out.println("Nomor Kursi\t\t= " + nomorKursi);
        System.out.println("Total Bayar\t\t= " + hargaDasar); // Total bayar kereta = hargaDasar
    }
}