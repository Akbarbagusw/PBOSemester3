import java.util.Scanner;
public class TestLogistikInteraktif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("   SISTEM MANAJEMEN LOGISTIK KONTAINER KARGO      ");
        System.out.println("==================================================");

        System.out.print("Masukkan Nomor Resi Kontainer      : ");
        String noResi = scanner.nextLine();

        System.out.print("Masukkan Nama Pemilik Kontainer    : ");
        String namaPemilik = scanner.nextLine();

        System.out.print("Masukkan Kapasitas Maksimal (kg)   : ");
        double kapasitas = scanner.nextDouble();

        Kontainer kontainer = new Kontainer(noResi, namaPemilik, kapasitas);

        System.out.println("\n[INFO] Kontainer berhasil dibuat!");
        System.out.println("Nomor Resi        : " + kontainer.getNomorResi());
        System.out.println("Nama Pemilik      : " + kontainer.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainer.getKapasitasMaksimal() + " kg");
        System.out.println("Muatan Saat Ini   : " + kontainer.getBeratMuatanSaatIni() + " kg");

        int pilihan;
        do {
            System.out.println("\n---------------- MENU OPERASIONAL ----------------");
            System.out.println("1. Tambah Muatan (Muat Barang)");
            System.out.println("2. Turunkan Muatan (Bongkar Muat)");
            System.out.println("3. Cek Status Kontainer");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi (1-4): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan berat muatan yang akan ditambahkan (kg): ");
                    double tambah = scanner.nextDouble();
                    kontainer.tambahMuatan(tambah);
                    System.out.println("Berat muatan saat ini: " + kontainer.getBeratMuatanSaatIni() + " kg");
                    break;
                case 2:
                    System.out.print("Masukkan berat muatan yang akan diturunkan (kg): ");
                    double turun = scanner.nextDouble();
                    kontainer.turunkanMuatan(turun);
                    System.out.println("Berat muatan saat ini: " + kontainer.getBeratMuatanSaatIni() + " kg");
                    break;
                case 3:
                    System.out.println("\n--- STATUS KONTAINER ---");
                    System.out.println("Nomor Resi        : " + kontainer.getNomorResi());
                    System.out.println("Pemilik           : " + kontainer.getNamaPemilik());
                    System.out.println("Kapasitas Maksimal: " + kontainer.getKapasitasMaksimal() + " kg");
                    System.out.println("Muatan Saat Ini   : " + kontainer.getBeratMuatanSaatIni() + " kg");
                    System.out.println("Sisa Kapasitas    : " + (kontainer.getKapasitasMaksimal() - kontainer.getBeratMuatanSaatIni()) + " kg");
                    break;
                case 4:
                    System.out.println("\nTerima kasih telah menggunakan sistem logistik kontainer.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 4);

        scanner.close();
    }
}
