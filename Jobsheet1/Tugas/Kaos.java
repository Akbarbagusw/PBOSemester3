public class Kaos extends Pakaian {
    private String ukuran;
    private boolean isLenganPanjang;

    public void setUkuran(String ukuranKaos) {
        this.ukuran = ukuranKaos;
    }

    public void setLenganPanjang(boolean status) {
        this.isLenganPanjang = status;
    }

    @Override
    public void cetakInfo() {
        System.out.println("--- Info Kaos ---");
        super.cetakInfo();
        System.out.println("Ukuran          : " + ukuran);
        System.out.println("Model Lengan    : " + (isLenganPanjang ? "Panjang" : "Pendek"));
    }
}