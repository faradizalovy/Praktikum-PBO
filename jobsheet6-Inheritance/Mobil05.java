
public class Mobil05 extends Kendaraan05 {
    public int jumlahRoda;

    public Mobil05() {
        super();
        this.jumlahRoda = 4;
    }
    public Mobil05(String merk, String warna, int tahun, int jumlahRoda) {
        super(merk, warna, tahun);
        this.jumlahRoda = jumlahRoda;
    }
    public String getInfo() {
        String info = "";

        info += "Merk        : " + merk + "\n";
        info += "Warna       : " + warna + "\n";
        info += "Tahun       : " + tahun + "\n";
        info += "Jumlah Roda : " + jumlahRoda + "\n";

        return info;
    }
}