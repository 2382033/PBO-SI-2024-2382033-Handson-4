public class ContohReturnValue {

        // Method dengan return value bertipe int
        public static int tambah(int a, int b) {
            int hasil = a + b; // Menghitung hasil penjumlahan
            return hasil; // Mengembalikan hasil penjumlahan
        }

        // Method dengan return value bertipe boolean
        public static boolean apakahGenap(int angka) {
            return angka % 2 == 0; // Mengembalikan true jika angka genap, false jika ganjil
        }

        // Method dengan return value bertipe String
        public static String sapaan(String nama) {
            return "Halo, " + nama; // Mengembalikan string sapaan
        }

        public static void main(String[] args) {
            int hasil = tambah(3, 5); // Memanggil method tambah
            System.out.println("Hasil penjumlahan: " + hasil); // Output hasil penjumlahan

            // Contoh penggunaan method apakahGenap
            int angka = 4;
            System.out.println(angka + " adalah genap? " + apakahGenap(angka)); // Output apakah genap

            // Contoh penggunaan method sapaan
            String nama = "Asafati";
            System.out.println(sapaan(nama)); // Output sapaan
        }
    }

