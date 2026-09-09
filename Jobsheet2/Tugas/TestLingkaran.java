public class TestLingkaran{
    public static void main(String[] args){
        Lingkaran ling = new Lingkaran();
        ling.r = 10.0;

        System.out.println("Jari-jari Lingkaran: " + ling.r);
        System.out.println("Luas Lingkaran: " + ling.hitungLuas());
        System.out.println("Keliling Lingkaran: " + ling.hitungKeliling());
    }
}