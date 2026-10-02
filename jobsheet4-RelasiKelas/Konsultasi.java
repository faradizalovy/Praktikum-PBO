import java.time.LocalDate;//Mengimpor class LocalDate dari package java.time. LocalDate digunakan untuk menyimpan data tanggal, seperti 2021-08-11.

public class Konsultasi {//Mendeklarasikan class bernama Konsultasi. Keyword public berarti class dapat diakses dari class lain.
    private LocalDate tanggal;//atribut tanggal dengan tipe LocalDate untuk menyimpan tanggal konsultasi. private berarti atribut hanya dapat diakses langsung dari dalam class Konsultasi.
    private Pegawai dokter;//atribut dokter dengan tipe Pegawai. Artinya, data dokter disimpan sebagai objek dari class Pegawai. Atribut ini menunjukkan adanya relasi antara class Konsultasi dengan class Pegawai.
    private Pegawai perawat;//atribut perawat dengan tipe Pegawai. Artinya, data perawat juga disimpan sebagai objek dari class Pegawai.

    public LocalDate getTanggal() {//ethod getter bernama getTanggal(). get digunakan untuk method yang berfungsi mengambil atau membaca nilai suatu atribut. getTanggal berarti mengambil nilai atribut tanggal. Method ini mengembalikan nilai bertipe LocalDate
        return tanggal;//Mengembalikan nilai atribut tanggal kepada bagian program yang memanggil method getTanggal(). Keyword return digunakan untuk mengembalikan hasil dari method.
    }
    public void setTanggal(LocalDate tanggal) {//method setter bernama setTanggal(). set digunakan untuk method yang berfungsi memberikan atau mengubah nilai atribut. setTanggal berarti mengatur atau mengubah nilai tanggal. void berarti method tidak mengembalikan nilai.
        this.tanggal = tanggal;//Mengisi atau mengubah atribut tanggal milik objek menggunakan nilai dari parameter tanggal. this.tanggal menunjukkan atribut milik objek, sedangkan tanggal setelah = merupakan parameter yang diberikan.
    }
    public Pegawai getDokter() {//method getter bernama getDokter(). get berarti mengambil atau membaca nilai, sehingga getDokter() digunakan untuk mengambil objek Pegawai yang disimpan pada atribut dokter. Tipe Pegawai menunjukkan bahwa nilai yang dikembalikan berupa objek Pegawai.
        return dokter;//Mengembalikan objek Pegawai yang tersimpan pada atribut dokter.
    }
    public void setDokter(Pegawai dokter) {//method setter bernama setDokter(). Method ini digunakan untuk memberikan atau mengubah objek Pegawai yang disimpan pada atribut dokter. Parameter dokter bertipe Pegawai, sehingga nilai yang diberikan harus berupa objek Pegawai.
        this.dokter = dokter;//Mengisi atribut dokter milik objek dengan objek Pegawai yang diberikan melalui parameter. this.dokter menunjukkan atribut milik objek, sedangkan dokter menunjukkan parameter yang diberikan.
    }
    public Pegawai getPerawat() {//method getter bernama getPerawat(). get digunakan untuk mengambil atau membaca nilai atribut, sehingga getPerawat() digunakan untuk mengambil objek Pegawai yang disimpan pada atribut perawat.
        return perawat;//Mengembalikan objek Pegawai yang tersimpan pada atribut perawat.
    }
    public void setPerawat(Pegawai perawat) {//method setter bernama setPerawat(). Method ini digunakan untuk memberikan atau mengubah objek Pegawai pada atribut perawat. Parameter perawat bertipe Pegawai.
        this.perawat = perawat;//Mengisi atau mengubah atribut perawat milik objek menggunakan objek Pegawai yang diberikan melalui parameter. this.perawat menunjukkan atribut milik objek.
    }
    public String getInfo() {//Mendeklarasikan method getInfo() yang digunakan untuk menghasilkan informasi mengenai konsultasi dalam bentuk String. Method ini tidak hanya mengambil satu atribut, tetapi menyusun beberapa informasi konsultasi menjadi satu teks.
        String info = "";//Membuat variabel lokal bernama info bertipe String dengan nilai awal berupa teks kosong. Variabel ini digunakan untuk menampung informasi konsultasi.
        info += "\tTanggal: " + tanggal;//Menambahkan informasi tanggal ke dalam variabel info. Operator += berarti menambahkan nilai baru ke nilai yang sudah ada. \t digunakan untuk memberikan jarak/tab di awal teks.
        info += ", Dokter: " + dokter.getInfo();//Menambahkan informasi dokter ke dalam info. dokter.getInfo() memanggil method getInfo() milik objek Pegawai yang tersimpan pada atribut dokter, sehingga menghasilkan informasi seperti dr. Ani (1234)
        info += ", Perawat: " + perawat.getInfo();//Menambahkan informasi perawat ke dalam info. perawat.getInfo() mengambil informasi dari objek Pegawai yang disimpan pada atribut perawat.
        info += "\n";//Menambahkan karakter \n yang berfungsi untuk membuat baris baru setelah informasi konsultasi selesai.
        return info;//Mengembalikan seluruh informasi konsultasi yang sudah disusun dalam variabel info kepada bagian program yang memanggil getInfo().
    }
}