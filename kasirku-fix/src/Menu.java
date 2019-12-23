import java.util.Scanner;

public class Menu extends Toko { //pewarisan
    Scanner in = new Scanner(System.in);
    Kasir kasir = new Kasir();

    public void printMenu(){
        System.out.println("Pilih Menu:");
        System.out.println("1 - Kasir");
        System.out.println("2 - Kelola Menu");
        System.out.println("3 - Keluar");
        System.out.print(">.");
    }

    public void tampilDaftarBarang(){
        System.out.println("=======Daftar Barang======");
        System.out.println("KODE BARANG         NAMA BARANG        HARGA");
        for (int i=0; i<dftrKodeBarang.size(); i++){
            System.out.println(dftrKodeBarang.get(i)+"                 "+dftrNamaBarang.get(i)+"       "+dftrHargaBarang.get(i));
        }
    }
    public void pilihMenu(){
        printMenu();
        String pilihan = in.next();

        if (pilihan.equals("1")){
            tampilDaftarBarang();
            kasir.inputKasir();
        } else if (pilihan.equals("2")){
            tampilDaftarBarang();
            System.out.println("Input Kode Barang yg ingin dihapus:");
            String hapus = in.next();
            hapusBarang(hapus);

            pilihMenu();
        } else if (pilihan.equals("3")){
            System.exit(0);
            /**
            toko.printMenuTambahBarang();
            tampilDaftarBarang();
            kasir.inputKasir();
             **/
        } else {
            System.out.println("Pilihan Menu Tidak Tersedia!");
        }
    }
}
