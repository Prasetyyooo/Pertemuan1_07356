import java.util.Scanner;

public class KonversiNilai_07356 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int banyak_07356;
        int grade_07356;

        System.out.print("Jumlah Mahasiswa : ");
        banyak_07356 = scan.nextInt();

        int[] nilai_07356= new int[banyak_07356];

        for (int i=0; i<banyak_07356 ; i++){
            System.out.print("Nilai Mahasiswa Ke-" + (i+1) + " : ");
            nilai_07356[i] = scan.nextInt();
        }

        for (int i = 0; i < banyak_07356; i++) {


            if (nilai_07356[i] < 60) {
                System.out.println("E");
                grade_07356 = 0;
            } else if (nilai_07356[i] < 70) {
                System.out.println("D");
                grade_07356 = 0;
            } else if (nilai_07356[i] < 80) {
                System.out.println("C");
                if (nilai_07356[i] >= 75){
                    grade_07356 = 1;
                } else {
                    grade_07356 = 0;
                }
            } else if (nilai_07356[i] < 90) {
                System.out.println("B");
                grade_07356 = 1;
            } else {
                System.out.println("A");
                grade_07356 = 1;
            }

            switch (grade_07356){
                case 0:
                    System.out.println("TIDAK LULUS");
                    break;
                case 1:
                    System.out.println("LULUS");
                    break;
            }
        }
    }
}

// Tambah rata, memunculkan grade nilai