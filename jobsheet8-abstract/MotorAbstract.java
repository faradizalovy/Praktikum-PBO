public class MotorAbstract extends KendaraanAbstract {
    public String jenisMotor;

    public MotorAbstract(String nomorPolisi, String merek, double tarifSewa, String jenisMotor) {
        super(nomorPolisi, merek, tarifSewa);
        this.jenisMotor = jenisMotor;
    }

    @Override
    public double hitungBiayaSewa(int lamaSewa) {
        return this.tarifSewa * lamaSewa;
    }
}
