import java.util.Scanner; //Baris tersebut digunakan untuk mengimpor class Scanner, agar program dapat menerima input yang diberikan oleh pengguna
public class KalkulatorStruktural {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input angka pertama
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        // Input operator
        System.out.print("Masukkan operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        // Input angka kedua
        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();
        double hasil;

        // Menentukan operasi berdasarkan operator
        switch (operator) {
            case '+':
                hasil = tambah(angka1, angka2);
                System.out.println("Hasil: " + angka1 + " " + operator + " " + angka2 + " = " + hasil);
                break;

            case '-':
                hasil = kurang(angka1, angka2);
                System.out.println("Hasil: " + angka1 + " " + operator + " " + angka2 + " = " + hasil);
                break;

            case '*':
                hasil = kali(angka1, angka2);
                System.out.println("Hasil: " + angka1 + " " + operator + " " + angka2 + " = " + hasil);
                break;

            case '/':
                if (angka2 != 0) {
                    hasil = bagi(angka1, angka2);
                    System.out.println("Hasil: " + angka1 + " " + operator + " " + angka2 + " = " + hasil);
                 } else {
                    System.out.println("Error: angka kedua tidak boleh 0.");
                }
                break;

            default:
                System.out.println("Operator tidak valid.");
        }

        input.close();
    }

    // Function penjumlahan
    public static double tambah(double angka1, double angka2) {
        return angka1 + angka2;
    }
    // Function pengurangan
    public static double kurang(double angka1, double angka2) {
        return angka1 - angka2;
    }
    // Function perkalian
    public static double kali(double angka1, double angka2) {
        return angka1 * angka2;
    }
    // Function pembagian
    public static double bagi(double angka1, double angka2) {
        return angka1 / angka2;
    }
}