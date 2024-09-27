import java.util.Scanner;
public class Tugas2 {
    // Metode untuk menghitung luas persegi
    public static double luasPersegi(double sisi) {
        return sisi * sisi;
    }
    // Metode untuk menghitung keliling persegi
    public static double kelilingPersegi(double sisi) {
        return 4 * sisi;
    }

    public static double luasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }

    public static double kelilingPersegiPanjang(double panjang, double lebar) {
        return 2 * (panjang + lebar);
    }
    // Metode untuk menghitung luas lingkaran
    public static double luasLingkaran(double radius) {
        return Math.PI * radius * radius;
    }
    // Metode untuk menghitung keliling lingkaran
    public static double kelilingLingkaran(double radius) {
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih bentuk yang akan dihitung: 1. Persegi, 2.Persegi Panjang, 3. Lingkaran");
        int tipeBentuk = scanner.nextInt();
        switch (tipeBentuk) {
            case 1: // Persegi
                System.out.println("Masukkan panjang sisi dari persegi:");
                double sisi = scanner.nextDouble();
                System.out.println("Luas dari persegi: " + luasPersegi(sisi));
                System.out.println("Keliling dari persegi: " + kelilingPersegi(sisi));
            case 2: // Persegi Panjang
                System.out.println("Masukkan panjang dan lebar dari persegi panjang:");
                double panjang = scanner.nextDouble();
                double lebar = scanner.nextDouble();
                System.out.println("Luas dari persegi panjang: " + luasPersegiPanjang(panjang, lebar));
                System.out.println("Keliling dari persegi panjang: " + kelilingPersegiPanjang(panjang, lebar));
                break;
            case 3: // Lingkaran
                System.out.println("Masukkan radius dari lingkaran:");
                double radius = scanner.nextDouble();
                System.out.println("Luas dari lingkaran: " + luasLingkaran(radius));
                System.out.println("Keliling dari lingkaran: " + kelilingLingkaran(radius));
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
        scanner.close();
    }
}