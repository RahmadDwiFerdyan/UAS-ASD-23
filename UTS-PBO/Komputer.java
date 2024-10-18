/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.pbo;

/**
 *
 * @author Rahmad Dwi Ferdyan
 */
public class Komputer {
    public String merk, jnsProsesor;
    public int kecProsesor, sizeMemory;

    public Komputer() {
    }
    
    public Komputer(String merk,int kecProsesor, int sizeMemory, String jnsProsesor) {
        this.merk = merk;
        this.kecProsesor = kecProsesor;
        this.sizeMemory = sizeMemory;
        this.jnsProsesor = jnsProsesor;
    }
    
    public void tampilData(){
        System.out.println("Data Komputer");
        System.out.println("Merk                : " + this.merk);
        System.out.println("Jenis Prosesor      : " + this.jnsProsesor);
        System.out.println("Kecepatan Prosesor  : " + this.kecProsesor);
        System.out.println("Ukuran Memori       : " + this.sizeMemory);
    }
    
    
    
}
