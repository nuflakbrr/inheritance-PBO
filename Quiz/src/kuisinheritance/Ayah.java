/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuisinheritance;

/**
 *
 * @author ASUS
 */
public class Ayah {
public final String nama,kelamin,bagian;
public int no,gaji;
public double gaji2;

Ayah(String name,String gender,String sebagai,int gaji,int nomor){
this.nama=name;
this.kelamin=gender;
this.bagian=sebagai;
this.gaji=gaji;
this.no=nomor;
}
Ayah(String name,String gender,String sebagai,double gaji2,int nomer){
this.nama=name;
this.kelamin=gender;
this.bagian=sebagai;
this.gaji2=gaji2;
this.no=nomer;
}
public void PrintData(){
    System.out.println("berikut identitas pegawai : ");
    System.out.println("nama : "+ nama);
    System.out.println("jenis kelamin : "+ kelamin);
    System.out.println("nomor pegawai :"+ no);
    System.out.println("bekerja di bagian "+ bagian);
    System.out.println("gaji utama yang didapat : "+ gaji);
    System.out.println("gaji yang didapat jika bekerja secara baik menjadi : "+ gaji*2);
} 
}
