public class Pegawai05 {
    public String nip;
    public String nama;
    public double gaji;

    //public Pegawai05() {
    //  System.out.println("Objek dari class Pegawai05 dibuat");
    //}

    public Pegawai05(String nip, String nama, double gaji) {
        this.nip = nip;
        this.nama = nama;
        this.gaji = gaji;
    }

    public String getInfo() {
        String info = "";
        info += "NIP      : " + nip + "\n";
        info += "Nama     : " + nama + "\n";
        info += "Gaji     : " + gaji + "\n";

        return info;
    }
}