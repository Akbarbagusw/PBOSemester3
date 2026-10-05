public class Tiket {
    public String kodeTiket;
    public String namaPenumpang;
    public String asal;
    public String tujuan;
    public int hargaDasar;

    public Tiket() {
    }

    public Tiket(String kodeTiket, String namaPenumpang, String asal, String tujuan, int hargaDasar) {
        this.kodeTiket = kodeTiket;
        this.namaPenumpang = namaPenumpang;
        this.asal = asal;
        this.tujuan = tujuan;
        this.hargaDasar = hargaDasar;
    }

    public void tampilTiket() {
        System.out.println("Kode Tiket\t\t= " + kodeTiket);
        System.out.println("Nama Penumpang\t\t= " + namaPenumpang);
        System.out.println("Rute\t\t\t= " + asal + " - " + tujuan);
        System.out.println("Harga Dasar\t\t= " + hargaDasar);
    }
}