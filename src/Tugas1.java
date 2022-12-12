public class Tugas1 {
    public static void main(String[] args) {
        /*
        soal01(9);
        System.out.println();
        soal01(14);
        System.out.println();
        soal01(22);
        System.out.println();
        soal01(17);
        System.out.println();
        soal01(4);
        System.out.println();
        */

        /*
        soal03(9);
        System.out.println();
        soal03(15);
        System.out.println();
        soal03(20);
        System.out.println();
        soal03(12);
        System.out.println();
        soal03(24);
        System.out.println();

         */

        /*
        soal04(9);
        System.out.println();
        soal04(4);
        System.out.println();
        soal04(18);
        System.out.println();
        soal04(24);
        System.out.println();
        soal04(19);
        System.out.println();

         */
        /*
        soal05(9);
        System.out.println();
        soal05(12);
        System.out.println();
        soal05(16);
        System.out.println();
        soal05(22);
        System.out.println();
        soal05(17);
        System.out.println();

         */
        soal06(9);

    }

    public static void soal01(int n){
        int[] deret = new int[n];
        int angka = 1;
        // proses mengisi array
        for (int i = 0; i < n; i++) {
            deret[i] = angka;
            angka++;
        }

        // proses menampilkan
        for (int b = 0; b < n; b++) {
            System.out.print(deret[b]+"\t");
        }
    }

    public static void soal02(int n){
        int[] deret = new int[n];
        int angka = 1;
        // proses mengisi array
        for (int i = 0; i < n; i++) {
            deret[i] = angka;
            angka++;
        }

        // proses menampilkan
        for (int b = 0; b < n; b++) {
            System.out.print(deret[b]+"\t");
        }
    }

    public static void soal03(int n){
        int[] deret = new int[n];
        int angka = 0;
        // proses mengisi array
        for (int i = 0; i < n; i++) {
            deret[i] = angka;
            angka+=2;
        }

        // proses menampilkan
        for (int b = 0; b < n; b++) {
            System.out.print(deret[b]+"\t");
        }
    }

    public static void soal04(int n){
        int[] deret = new int[n];
        // 1  1  2  3  5  8 13  21
        // 0  1  2  3  4  5  6  7
        for (int i = 0; i < deret.length; i++){
            if(i == 0 || i == 1){
                // deret ke i => 0, 1
                deret[i] = 1;
            }else {
                deret[i] = deret[i-1] + deret[i-2];
            }
        }

        // proses menampilkan
        for (int b = 0; b < n; b++) {
            System.out.print(deret[b]+"\t");
        }
    }

    public static void soal05(int n){
        int[] deret = new int[n];
        // 1  1  1  3  5  9  17  31  57
        // 0  1  2  3  4  5  6   7
        for (int i = 0; i < deret.length; i++){
            if(i == 0 || i == 1 || i == 2){
                // deret ke i => 0, 1
                deret[i] = 1;
            }else {
                deret[i] = deret[i-1] + deret[i-2] + deret[i-3];
            }
        }

        // proses menampilkan
        for (int b = 0; b < n; b++) {
            System.out.print(deret[b]+"\t");
        }
    }

    public static void soal06(int n){
        int[] deret = new int[n];
        // 2  3  5  7  11  13  17  19  23
        // 0  1  2  3  4  5  6   7
        for (int i = 0; i < deret.length; i++){
            if(i == 0){
                deret[i] = 2;
            }else {
                if(i % i == 0){
                    deret[i] = i;
                    i++;
                }
            }
        }

        // proses menampilkan
        for (int b = 0; b < n; b++) {
            System.out.print(deret[b]+"\t");
        }
    }

}
