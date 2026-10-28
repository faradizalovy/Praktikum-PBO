
public class Kendaraan5 {
    protected String merek;
    protected int kecepatan;
    protected int tahun;

    // Constructor tanpa parameter
    public Kendaraan5() {
        this.merek = "Tidak diketahui";
        this.kecepatan = 0;
        this.tahun = 0;
    }

    // Constructor berparameter
    public Kendaraan5(String merek, int kecepatan, int tahun) {
        this.merek = merek;
        this.kecepatan = kecepatan;
        this.tahun = tahun;
    }

    // Method untuk menampilkan informasi kendaraan
    public String getInfo() {
        return "Merek          : " + merek
                + "\nKecepatan      : " + kecepatan + " km/jam"
                + "\nTahun          : " + tahun;
    }
}
