import java.time.LocalDate;//Mengimpor class LocalDate dari package java.time. LocalDate digunakan untuk menyimpan data tanggal konsultasi.
import java.util.ArrayList;//Mengimpor class ArrayList dari package java.util. ArrayList digunakan untuk menyimpan banyak objek Konsultasi dalam satu daftar.

public class Pasien {//Mendeklarasikan class bernama Pasien. Keyword public berarti class dapat diakses dari class lain.
    private String noRekamMedis;//Mendeklarasikan atribut noRekamMedis bertipe String untuk menyimpan nomor rekam medis pasien. private membatasi akses langsung dari luar class.
    private String nama;//atribut nama bertipe String untuk menyimpan nama pasien.
    private ArrayList<Konsultasi> riwayatKonsultasi;//atribut riwayatKonsultasi berupa ArrayList yang digunakan untuk menyimpan banyak objek Konsultasi. 
    // <Konsultasi> menunjukkan bahwa daftar tersebut hanya menyimpan objek bertipe Konsultasi.

    public Pasien(String noRekamMedis, String nama) {//Mendeklarasikan constructor Pasien dengan parameter noRekamMedis dan nama. 
    //Constructor digunakan untuk memberikan nilai awal ketika objek Pasien dibuat.
        this.noRekamMedis = noRekamMedis;//Mengisi atribut noRekamMedis milik objek dengan nilai dari parameter noRekamMedis. this.noRekamMedis menunjukkan atribut milik objek, 
        //sedangkan noRekamMedis merupakan parameter.
        this.nama = nama;//atribut nama milik objek dengan nilai dari parameter nama. Keyword this digunakan untuk membedakan atribut dengan parameter yang memiliki nama sama.
        this.riwayatKonsultasi = new ArrayList<Konsultasi>(); //Membuat ArrayList baru untuk menyimpan objek-objek Konsultasi, kemudian memasukkannya ke atribut riwayatKonsultasi. new digunakan untuk membuat objek baru.
    }
    public String getNoRekamMedis() {//Mendeklarasikan method getter getNoRekamMedis(). get digunakan untuk mengambil atau membaca nilai atribut. Method ini digunakan untuk mengambil nomor rekam medis dan mengembalikan nilai bertipe String.
        return noRekamMedis;//Mengembalikan nilai atribut noRekamMedis kepada bagian program yang memanggil getNoRekamMedis().
    }
    public void setNoRekamMedis(String noRekamMedis) {//Mendeklarasikan method setter setNoRekamMedis(). set digunakan untuk memberikan atau mengubah nilai atribut. void berarti method tidak mengembalikan nilai.
        this.noRekamMedis = noRekamMedis;//Mengubah nilai atribut noRekamMedis milik objek menggunakan nilai yang diberikan melalui parameter.
    }
    public String getNama() {//method getter getNama(). get berarti mengambil atau membaca nilai atribut nama. Method mengembalikan nilai bertipe String.
        return nama;//Mengembalikan nilai atribut nama kepada bagian program yang memanggil getNama().
    }
    public void setNama(String nama) {//method setter setNama(). set digunakan untuk mengubah nilai atribut nama. Parameter nama bertipe String, sedangkan void berarti tidak ada nilai yang dikembalikan.
        this.nama = nama;//Mengubah nilai atribut nama milik objek menggunakan nilai dari parameter nama.
    }
    public void tambahKonsultasi(//method tambahKonsultasi() yang digunakan untuk menambahkan data konsultasi baru ke dalam riwayat pasien. void berarti method ini tidak mengembalikan nilai.
        LocalDate tanggal, Pegawai dokter, Pegawai perawat) {//Mendefinisikan tiga parameter yang dibutuhkan method, yaitu tanggal bertipe LocalDate, serta dokter dan perawat bertipe Pegawai. Ketiga data tersebut digunakan untuk membuat satu data konsultasi.
        Konsultasi konsultasi = new Konsultasi();//Membuat objek baru dari class Konsultasi dan menyimpannya dalam variabel konsultasi. new Konsultasi() digunakan untuk membuat objek konsultasi baru.
        konsultasi.setTanggal(tanggal);//Mengisi atribut tanggal pada objek konsultasi menggunakan method setter setTanggal(). Nilainya berasal dari parameter tanggal.
        konsultasi.setDokter(dokter);//Mengisi atribut dokter pada objek konsultasi menggunakan method setDokter(). Nilainya berasal dari parameter dokter.
        konsultasi.setPerawat(perawat);//Mengisi atribut perawat pada objek konsultasi menggunakan method setPerawat(). Nilainya berasal dari parameter perawat.
        riwayatKonsultasi.add(konsultasi);//Menambahkan objek konsultasi ke dalam ArrayList riwayatKonsultasi. Method add() digunakan untuk menambahkan data ke dalam ArrayList.
    }
    public String getInfo() {//Mendeklarasikan method getInfo() yang digunakan untuk menghasilkan seluruh informasi pasien dan riwayat konsultasinya dalam bentuk String.
        String info = "";//Membuat variabel info bertipe String dengan nilai awal kosong. Variabel ini digunakan untuk menampung informasi pasien
        info += "No Rekam Medis    : " + this.noRekamMedis + "\n";//Menambahkan nomor rekam medis ke dalam info. Operator += digunakan untuk menambahkan teks ke nilai yang sudah ada. this.noRekamMedis menunjukkan atribut nomor rekam medis milik objek. \n digunakan untuk membuat baris baru.
        info += "Nama              : " + this.nama + "\n";//Menambahkan nama pasien ke dalam info, kemudian \n digunakan untuk berpindah ke baris berikutnya. this.nama menunjukkan atribut nama milik objek.
        if (!riwayatKonsultasi.isEmpty()) {//Mengecek apakah riwayatKonsultasi tidak kosong. isEmpty() digunakan untuk mengecek apakah ArrayList kosong. Tanda ! berarti tidak, sehingga !isEmpty() berarti daftar memiliki isi.
            info += "Riwayat Konsultasi :\n";//Jika terdapat riwayat konsultasi, teks "Riwayat Konsultasi :" ditambahkan ke dalam info, kemudian \n membuat baris baru.
            for (Konsultasi konsultasi : riwayatKonsultasi) {//Melakukan perulangan untuk mengambil setiap objek Konsultasi yang terdapat di dalam riwayatKonsultasi. Setiap objek sementara disimpan dalam variabel konsultasi.
                info += konsultasi.getInfo();//Memanggil method getInfo() dari setiap objek Konsultasi, kemudian hasil informasinya ditambahkan ke dalam info.
            }
        } else {//Menjalankan bagian else apabila kondisi if tidak terpenuhi, yaitu ketika riwayatKonsultasi kosong.
            info += "Belum ada riwayat konsultasi";//Menambahkan teks "Belum ada riwayat konsultasi" jika pasien belum memiliki data konsultasi.
        }
        info += "\n";//Menambahkan baris baru setelah seluruh informasi pasien selesai disusun.
        return info;//Mengembalikan seluruh informasi yang sudah disimpan dalam variabel info kepada bagian program yang memanggil getInfo().
    }
}