/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package posttestinheritance;

/**
 *
 * @author ASUS
 */
public class Admin extends Karyawan1 {
    int nomorpegawai;
    
    public void setNomor(int nomorpegawai) {
        this.nomorpegawai = nomorpegawai;
    }
    
    public int getNomor () {
        return nomorpegawai;
    }
    
    public void cetak () {
        System.out.println("Nama Pegawai : "+getNomor ());
    }
    
    public void Gaji (int uang, int bonus, int jam) {
        int total = uang*bonus*jam;
        System.out.println("Gaji yang diperoleh : "+total);
    }
    
    public void Gaji (int uang, int bonus, int jam, int lembur) {
        int total = uang*bonus*jam*lembur;
        System.out.println("Gaji yang diperoleh bila lembur : "+total);
    }
}
