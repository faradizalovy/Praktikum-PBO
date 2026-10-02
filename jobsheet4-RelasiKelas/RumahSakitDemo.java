import java.time.LocalDate;//Mengimpor class LocalDate dari package java.time. LocalDate digunakan untuk membuat dan menyimpan data tanggal konsultasi
public class RumahSakitDemo {//Mendeklarasikan class bernama RumahSakitDemo. Class ini digunakan sebagai class utama untuk menjalankan dan menguji program. public berarti class dapat diakses dari class lain.
    public static void main(String[] args) {//method main() yang menjadi titik awal program dijalankan. public membuat method dapat diakses oleh Java, static berarti method dapat dijalankan tanpa membuat objek RumahSakitDemo, dan void berarti method tidak mengembalikan nilai. String[] args digunakan untuk menerima argumen dari command line.
        Pegawai ani = new Pegawai("1234", "dr. Ani");//Membuat objek Pegawai bernama ani menggunakan constructor Pegawai. Nilai "1234" diberikan sebagai NIP dan "dr. Ani" sebagai nama pegawai.
        Pegawai bagus = new Pegawai("4567", "dr. Bagus");//Membuat objek Pegawai bernama bagus dengan NIP 4567 dan nama dr. Bagus.
        Pegawai desi = new Pegawai("1234", "Ns. Desi");//Membuat objek Pegawai bernama desi dengan NIP 1234 dan nama Ns. Desi. Pada program ini objek tersebut digunakan sebagai data perawat.
        Pegawai eka = new Pegawai("4567", "Ns. Eka");//Membuat objek Pegawai bernama eka dengan NIP 4567 dan nama Ns. Eka. Objek ini digunakan sebagai data perawat.
        Pasien pasien1 = new Pasien("343298", "Puspa Widya");//Membuat objek Pasien bernama pasien1 menggunakan constructor Pasien. "343298" menjadi nomor rekam medis dan "Puspa Widya" menjadi nama pasien.

        pasien1.tambahKonsultasi(//Memanggil method tambahKonsultasi() milik objek pasien1 untuk menambahkan data konsultasi ke dalam riwayat pasien.
                LocalDate.of(2021, 8, 11),//Membuat data tanggal menggunakan method LocalDate.of(). Angka tersebut menunjukkan tahun 2021, bulan 8 (Agustus), dan tanggal 11. Tanggal ini menjadi parameter tanggal pada method tambahKonsultasi().
                ani, desi//Mengirimkan objek ani sebagai parameter dokter. Objek ani sebelumnya dibuat dari class Pegawai.
                //Mengirimkan objek desi sebagai parameter perawat. Objek desi juga dibuat dari class Pegawai.
        );
        pasien1.tambahKonsultasi(//Memanggil kembali method tambahKonsultasi() untuk menambahkan konsultasi kedua pada objek pasien1.
                LocalDate.of(2021, 9, 11),//Membuat data tanggal konsultasi kedua, yaitu 11 September 2021.
                bagus, eka //Mengirimkan objek bagus sebagai parameter dokter untuk konsultasi kedua.
                //Mengirimkan objek eka sebagai parameter perawat untuk konsultasi kedua.
        );
        System.out.println(pasien1.getInfo());//Memanggil getInfo() untuk mengambil seluruh informasi pasien1, kemudian System.out.println() menampilkan hasilnya ke layar.
        Pasien pasien2 = new Pasien("997744", "Yenny Anggraeni");//Membuat objek Pasien kedua bernama pasien2 dengan nomor rekam medis 997744 dan nama Yenny Anggraeni. Pada saat dibuat, pasien ini belum memiliki riwayat konsultasi.
        System.out.println(pasien2.getInfo());//Memanggil getInfo() untuk mengambil informasi pasien2, kemudian menampilkannya ke layar. Karena belum ada konsultasi, program akan menampilkan "Belum ada riwayat konsultasi".
    }
}