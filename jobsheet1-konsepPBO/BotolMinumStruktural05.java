public class BotolMinumStruktural05 { //Baris ini digunakan untuk membuat sebuah class bernama BotolMinumStruktural. 
// Kata public berarti class dapat diakses dari class lain. Nama class harus sama dengan nama file Java, yaitu BotolMinumStruktural.java.
    public static void main(String[] args) { //Baris ini merupakan method utama yang pertama kali dijalankan ketika program dieksekusi.
        // Data botol 1
        String merek1 = "Tupperware"; //Membuat variabel merek1 bertipe String untuk menyimpan nama merek botol pertama. Nilainya adalah "Tupperware".
        int kapasitas1 = 1000; //Membuat variabel kapasitas1 bertipe int untuk menyimpan kapasitas maksimum botol pertama, yaitu 1000 ml.
        int volumeAir1 = 700; //Membuat variabel volumeAir1 bertipe int untuk menyimpan jumlah air yang terdapat di dalam botol pertama, yaitu 700 ml.

        // Data botol 2
        String merek2 = "LocknLock"; //Menyimpan merek botol kedua, yaitu LocknLock.
        int kapasitas2 = 800; //Menyimpan kapasitas maksimum botol kedua
        int volumeAir2 = 500; // Menyimpan volume air awal pada botol kedua

        // Data botol 3
        String merek3 = "Hydro Flask"; //menyimpan merek botol ketiga, yaitu Hydro Flask
        int kapasitas3 = 1200; //menimpan kapasitas maksimum botol ketiga sebesar 1200
        int volumeAir3 = 900; //menyimpan volume air awal sebesar 900 ml

        // Data botol 4
        String merek4 = "Stanley";  //Menyimpan merek botol keempat
        int kapasitas4 = 1000; //Menyimpan kapasitas maksimum sebesar 1000 ml.
        int volumeAir4 = 600; //Menyimpan volume air awal sebesar 600 ml.

        // Data botol 5
        String merek5 = "CamelBak"; //Menyimpan merek botol kelima.
        int kapasitas5 = 750; //Menyimpan kapasitas maksimum botol sebesar 750 ml.
        int volumeAir5 = 400; //Menyimpan volume air awal sebesar 400 ml.

        // Data botol 6
        String merek6 = "Nalgene"; //Menyimpan merek botol keenam.
        int kapasitas6 = 1000; //Menyimpan kapasitas maksimum botol keenam sebesar 1000 ml.
        int volumeAir6 = 800; //Menyimpan volume air awal sebesar 800 ml.

        // Data botol 7
        String merek7 = "Eiger"; //Menyimpan merek botol ketujuh.
        int kapasitas7 = 700; //menyimpan kapasitas maksimum sebesar 700 ml
        int volumeAir7 = 450; //meyimpan volume air awal sebesar 450

        // Data botol 8
        String merek8 = "Arctic Hunter"; // menyimpan merek botol kedelapan
        int kapasitas8 = 900; //menyimpan kapasitas maksimum sebesar 900 ml
        int volumeAir8 = 650; //menyimpan volume air awal 

        // Data botol 9
        String merek9 = "Contigo"; //menyimpan merek botol kesembilan
        int kapasitas9 = 600; //menyimpan kapasitas maksimum
        int volumeAir9 = 350; //menyimpan volume air awal

        // Data botol 10
        String merek10 = "Thermos"; //menyimpan merek botol kesepuluh
        int kapasitas10 = 1500; //menyimpan kapasitas maksimum sebesar 1500ml
        int volumeAir10 = 1000; //menyimpan volume air awal sebesar 1000ml


        // Memanggil function minum()
        //digunakan untuk menjalankan function minum() pada Botol 1. Nilai volumeAir1, 
        //yaitu 700 ml, dikirim sebagai parameter pertama, sedangkan angka 200 menunjukkan jumlah air yang diminum. Function kemudian 
        // mengurangi volume air tersebut sehingga hasilnya menjadi 500 ml. Hasil yang dikembalikan oleh function disimpan kembali ke 
        // dalam variabel volumeAir1. Proses yang sama dilakukan pada Botol 2 sampai Botol 5
        volumeAir1 = minum(volumeAir1, 200);
        volumeAir2 = minum(volumeAir2, 150);
        volumeAir3 = minum(volumeAir3, 300);
        volumeAir4 = minum(volumeAir4, 250);
        volumeAir5 = minum(volumeAir5, 100);

        // Memanggil function isiAir()
        //Baris tersebut menjalankan function isiAir() pada Botol 6. Parameter pertama menunjukkan volume air saat ini, yaitu 800 ml. 
        // Parameter kedua menunjukkan jumlah air yang akan ditambahkan, yaitu 100 ml, sedangkan parameter ketiga menunjukkan kapasitas 
        // maksimum botol, yaitu 1000 ml. Setelah dilakukan proses pengisian, volume air menjadi 900 ml dan hasil tersebut disimpan 
        // kembali ke dalam volumeAir6.
        volumeAir6 = isiAir(volumeAir6, 100, kapasitas6);
        volumeAir7 = isiAir(volumeAir7, 200, kapasitas7);
        volumeAir8 = isiAir(volumeAir8, 150, kapasitas8);
        volumeAir9 = isiAir(volumeAir9, 100, kapasitas9);
        volumeAir10 = isiAir(volumeAir10, 300, kapasitas10);


        // Menampilkan data seluruh botol
        System.out.println("=== DATA BOTOL MINUM ==="); //Baris tersebut digunakan untuk menampilkan judul serta
        //mencetak informasi ke layar dan kemudian berpindah ke baris berikutnya.

        //Bagian berikut menampilkan identitas Botol 1 beserta merek, kapasitas, dan volume air setelah dilakukan 
        // proses minum(). Tanda + digunakan untuk menggabungkan teks dengan nilai yang terdapat pada variabel. 
        // Sementara itu, \n digunakan untuk membuat baris baru sebelum tulisan Botol 1. Pola tersebut kemudian 
        // digunakan kembali untuk menampilkan data Botol 2 hingga Botol 10.
        System.out.println("\nBotol 1");
        System.out.println("Merek      : " + merek1);
        System.out.println("Kapasitas  : " + kapasitas1 + " ml");
        System.out.println("Volume Air : " + volumeAir1 + " ml");

        System.out.println("\nBotol 2");
        System.out.println("Merek      : " + merek2);
        System.out.println("Kapasitas  : " + kapasitas2 + " ml");
        System.out.println("Volume Air : " + volumeAir2 + " ml");

        System.out.println("\nBotol 3");
        System.out.println("Merek      : " + merek3);
        System.out.println("Kapasitas  : " + kapasitas3 + " ml");
        System.out.println("Volume Air : " + volumeAir3 + " ml");

        System.out.println("\nBotol 4");
        System.out.println("Merek      : " + merek4);
        System.out.println("Kapasitas  : " + kapasitas4 + " ml");
        System.out.println("Volume Air : " + volumeAir4 + " ml");

        System.out.println("\nBotol 5");
        System.out.println("Merek      : " + merek5);
        System.out.println("Kapasitas  : " + kapasitas5 + " ml");
        System.out.println("Volume Air : " + volumeAir5 + " ml");

        System.out.println("\nBotol 6");
        System.out.println("Merek      : " + merek6);
        System.out.println("Kapasitas  : " + kapasitas6 + " ml");
        System.out.println("Volume Air : " + volumeAir6 + " ml");

        System.out.println("\nBotol 7");
        System.out.println("Merek      : " + merek7);
        System.out.println("Kapasitas  : " + kapasitas7 + " ml");
        System.out.println("Volume Air : " + volumeAir7 + " ml");

        System.out.println("\nBotol 8");
        System.out.println("Merek      : " + merek8);
        System.out.println("Kapasitas  : " + kapasitas8 + " ml");
        System.out.println("Volume Air : " + volumeAir8 + " ml");

        System.out.println("\nBotol 9");
        System.out.println("Merek      : " + merek9);
        System.out.println("Kapasitas  : " + kapasitas9 + " ml");
        System.out.println("Volume Air : " + volumeAir9 + " ml");

        System.out.println("\nBotol 10");
        System.out.println("Merek      : " + merek10);
        System.out.println("Kapasitas  : " + kapasitas10 + " ml");
        System.out.println("Volume Air : " + volumeAir10 + " ml");
    }


    // Function untuk mengisi air
    public static int isiAir(int volumeAir, int tambahan, int kapasitas) { //Function tersebut memiliki tiga parameter, yaitu volumeAir 
    // untuk menunjukkan jumlah air yang sedang berada di dalam botol, tambahan untuk menunjukkan jumlah air yang akan ditambahkan, dan 
    // kapasitas untuk menunjukkan kapasitas maksimum botol. Function menggunakan tipe data int sebagai nilai balik karena hasil akhirnya berupa angka.
        volumeAir += tambahan; //digunakan untuk menambahkan jumlah air.

        // Air tidak boleh melebihi kapasitas botol
        if (volumeAir > kapasitas) { //Kondisi tersebut akan memeriksa apakah volume air setelah ditambahkan melebihi kapasitas maksimum. Apabila 
        // volume air lebih besar daripada kapasitas, nilainya akan dikembalikan menjadi sama dengan kapasitas maksimum. Misalnya kapasitas botol 
        // adalah 1000 ml dan volume setelah ditambahkan menjadi 1100 ml, maka program akan mengubah volumenya menjadi 1000 ml
            volumeAir = kapasitas;
        }
        return volumeAir; //digunakan untuk mengembalikan nilai volumeAir setelah proses pengisian selesai.
    }

    // Function untuk minum
    public static int minum(int volumeAir, int jumlahMinum) { //memiliki dua parameter. Parameter volumeAir menunjukkan jumlah air yang tersedia, 
    // sedangkan jumlahMinum menunjukkan jumlah air yang diminum
        volumeAir -= jumlahMinum; //memiliki dua parameter. Parameter volumeAir menunjukkan jumlah air yang tersedia, sedangkan jumlahMinum 
        // menunjukkan jumlah air yang diminum

        // Volume air tidak boleh kurang dari 0
        //Kondisi tersebut digunakan untuk memeriksa apakah volume air setelah diminum menjadi kurang dari 0. Jika hal tersebut terjadi, 
        // program mengubah nilai volume air menjadi 0 ml. Dengan demikian, program tidak akan menghasilkan volume air negatif yang tidak sesuai dengan kondisi sebenarnya.
        if (volumeAir < 0) {
            volumeAir = 0;
        }
        return volumeAir; //engembalikan nilai volume air setelah proses minum selesai. Nilai yang dikembalikan kemudian disimpan kembali pada variabel volume air masing-masing botol.
    }
}