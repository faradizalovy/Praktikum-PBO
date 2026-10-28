
public class KendaraanDemo {
    public static void main(String[] args) {
        // Membuat objek mobil dengan constructor berparameter
        Mobil5 mobil1 = new Mobil5(
                "Toyota", 180, 2024, 4
        );

        // Membuat objek motor dengan constructor berparameter
        Motor5 motor1 = new Motor5(
                "Honda", 100, 2025, "Matic"
        );

        // Menampilkan informasi mobil
        System.out.println("=== INFORMASI MOBIL ===");
        System.out.println(mobil1.getInfo());

        System.out.println();

        // Menampilkan informasi motor
        System.out.println("=== INFORMASI MOTOR ===");
        System.out.println(motor1.getInfo());
    }
}
