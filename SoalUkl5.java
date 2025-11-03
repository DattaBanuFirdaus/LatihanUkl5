import java.util.Scanner;

public class SoalUkl5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Siswa: ");
        int jumlahSiswa = input.nextInt();
        int temp = 0;
        for (int i = 1; i<= jumlahSiswa; i++) {
            System.out.println("Masukkan Nilai Siswa ke-" + i);
            int nilai = input.nextInt();
            temp += nilai;

        }
        System.out.println("Rata-rata Nilai Siswa adalah : " + jumlahSiswa+ " siswa adalah " + temp/jumlahSiswa);
    }
    
    
}
