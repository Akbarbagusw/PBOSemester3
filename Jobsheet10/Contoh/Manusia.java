public class Manusia {
    public void MakanBuah(Buah x) {
        if (x instanceof Apel) {
            System.out.println("Apel dikupas terlebih dahulu");
            ((Apel) x).TampilkanBiji();
        } else if (x instanceof Pisang) {
            System.out.println("Pisang dikupas terlebih dahulu");
            ((Pisang) x).TampilkanKulit();
        } else if (x instanceof Durian) {
            System.out.println("Durian dibelah terlebih dahulu");
            ((Durian) x).TampilkanDaging();
        }

        System.out.println("Rasanya " + x.getRasa());
        System.out.println("Kandungan air: " + x.getKandunganAir() + "%");
    }
}
