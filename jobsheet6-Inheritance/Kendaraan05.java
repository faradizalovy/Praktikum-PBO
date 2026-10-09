public class Kendaraan05 {

    public String merk;
    public String warna;
    public int tahun;

    public Kendaraan05() {
        this.merk = "Tidak diketahui";
        this.warna = "Tidak diketahui";
        this.tahun = 0;
    }

    public Kendaraan05(String merk, String warna, int tahun) {
        this.merk = merk;
        this.warna = warna;
        this.tahun = tahun;
    }

    public String getInfo() {
        String info = "";

        info += "Merk       : " + merk + "\n";
        info += "Warna      : " + warna + "\n";
        info += "Tahun      : " + tahun + "\n";

        return info;
    }
}