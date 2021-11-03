package laundry;

import java.util.ArrayList;

public class Petugas implements user {
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();

    public Petugas() {
        this.namaPetugas.add("Baba");
        this.alamat.add("Jl. Pattimura, No. 45, Klojen, Kota Malang");
        this.telepon.add("084354769821");
        this.jabatan.add(0);
    }

    public void setJabatan(int jabatan){
        this.jabatan.add(jabatan);
    }
    public int getJabatan(int id){
        return this.jabatan.get(id);
    }
    public int getJmlKaryawan(){
        return this.namaPetugas.size();
    }

    @Override
    public void setNama(String namaPetugas){
        this.namaPetugas.add(namaPetugas);
    }
    @Override
    public void setAlamat(String alamat){
        this.namaPetugas.add(alamat);
    }
    @Override
    public void setTelepon(String telepon){
        this.namaPetugas.add(telepon);
    }
    @Override
    public String getNama(int idPetugas){
        return this.namaPetugas.get(idPetugas);
    }
    @Override
    public String getAlamat(int idPetugas) {
        return this.namaPetugas.get(idPetugas);
    }
    @Override
    public String getTelepon(int idPetugas) {
        return this.namaPetugas.get(idPetugas);
    }

}
