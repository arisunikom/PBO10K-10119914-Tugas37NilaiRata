/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas37;

/**
 *
 * @author dropsuite
 */
public class Main {
    public static void main(String[] args) {
        ratarata mahasiswa = new ratarata();
        mahasiswa.jumlahMahasiswa = 4;
        mahasiswa.inisiateArray(mahasiswa.jumlahMahasiswa);
        mahasiswa.nilaiMahasiwa[0] = 4;
        mahasiswa.nilaiMahasiwa[1] = 2;
        mahasiswa.nilaiMahasiwa[2] = 4;
        mahasiswa.nilaiMahasiwa[3] = 6;
        mahasiswa.hitungRatarata(mahasiswa.jumlahMahasiswa);
    }
}
