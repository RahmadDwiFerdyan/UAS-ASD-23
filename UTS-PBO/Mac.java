/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.pbo;

/**
 *
 * @author Rahmad Dwi Ferdyan
 */
public class Mac extends Laptop{
    public String security;
    
    public Mac(){
    
    }

    public Mac(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai, String security) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBaterai);
        this.security = security;
    }
    
    public void tampilMac(){
        System.out.println("Data Mac");
        System.out.println("Merk                : " + this.merk);
        System.out.println("Jenis Prosesor      : " + this.jnsProsesor);
        System.out.println("Kecepatan Prosesor  : " + this.kecProsesor + " GHz");
        System.out.println("Ukuran Memori       : " + this.sizeMemory + " GB");
        System.out.println("> Jenis Baterai     : " + this.jnsBaterai);
        System.out.println(">> Security         : " + this.security);
    }
}
