import java.util.Scanner;

public class AssignSoal4 {
    public static void main(String[] args) {
        //init
        Scanner input = new Scanner(System.in);
        String konvNilai;

        //assign --> ubah nilai sesuai dengan ketentuan (A-E)
        System.out.println("===============================");
        System.out.println("|    NILAI UJIAN MAHASISWA    |");
        System.out.println("===============================");

        System.out.println("Masukkan Nama Mahasiswa: ");
        String nama = input.nextLine();

        System.out.println("Masukkan Nilai Mahasiswa: ");
        int nilai = input.nextInt();
        if (nilai >= 80  && nilai <= 100){
            konvNilai = "A";
        } else if (nilai >= 65 && nilai <= 79) {
            konvNilai = "B";
        } else if (nilai >= 50 && nilai <= 64) {
            konvNilai = "C";
        } else if (nilai >= 35 && nilai <= 49) {
            konvNilai = "D";
        } else if (nilai >= 0 && nilai <= 34) {
            konvNilai = "E";
        } else {
            konvNilai = "Nilai tidak valid";
        }

        System.out.println("Nama: " + nama + "\nScore: " + konvNilai);
    }
}
