package laundry;

import java.util.ArrayList;

public class JenisLaundry {
    private ArrayList<String> jenisLaundry = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();

    public JenisLaundry(){
        System.out.println("-----Jenis Laundry-----");
        this.jenisLaundry.add("Laundry Cepat");
        this.harga.add(8000);
        this.jenisLaundry.add("Laundry X-Tra Cepat");
        this.harga.add(9000);
        this.jenisLaundry.add("Laundry Super X-Tra Cepat");
        this.harga.add(10000);

    }
    public int getJmlLaundry(){
        return this.jenisLaundry.size();
    }
    public void setJenisLaundry(String jenisLaundry ){
        this.jenisLaundry.add(jenisLaundry);
    }
    public String getJenisLaundry(int idJenis){

        return this.jenisLaundry.get(idJenis);
    }
    public void setHarga(int harga ){
        this.harga.add(harga);
    }
    public int getHarga(int idBarang){
        return this.harga.get(idBarang);
    }

}
