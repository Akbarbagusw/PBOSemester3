public class Pintu {
    private String bahanBaku;
    private boolean isTerbuka;

    public void setBahan(String bahan) {
        this.bahanBaku = bahan;
    }

    public void bukaTutup(boolean status) {
        this.isTerbuka = status;
    }

    public void cetakInfo() {
        System.out.println("--- Info Pintu ---");
        System.out.println("Bahan Pintu     : " + bahanBaku);
        System.out.println("Status Pintu    : " + (isTerbuka ? "Terbuka" : "Tertutup"));
    }
}