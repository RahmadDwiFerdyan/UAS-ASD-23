/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uts.pbo;

/**
 *
 * @author Rahmad Dwi Ferdyan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Mac mac = new Mac("Apple", 3, 32, "Apple M2", "Li-Ion", "Touch ID");
       Windows wd = new Windows("Lenovo", 3, 16, "Intel Core i7", 17, "4K Camera");
       Pc pc = new Pc("Lenovo", 3, 16, "Intel Core i7", 17);
       
       mac.tampilMac();
       System.out.println("");
       wd.tampilWindows();
       System.out.println("");
       pc.tampilPc();
       
    }
    
}
