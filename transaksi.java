public class transaksi {
    int counter = 1;
    int kodeTransaksi;
    String namaPeminjam;
    int lamaPinjam;
    double totalBiaya;
    rental br;
    
    public transaksi(String namaPeminjam, int lamaPinjam, rental br) {
        this.kodeTransaksi = counter++;
        this.namaPeminjam = namaPeminjam;
        this.lamaPinjam = lamaPinjam;
        this.br = br;
        this.totalBiaya = lamaPinjam * br.biayaSewa;
}
}
    