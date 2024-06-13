import java.util.LinkedList;

public class LinkedListTransaksi {
    private LinkedList<TransaksiRental> transaksiList;


    public LinkedListTransaksi() {
        this.transaksiList = new LinkedList<>();
    }

 
    public void tambahTransaksi(String namaPeminjam, int lamaPinjam, BarangRental barangRental) {
        TransaksiRental transaksiBaru = new TransaksiRental(namaPeminjam, lamaPinjam, barangRental);
        transaksiList.add(transaksiBaru);
    }

    
   
    public TransaksiRental cariTransaksi(int kodeTransaksi) {
        for (TransaksiRental transaksi : transaksiList) {
            if (transaksi.getKodeTransaksi() == kodeTransaksi) {
                return transaksi;
            }
        }
        return null; 
    }

    public void hapusTransaksi(int kodeTransaksi) {
        TransaksiRental transaksi = cariTransaksi(kodeTransaksi);
        if (transaksi != null) {
            transaksiList.remove(transaksi);
            System.out.println("Transaksi dengan kode " + kodeTransaksi + " berhasil dihapus.");
        } else {
            System.out.println("Transaksi dengan kode " + kodeTransaksi + " tidak ditemukan.");
        }
    }
}
