public class TugasDemo {
    public static void main(String[] args) {
        Gelas gelasKaca = new Gelas();
        Pintu pintuKamar = new Pintu();
        Pakaian bajuUmum = new Pakaian();
        Kaos kaosOblong = new Kaos();
        Celana celanaJeans = new Celana();

        gelasKaca.setKapasitas(250);
        gelasKaca.isiAir(false);
        gelasKaca.cetakInfo();
        System.out.println();

        pintuKamar.setBahan("Kayu Jati");
        pintuKamar.bukaTutup(false);
        pintuKamar.cetakInfo();
        System.out.println();

        bajuUmum.setMerk("Pakaian Polos");
        bajuUmum.setWarna("Hitam");
        System.out.println("--- Info Pakaian Umum ---");
        bajuUmum.cetakInfo();
        System.out.println();

        kaosOblong.setMerk("Erigo");
        kaosOblong.setWarna("Hitam");
        kaosOblong.setUkuran("M");
        kaosOblong.setLenganPanjang(false);
        kaosOblong.cetakInfo();
        System.out.println();

        celanaJeans.setMerk("Levi's");
        celanaJeans.setWarna("Biru Muda");
        celanaJeans.setLingkarPinggang(30);
        celanaJeans.setJenisBahan("Denim");
        celanaJeans.cetakInfo();
    }
}