/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.pbo;

/**
 *
 * @author Rahmad Dwi Ferdyan
 */
public class Windows extends Pc{
    public String fitur;

    public Windows() {
    }

    public Windows(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, int ukuranMonitor, String fitur) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, ukuranMonitor);
        this.fitur = fitur;
    }
    
    public void tampilWindows(){
        System.out.println("Data Windows");
        System.out.println("Merk                : " + this.merk);
        System.out.println("Jenis Prosesor      : " + this.jnsProsesor);
        System.out.println("Kecepatan Prosesor  : " + this.kecProsesor + " GHz");
        System.out.println("Ukuran Memori       : " + this.sizeMemory + " GB");
        System.out.println("> Ukuran Monitor    : " + this.ukuranMonitor + " inch");
        System.out.println(">> Fitur            : " + this.fitur);
    }
    
    
}
