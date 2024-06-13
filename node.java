class node {
    transaksi data;
    node next;
    public String noTNKB;
    public String namaKendaraan;
    public String jenisKendaraan;
    public int tahun;
    public int biayaSewa;

    public node(String noTNKB, String namaKendaraan, String jenisKendaString, int tahun, int biayaSewa) {
        this.data = data;
        this.noTNKB = noTNKB;
        this.namaKendaraan = namaKendaraan;
        this.jenisKendaraan = jenisKendaraan;
        this.tahun = tahun;
        this.biayaSewa = biayaSewa;
        this.next = null;
    }
}
