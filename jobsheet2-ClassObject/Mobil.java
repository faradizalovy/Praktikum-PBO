public class Mobil {
    public String merk;
    public String warna;
    public int jumlahPintu;

    public Mobil() {
    }
    public Mobil(String merk, String warna, int jumlahPintu) {
        this.merk = merk;
        this.warna = warna;
        this.jumlahPintu = jumlahPintu;
    }
    public void nyalakan() {
        System.out.println("Mobil " + merk + " dinyalakan.");
    }
    public void displayInfo() {
        System.out.println("Merk         : " + merk);
        System.out.println("Warna        : " + warna);
        System.out.println("Jumlah Pintu : " + jumlahPintu);
    }
}