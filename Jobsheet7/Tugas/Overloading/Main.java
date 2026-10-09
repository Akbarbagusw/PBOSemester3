public class Main{
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();
        
        System.out.println("Total Sudut (1 parameter): " + segitiga.totalSudut(90));
        System.out.println("Total Sudut (2 parameter): " + segitiga.totalSudut(45, 45));
        System.out.println("Keliling (3 sisi): " + segitiga.keliling(10, 15, 20));
        System.out.println("Keliling (2 sisi, pythagoras): " + segitiga.keliling(3, 4));
    }
}