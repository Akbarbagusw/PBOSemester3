public class Pakaian {
    private String merk;
    private String warna;

    public void setMerk(String merkPakaian) {
        this.merk = merkPakaian;
    }

    public void setWarna(String warnaPakaian) {
        this.warna = warnaPakaian;
    }

    public void cetakInfo() {
        System.out.println("Merk Pakaian    : " + merk);
        System.out.println("Warna           : " + warna);
    }
}