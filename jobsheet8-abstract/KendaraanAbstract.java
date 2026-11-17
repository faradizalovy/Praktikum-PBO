public abstract class KendaraanAbstract {
    public String nomorPolisi;
    public String merek;
    public double tarifSewa;

    public KendaraanAbstract(String nomorPolisi, String merek, double tarifSewa) {
        this.nomorPolisi = nomorPolisi;
        this.merek = merek;
        this.tarifSewa = tarifSewa;
    }

    public void tampilkanInfo() {
        System.out.println("Nomor Polisi : " + this.nomorPolisi);
        System.out.println("Merek        : " + this.merek);
        System.out.println("Tarif Sewa   : Rp" + this.tarifSewa);
    }

    public abstract double hitungBiayaSewa(int lamaSewa);
}
