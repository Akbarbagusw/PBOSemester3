public class TestPeminjaman{
    public static void main(String[] args) {
        Peminjaman pmj1 = new Peminjaman();
        pmj1.id = 1;
        pmj1.namaMember = "Rizky";
        pmj1.namaGame = "PES";
        pmj1.lamaSewa = 3;
        pmj1.harga = 50000;
        pmj1.tampilDataPeminjaman();
    }
}