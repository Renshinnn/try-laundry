package laundry;

import java.util.ArrayList;

public class Client implements user {
    private ArrayList<String> namaClient = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();

    public Client(){
        this.namaClient.add("Budi");
        this.alamat.add("Jl. Pemuda, No. 30, Kepanjen, Kab. Malang");
        this.telepon.add("081243256754");
        this.saldo.add(50000);

        this.namaClient.add("Amet");
        this.alamat.add("Jl. Pemuda, No. 31, Kepanjen, Kab. Malang");
        this.telepon.add("081243256753");
        this.saldo.add(80000);

        this.namaClient.add("Rima");
        this.alamat.add("Jl. Pemuda, No. 34, Kepanjen, Kab. Malang");
        this.telepon.add("081243256759");
        this.saldo.add(90000);
    }
    public void setSaldo(int saldo){ this.saldo.add(saldo);}
    public int getSaldo(int idClient){
        return this.saldo.get(idClient);
    }
    public void editSaldo(int idClient, int saldo){
        this.saldo.set(idClient, saldo);
    }
    public int getJmlClient(){
        return this.saldo.size();
    }

    @Override
    public void setNama(String namaClient){
        this.namaClient.add(namaClient);
    }
    @Override
    public void setAlamat(String alamat){
        this.alamat.add(alamat);
    }
    @Override
    public void setTelepon(String telepon){
        this.telepon.add(telepon);
    }
    @Override
    public String getNama(int idClient){
        return this.namaClient.get(idClient);
    }
    @Override
    public String getAlamat(int idClient){
        return this.alamat.get(idClient);
    }
    @Override
    public String getTelepon(int idClient) {
        return this.telepon.get(idClient);
    }
}
