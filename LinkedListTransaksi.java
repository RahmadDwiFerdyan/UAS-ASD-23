class LinkedListTransaksi {
    node head;

    public LinkedListTransaksi() {
        head = null;
    }

    public void addTransaksi(transaksi transaksi) {
        node newnode = new node(transaksi);
        if (head == null) {
            head = newnode;
        } else {
            node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newnode;
        }
    }

    public void tampilTransaksi() {
        node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void sortTransaksiByNoTNKB() {
        if (head == null || head.next == null) {
            return;
        }

        boolean tukar;
        
        do {
            tukar = false;
            node current = head;
            node previous = null;
            while (current.next != null) {
                
            }
        } while (tukar);
    }
}
