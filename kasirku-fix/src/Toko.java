import java.util.ArrayList;
import java.util.Scanner;

public class Toko implements SimpanBarang {
    Scanner in = new Scanner(System.in);

    protected ArrayList<String> dftrKodeBarang = new ArrayList<String>();
    protected ArrayList<String> dftrNamaBarang = new ArrayList<String>();
    protected ArrayList<Integer> dftrHargaBarang = new ArrayList<Integer>();


    protected String kodeBarang;
    protected String namaBarang;
    protected int hargaBarang;
    protected int jmlBarang;

    Toko (){
        simpanDataBarang();
    }
    public void hapusBarang(String id){
        int index = dftrKodeBarang.indexOf(id);
        dftrKodeBarang.remove(index);
        dftrNamaBarang.remove(index);
        dftrHargaBarang.remove(index);
        /**
        dftrHargaBarang.set(index,null);
        dftrNamaBarang.set(index,null);
        dftrKodeBarang.set(index,null);
        **/

    }
    public void simpanDataBarang(){
        this.tambahDataBarang("1R","Bebek Goreng",10000);
        this.tambahDataBarang("1A","Ayam Goreng",8000);
        this.tambahDataBarang("1B","Ayam Kecap",11000);
        this.tambahDataBarang("1C","Ayam Krispi",12000);
        this.tambahDataBarang("1P","Soto Ayam",12000);
        this.tambahDataBarang("1L","Rawon",16000);
    }
    public boolean cekBarang(){
        boolean isAvailable = false;
        for (String i : getDftrKodeBarang())
            if (i.equals(getKodeBarang())) {
                isAvailable = true;
            }
        return isAvailable;
    }

    public void tambahDataBarang(String kode, String nama, int harga){
        dftrKodeBarang.add(kode);
        dftrNamaBarang.add(nama);
        dftrHargaBarang.add(harga);
    }

    public ArrayList<String> getDftrKodeBarang(){
        return dftrKodeBarang;
    }

    public ArrayList<String> getDftrNamaBarang(){
        return dftrNamaBarang;
    }

    public ArrayList<Integer> getDftrHargaBarang(){
        return dftrHargaBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public int getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(int hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }
    public int getJmlBarang() {
        return jmlBarang;
    }

    public void setJmlBarang(int jmlBarang) {
        this.jmlBarang = jmlBarang;
    }
    @Override
    public void tambahNamaBarang(String x){
        dftrNamaBarang.add(x);
    }

    @Override
    public void tambahHargaBarang(int x){
        dftrHargaBarang.add(x);
    }

    @Override
    public void tambahKodeBarang(String x){
        dftrKodeBarang.add(x);
    }
}
