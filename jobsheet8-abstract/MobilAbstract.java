public class MobilAbstract extends KendaraanAbstract {
    public int jumlahKursi;

    public MobilAbstract(String nomorPolisi, String merek, double tarifSewa, int jumlahKursi) {
        super(nomorPolisi, merek, tarifSewa);
        this.jumlahKursi = jumlahKursi;
    }

    @Override
    public double hitungBiayaSewa(int lamaSewa) {
        return this.tarifSewa * lamaSewa;
    }
}
