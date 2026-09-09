public class Peminjaman{
    public int id;
    public String namaMember;
    public String namaGame;
    public int harga;
    public int lamaSewa;

    public int hitungHargaBayar(){
        return lamaSewa * harga;
    }
    
    public void tampilDataPeminjaman(){
        System.out.println("ID Peminjaman   : " + id);
        System.out.println("Nama Member     : " + namaMember);
        System.out.println("Nama Game       : " + namaGame);
        System.out.println("Lama Sewa       : " + lamaSewa);
        System.out.println("Harga / hari    : Rp" + harga);
        System.out.println("Total Bayar     : Rp" + hitungHargaBayar());
        System.out.println("=====================================");
    }
}