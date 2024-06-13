import java.util.Scanner;

public class rentalMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int pilihan;

        LinkedListTransaksi ll = new LinkedListTransaksi();

        rental[] barangRental = {
            new rental("S 4567 YV", "Honda Beat", "Motor", 2017, 10000),
            new rental("N 4511 VS", "Honda Vario", "Motor", 2018, 10000),
            new rental("N 1453 AA", "Toyota Yaris", "Mobil", 2022, 30000),
            new rental("AB 4321 A", "Toyota Innova", "Mobil", 2019, 60000),
            new rental("B 1234 AG", "Toyota Yaris", "Mobil", 2021, 25000),
        };

        do{
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan Daftar Kendaraan");
            System.out.println("2. Menu Peminjaman");
            System.out.println("3. Tampilkan Seluruh Transaksi");
            System.out.println("4. Urutkan Transaksi Berdasarkan No TNKB");
            System.out.println("5. Keluar");
            System.out.print("MAsukkan pilihan: ");
            pilihan = sc.nextInt();
            
            switch (pilihan) {
                case 1:
                    System.out.println("\n++++++++++++++++++++++++++++++++++++++");
                    System.out.println("Daftar Kendaraan Rental Serba Serbi:");
                    System.out.println("++++++++++++++++++++++++++++++++++++++");
                  
                    case 2:
                    System.out.print("\nNama Peminjam: ");
                    String namaPeminjam = sc.nextLine();
                    System.out.println("Pilih Kendaraan (masukkan nomor index): ");
                    for (int i = 0; i < rental.length; i++) {
                        System.out.println(i + ". " + rental[i]);
                    }
                    int kendaraanIndex = sc.nextInt();
                    System.out.print("Lama Pinjam (hari): ");
                    int lamaPinjam = sc.nextInt();
                    sc.nextLine(); 

                    transaksi transaksi = new transaksi(namaPeminjam, lamaPinjam, rental[kendaraanIndex]);
                    ll.addTransaksi(transaksi);
                    System.out.println("Transaksi berhasil ditambahkan.");
                    break;
                case 3:
                    System.out.println("\nSeluruh Transaksi:");
                    ll.tampilTransaksi();
                    break;
                case 4:
                    System.out.println("\nMengurutkan transaksi berdasarkan No TNKB");
                    ll.sortTransaksiByNoTNKB();
                    System.out.println("Transaksi berhasil diurutkan.");
                    break;
                case 5:
                    System.out.println("Keluar.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            } while(pilihan != -1);

        }
    }
}
