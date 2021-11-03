package laundry;


public class Laundry {
    public static void main(String[] args) {
        Client client = new Client();
        Petugas petugas = new Petugas();
        JenisLaundry jenisLaundry = new JenisLaundry();
        Transaksi transaksi = new Transaksi();
        struk Struk = new struk();
        Struk.laporan(jenisLaundry);
        Struk.laporan(client);
        transaksi.prosesTransaksi(client, transaksi,jenisLaundry);
        Struk.laporan(transaksi, jenisLaundry);
        Struk.laporan(jenisLaundry);
        Struk.laporan(client);
    }
}
