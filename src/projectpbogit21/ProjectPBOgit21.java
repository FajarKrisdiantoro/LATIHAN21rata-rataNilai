/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
NAMA : FAJAR KRISDIANTORO
NIM  : 22205004
PRODI: TI REG SORE
*/
package projectpbogit21;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class ProjectPBOgit21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            
        System.out.print("Masukkan banyaknya mahasiswa: ");
        int banyakMahasiswa = input.nextInt();

        int totalNilai = 0;
        for (int i = 1; i <= banyakMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            int nilaiMahasiswa = input.nextInt();
            totalNilai += nilaiMahasiswa;
        }

        double rataRata = (double) totalNilai / banyakMahasiswa;

        System.out.println("Banyaknya mahasiswa: " + banyakMahasiswa);
        System.out.println("Total nilai mahasiswa: " + totalNilai);
        System.out.println("Rata-rata nilai mahasiswa: " + rataRata);

        input.close();
    }
    
}
