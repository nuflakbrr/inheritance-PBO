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
public class TampilDataKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Karyawan1 Gerald = new Karyawan1();
        Admin Herman = new Admin();
        
        Gerald.setNamaKaryawan("Ryan");
        Gerald.setGender("Laki-laki");
        Gerald.cetak();
        Herman.setNomor(31);
        Herman.Gaji(500, 50, 8);
        Herman.Gaji(500, 100, 8, 3);
        
        System.out.println("");
        Karyawan2 halu = new Karyawan2();
        
        halu.setNamakaryawan("Popy");
        halu.setGender("Perempuan");
        halu.cetak();
        Herman.setNomor(33);
        Herman.Gaji(500, 50, 8);
        Herman.Gaji(500, 50, 8, 3);
    }
    
}
