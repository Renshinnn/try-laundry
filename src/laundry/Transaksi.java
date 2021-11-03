package laundry;
import java.util.Scanner;
import java.util.ArrayList;

public class Transaksi {
    private ArrayList<Integer> idJenisLaundry = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    private ArrayList<Integer> idClient = new ArrayList<Integer>();
    public Transaksi() {
        this.idJenisLaundry.add(0);
        this.banyak.add(2);
        this.idClient.add(0);

        this.idJenisLaundry.add(1);
        this.banyak.add(3);
        this.idClient.add(1);

        this.idJenisLaundry.add(0);
        this.banyak.add(1);
        this.idClient.add(1);

        this.idJenisLaundry.add(2);
        this.banyak.add(2);
        this.idClient.add(1);
    }
    public void prosesTransaksi(Client client, Transaksi transaksi, JenisLaundry
            jenisLaundry){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Silahkan belanja");

        System.out.println("Masukkan ID Member");
        int idClient = myObj.nextInt();
        System.out.println("Selamat datang "+client.getNama(idClient));
        ArrayList<Integer> idJenisLaundry = new ArrayList<Integer>();
        ArrayList<Integer> banyak = new ArrayList<Integer>();
        int i=0;
        int temp=0;
        do{
            System.out.println("Masukkan kode barang :");
            temp=myObj.nextInt();
            if (temp!=99){
                idJenisLaundry.add(temp);
                System.out.print(jenisLaundry.getJenisLaundry(idJenisLaundry.get(i))+ " sebanyak : ");
                banyak.add(myObj.nextInt());
                i++;
            }
        }while (temp!=99);
        System.out.println("Transaksi laundry "+ client.getNama(idClient)+" sebagai berikut");
                System.out.println("Jenis laundry \tQty \tHarga \tJumlah \t");
        int total=0;
        int x = idJenisLaundry.size();
        for (int j = 0; j < x; j++){
            int jumlah=banyak.get(j) * jenisLaundry.getHarga(idJenisLaundry.get(j));
            total+=jumlah;
            System.out.println(jenisLaundry.getJenisLaundry(idJenisLaundry.get(j))+"\t"+
                    idJenisLaundry.get(j)+"\t"+ jenisLaundry.getHarga(idJenisLaundry.get(j))+"\t"+
                    jumlah);

            transaksi.setTransaksi(jenisLaundry, idClient, idJenisLaundry.get(j),
                    banyak.get(j));
        }
        System.out.println("Total Belanja : "+total);
        client.editSaldo(idClient, client.getSaldo(idClient)-total);
    }
    public void setTransaksi(JenisLaundry barang, int idMember, int idBarang, int banyaknya){
        this.idClient.add(idMember);
        this.idJenisLaundry.add(idBarang);
        this.banyak.add(banyaknya);
    }
    public int getIdBarang(int id){
        return this.idJenisLaundry.get(id);
    }
    public int getBanyaknya(int id){
        return this.banyak.get(id);
    }
    public int getIdMember(int id){
        return this.idClient.get(id);
    }

    public int getJmlTransaksi(){
        return this.idClient.size();
    }
}