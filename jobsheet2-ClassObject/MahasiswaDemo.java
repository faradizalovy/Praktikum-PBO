public class MahasiswaDemo {
    public static void main(String[] args) {

        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";
        m1.displayBiodata();

        System.out.println();

        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "023433";
        m2.nama = "Faradiza";
        m2.alamat = "Malang";
        m2.kelas = "2A";
        m2.displayBiodata();
    }
}