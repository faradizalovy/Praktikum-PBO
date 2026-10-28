public class Motor5 extends Kendaraan5 {
    private String jenisMotor;

    // Constructor tanpa parameter
    public Motor5() {
        super();
        this.jenisMotor = "Tidak diketahui";
    }

    // Constructor berparameter
    public Motor5(String merek, int kecepatan, int tahun, String jenisMotor) {
        super(merek, kecepatan, tahun);
        this.jenisMotor = jenisMotor;
    }

    // Method overriding
    public String getInfo() {
        return super.getInfo()
                + "\nJenis Motor    : " + jenisMotor;
    }
}
