public class Mobil5 extends Kendaraan5 {
    private int jumlahPintu;

    // Constructor tanpa parameter
    public Mobil5() {
        super();
        this.jumlahPintu = 4;
    }

    // Constructor berparameter
    public Mobil5(String merek, int kecepatan, int tahun, int jumlahPintu) {
        super(merek, kecepatan, tahun);
        this.jumlahPintu = jumlahPintu;
    }

    // Method overriding
    public String getInfo() {
        return super.getInfo()
                + "\nJumlah Pintu   : " + jumlahPintu;
    }
}
