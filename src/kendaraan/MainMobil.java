package kendaraan;
import javax.swing.JOptionPane;

public class MainMobil extends Mobil {

    public MainMobil(long harga) {
        super(harga);
    }

    public static void main(String[] args) {
        MainMobil ob = new MainMobil(100000000);
        String merk, warna, harga;

        // Menampilkan dialog box untuk meminta input merk mobil
        merk = JOptionPane.showInputDialog("Merk Mobil:");
        ob.setMerk(merk);

        // Menampilkan dialog box untuk menampilkan merk mobil
        ob.tampil("Merk Mobil: " + ob.getMerk());

        // Menampilkan dialog box untuk meminta input warna mobil
        warna = JOptionPane.showInputDialog("Warna Mobil:");
        ob.setWarna(warna);

        // Menampilkan dialog box untuk menampilkan warna mobil
        ob.tampil("Warna Mobil: " + ob.getWarna());

        // Menampilkan dialog box untuk meminta input harga mobil
        harga = JOptionPane.showInputDialog("Harga Mobil:");
        ob.setHarga(harga);

        // Menampilkan dialog box untuk menampilkan harga mobil
        ob.tampil("Harga Mobil: Rp. " + ob.getHarga() / 1000000);

        // Menghapus nilai harga mobil
        ob.hapus();

        // Menginisialisasi variabel menjadi null
        merk = null;
        warna = null;
        harga = null;
        ob = null;

        // Mengakhiri program
        System.exit(0);
    }
}
