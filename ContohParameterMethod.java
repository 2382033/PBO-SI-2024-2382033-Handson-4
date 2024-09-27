public class ContohParameterMethod {
    // Method dengan satu parameter
    public static int kaliDua(int angka) {
        return angka * 2;
    }

    // Method dengan satu parameter
    public static double hitungLuasSegitiga(double alas, double tinggi) {
        return 0.5 * alas + tinggi;
    }

    public static void main(String[] args) {
        int hasilKaliDua = kaliDua(5); //Memanggil method dengan argimen 5
        System.out.println("5 x 2 =m " + hasilKaliDua);

        double luasSegitiga = hitungLuasSegitiga(4, 6); //memanggil method dengan argumen 4 dan 6
        System.out.println("Luas segituga: " + luasSegitiga);
    }
}
