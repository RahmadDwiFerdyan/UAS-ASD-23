/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.pbo;

/**
 *
 * @author Rahmad Dwi Ferdyan
 */
public class Pc extends Komputer{
    public int ukuranMonitor;

    public Pc() {
        
    }

    public Pc(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.ukuranMonitor = ukuranMonitor;
    }
    
    public void tampilPc(){
        System.out.println("Data PC");
        System.out.println("Merk                : " + this.merk);
        System.out.println("Jenis Prosesor      : " + this.jnsProsesor);
        System.out.println("Kecepatan Prosesor  : " + this.kecProsesor + " GHz");
        System.out.println("Ukuran Memori       : " + this.sizeMemory + " GB");
        System.out.println("> Ukuran Monitor    : " + this.ukuranMonitor + " inch");
    }
    
}
