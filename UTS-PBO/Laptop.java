/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.pbo;

/**
 *
 * @author Rahmad Dwi Ferdyan
 */
public class Laptop extends Komputer {
    public String jnsBaterai;

    public Laptop() {
    }

    public Laptop(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBaterai = jnsBaterai;
    }
    
    public void tampilLaptop(){
        System.out.println("Data Laptop");
        System.out.println("Merk                : " + this.merk);
        System.out.println("Jenis Prosesor      : " + this.jnsProsesor);
        System.out.println("Kecepatan Prosesor  : " + this.kecProsesor);
        System.out.println("Ukuran Memori       : " + this.sizeMemory);
        System.out.println("> Jenis Baterai     : " + this.jnsBaterai);
    }
    
    
    
}
