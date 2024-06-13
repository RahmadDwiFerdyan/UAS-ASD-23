class node {
    transaksi data;
    node next;
    public String noTNKB;
    public String namaKendaraan;
    public String jenisKendaraan;
    public String tahun;

    public node(transaksi data) {
        this.data = data;
        this.next = null;
    }
}
