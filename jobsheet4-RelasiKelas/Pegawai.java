public class Pegawai { //Mendeklarasikan class bernama Pegawai. Keyword public berarti class dapat diakses dari class lain.
    private String nip; //atribut nip bertipe String untuk menyimpan nomor identitas pegawai. private berarti atribut hanya dapat diakses langsung dari dalam class Pegawai.
    private String nama;// atribut nama bertipe String untuk menyimpan nama pegawai. Atribut dibuat private agar penerapan enkapsulasi tetap terjaga.

    public Pegawai(String nip, String nama) { //constructor Pegawai dengan dua parameter, yaitu nip dan nama. Constructor digunakan saat membuat objek Pegawai untuk memberikan nilai awal pada atribut.
        this.nip = nip;//Mengisi atribut nip milik objek dengan nilai dari parameter nip. Keyword this menunjukkan atribut milik objek yang sedang dibuat.
        this.nama = nama;//Mengisi atribut nama milik objek dengan nilai dari parameter nama
    }
    public String getNip() {//method getter getNip() yang memiliki tipe kembalian String dan digunakan untuk mengambil nilai atribut nip.
        return nip; //Mengembalikan nilai atribut nip kepada bagian program yang memanggil method getNip().
    }
    public void setNip(String nip) { //method setter setNip() untuk mengubah nilai atribut nip. Parameter method berupa String dengan nama nip.
        this.nip = nip;//Mengubah nilai atribut nip milik objek menggunakan nilai nip yang diberikan melalui parameter.
    }
    public String getNama() {//method getter getNama() yang digunakan untuk mengambil nilai atribut nama dan mengembalikannya dalam bentuk String
        return nama;//Mengembalikan nilai atribut nama kepada bagian program yang memanggil method getNama().
    }
    public void setNama(String nama) {//method setter setNama() untuk mengubah nilai atribut nama. Method ini menerima parameter nama bertipe String.
        this.nama = nama;//Mengubah nilai atribut nama milik objek dengan nilai yang diberikan melalui parameter nama.
    }
    public String getInfo() {//method getInfo() yang menghasilkan informasi pegawai dalam bentuk String.
        return nama + " (" + nip + ")";//Menggabungkan nilai nama dan nip menjadi satu teks dengan format nama (nip), kemudian mengembalikan teks tersebut. Contohnya dr. Ani (1234)
    }
}