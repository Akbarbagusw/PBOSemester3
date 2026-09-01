public class Gelas{
    private int kapasitas;
    private boolean isPenuh;

    public void setKapasitas(int volume){
        this.kapasitas = volume;
    }

    public void isiAir(boolean status){
        this.isPenuh = status;
    }

    public void cetakInfo(){
        System.out.println("--- Info Gelas ---");
        System.out.println("Kapasitas Gelas: " + kapasitas + " ml");
        System.out.println("Kondisi Air    : " + (isPenuh ? "Penuh" : "Kosong"));
    }
}