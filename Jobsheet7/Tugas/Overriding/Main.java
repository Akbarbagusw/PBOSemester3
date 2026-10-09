public class Main{
    public static void main(String[] args) {
        Manusia manusiaUmum = new Manusia();
        Manusia pakDosen = new Dosen();
        Manusia anakBEM = new Mahasiswa();

        System.out.println("--- Menguji Method Override (Dynamic Dispatch) ---");
        manusiaUmum.makan();
        pakDosen.makan();
        anakBEM.makan();
        
        System.out.println("\n--- Menguji Method Spesifik (Perlu Casting) ---");
        ((Dosen) pakDosen).lembur();
        ((Mahasiswa) anakBEM).tidur();
    }
}