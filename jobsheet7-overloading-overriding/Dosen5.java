public class Dosen5 extends Pegawai5 {
    public String nidn;

   public Dosen5(String nip, String nama, double gaji, String nidn) {
        super(nip, nama, gaji);
        this.nidn = nidn;
    }
        public String getInfo() {
        return "NIDN    : " + this.nidn + "\n";
    }
    public String getAllInfo() {
        String info = super.getInfo();
        info += this.getInfo();

        return info;
    }
}