public class MobilDemo {
    public static void main(String[] args) {

        Mobil mobil1 = new Mobil();
        mobil1.merk = "Toyota";
        mobil1.warna = "Hitam";
        mobil1.jumlahPintu = 4;

        Mobil mobil2 = new Mobil();
        mobil2.merk = "Honda";
        mobil2.warna = "Putih";
        mobil2.jumlahPintu = 4;

        System.out.println("=== Data Mobil 1 ===");
        mobil1.displayInfo();
        mobil1.nyalakan();

        System.out.println();

        System.out.println("=== Data Mobil 2 ===");
        mobil2.displayInfo();
        mobil2.nyalakan();

        System.out.println();
        System.out.println("=== Setelah Update Attribute ===");

        mobil1.warna = "Merah";
        mobil1.jumlahPintu = 2;

        mobil2.merk = "Honda Civic";
        mobil2.warna = "Biru";

        System.out.println();
        System.out.println("Data Mobil 1 setelah update:");
        mobil1.displayInfo();

        System.out.println();
        System.out.println("Data Mobil 2 setelah update:");
        mobil2.displayInfo();

        mobil1.nyalakan();
        mobil2.nyalakan();
    }
}