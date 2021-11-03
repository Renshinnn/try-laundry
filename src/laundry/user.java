package laundry;

public interface user {
    public void setNama(String nama);
    public void setAlamat(String alamat);
    public void setTelepon(String telepon);

    public String getNama(int idClient) ;
    public String getAlamat(int id);
    public String getTelepon(int id);
}
