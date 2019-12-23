import sun.security.util.Pem;

import java.util.ArrayList;
import java.util.Scanner;

public class Kasir extends Toko {
    protected int total = 0;
    protected int Kembalian;

    public int getKembalian() {
        return Kembalian;
    }

    public void setKembalian(int kembalian) {
        Kembalian = kembalian;
    }

    ArrayList<String> dftrBelanja = new ArrayList<String>();
    ArrayList<Integer> qtyBelanja = new ArrayList<Integer>();

    public void inputKasir(){
        inputPenjualan();
        if (cekBarang()){
            dftrBelanja.add(getKodeBarang());
            inputJumlahBelanja();
            hitungHargaSatuan();
            total+=hitungHargaSatuan();
            Konfirmasi();
        } else {
            System.out.println("Barang Tidak Ada");
            inputKasir();
        }
    }
    public void inputPenjualan(){
        Menu menu = new Menu();
        Scanner in = new Scanner(System.in);

        System.out.println("=+=+=+Penjualan=+=+=+");

        System.out.print("Kode Barang: ");
        String kdBrg = in.nextLine();
        setKodeBarang(kdBrg);

    }
    public void inputJumlahBelanja(){
        System.out.print("Jumlah Barang: ");
        int jmlBrg = in.nextInt();

        if (jmlBrg > 0){
            qtyBelanja.add(jmlBrg);
            setJmlBarang(jmlBrg);
        } else {
            System.out.println("Jumlah Barang Harus Lebih dari 0");
            inputKasir();
        }

    }

    public void Konfirmasi(){
        System.out.print("Tambah Barang?: y/t : ");
        String lagi = in.next();

        if (lagi.equals("y")){
            inputKasir();
        } else if (lagi.equals("t")){

            cetakStruk();
            Pembayaran();
        } else{
            System.out.println("Cmd salah");
        }
    }

    public int hitungHargaSatuan(){
        int jmlBayar;
        int index = 0;
        if (cekBarang()){
            for (int i=0; i<getDftrKodeBarang().size(); i++){
                if (getDftrKodeBarang().get(i).equals(getKodeBarang())){
                    index = i;
                }
            }
            jmlBayar = getDftrHargaBarang().get(index) * getJmlBarang();

        }
        else {
            jmlBayar = 0;
        }

        return jmlBayar;
    }

    public void Pembayaran(){
        System.out.println("======Pembayaran=======");
        System.out.print("Membayar: ");
        int membayar = in.nextInt();
        if (membayar < total){
            System.out.print("Nominal Kurang");
        } else{
            System.out.println("Kembalian: "+(membayar - total));
            setKembalian(membayar-total);
        }

    }

    public void cetakStruk(){
        System.out.println("====STRUK BELANJA====");
        System.out.println("NAMA BARANG           JUMLAH           HARGA");
        for (int i=0; i<dftrBelanja.size(); i++){
            int index = getDftrKodeBarang().indexOf(dftrBelanja.get(i));
            System.out.println(dftrNamaBarang.get(index)+"               "+qtyBelanja.get(i)+"             "+(dftrHargaBarang.get(index)*qtyBelanja.get(i)));
        }
        System.out.println("============================================");
        System.out.println("Total                                          "+total);


    }




}
