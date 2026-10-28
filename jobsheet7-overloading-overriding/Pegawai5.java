public class Pegawai5 {
    public String nip;
    public String nama;
    public double gaji;

   // public Pegawai5() {
    //   System.out.println("Ini constructor class Pegawai");
    //}
    public Pegawai5(String nip, String nama, double gaji) {
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
    }
    public String getInfo() {
        String info = "";
        info += "NIP     : " + nip + "\n";
        info += "Nama    : " + nama + "\n";
        info += "Gaji    : " + gaji + "\n";

        return info;
    }
}