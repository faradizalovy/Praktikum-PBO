public class AbstractClassDemoTeori {
    public static void main(String[] args) {
        MobilAbstract mobil1 = new MobilAbstract("N 1234 AB", "Toyota Avanza", 350000, 7);
        MotorAbstract motor1 = new MotorAbstract("N 5678 CD", "Honda", 75000, "Matic");

        System.out.println("===== INFORMASI MOBIL =====");
        mobil1.tampilkanInfo();
        System.out.println("Jumlah Kursi : " + mobil1.jumlahKursi);
        System.out.println("Lama Sewa    : 3 hari");
        System.out.println("Biaya Sewa   : Rp" + mobil1.hitungBiayaSewa(3));

        System.out.println();

        System.out.println("===== INFORMASI MOTOR =====");
        motor1.tampilkanInfo();
        System.out.println("Jenis Motor  : " + motor1.jenisMotor);
        System.out.println("Lama Sewa    : 3 hari");
        System.out.println("Biaya Sewa   : Rp" + motor1.hitungBiayaSewa(3));
    }
}
