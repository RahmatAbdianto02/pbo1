package kendaraan;

public class Mobil extends Kendaraan {
    private long harga;
    protected String namaClass = "mobil";

    public Mobil(long harga) {
        this.harga = harga;
    }

    protected void setHarga(String harga) {
        this.harga = Long.parseLong(harga);
    }

    protected long getHarga() {
        return harga;
    }

    protected String keterangan() {
        return (namaClass + ": ini adalah class " + namaClass);
    }

    public String keteranganKendaraan() {
        return super.keterangan();
    }

    protected void hapus() {
        harga = 0;
        super.hapus();
    }
}
