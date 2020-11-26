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
public class ratarata {
    int jumlahMahasiswa;
    double[] nilaiMahasiwa;
    public double[] inisiateArray(int jumlahMahasiswa){
        return nilaiMahasiwa = new double[jumlahMahasiswa];
    }
    public double hitungJumlahNilai(double jumlahMahasiswa){
        double jumlahNilai=0;
        for(var i=0;i<jumlahMahasiswa;i++){
            jumlahNilai = nilaiMahasiwa[i]+jumlahNilai;
        }
        return jumlahNilai;
    }
    public void hitungRatarata(double jumlahMahasiswa){
        double jumlahNilai = hitungJumlahNilai(jumlahMahasiswa);
        double ratarata= jumlahNilai/jumlahMahasiswa;
        System.out.println("Nilai Rata-Rata Adalah "+ratarata);
    }
}
