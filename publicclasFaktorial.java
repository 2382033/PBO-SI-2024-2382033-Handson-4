public class publicclasFaktorial {
    public class Faktorial {
        // Fungsi faktorial
        public static int faktorial(int n) {
            // Kasus dasar
            if (n == 0) {
                return 1;
            } else {
                // Panggilan rekursif
                return n * faktorial(n - 1);
            }
        }

        public static void main(String[] args) {
            // Menghitung faktorial 5
            int hasil = faktorial(5);
            // Mencetak hasil
            System.out.println("Faktorial dari 5 adalah: " + hasil);
        }
    }
}
