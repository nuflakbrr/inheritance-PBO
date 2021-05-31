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
public class Karyawan1 extends KaryawanData {
    public void setNamaKaryawan(String nama) {
        super.nama = nama;
    }
    
    public void setGender(String gender) {
        super.gender = gender;
    }
    
    public void cetak () {
        super.ID();
    }
    
    public void tampil () {
        System.out.println("Bekerja dibagian : ");
    }
}
