public class Celana extends Pakaian {
    private int lingkarPinggang;
    private String jenisBahan;

    public void setLingkarPinggang(int lingkar) {
        this.lingkarPinggang = lingkar;
    }

    public void setJenisBahan(String bahanCelana) {
        this.jenisBahan = bahanCelana;
    }

    @Override
    public void cetakInfo() {
        System.out.println("--- Info Celana ---");
        super.cetakInfo();
        System.out.println("Lingkar Pinggang: " + lingkarPinggang + " cm");
        System.out.println("Jenis Bahan     : " + jenisBahan);
    }
}