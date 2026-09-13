public class DemoPersegi {
    public static void main(String[] args) {

        PersegiPanjang persegi = new PersegiPanjang();
        persegi.panjang = 10;
        persegi.lebar = 5;

        persegi.displayInfo();
        
        System.out.println("Luas     : " + persegi.getLuas());
        System.out.println("Keliling : " + persegi.getKeliling());
    }
}