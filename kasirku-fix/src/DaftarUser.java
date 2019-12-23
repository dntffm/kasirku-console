import java.util.ArrayList;

public class DaftarUser implements SimpanDataUser {
    private ArrayList<String> daftarUser = new ArrayList<String >();
    private ArrayList<String> daftarPassword = new ArrayList<String >();

    DaftarUser(){
        simpanDataUserDanPassword();
    }

    public void simpanDataUserDanPassword(){
        tambahUser("admin");
        tambahPassword("123");

        tambahUser("denta");
        tambahPassword("456");

    }

    public ArrayList<String> ambilDaftarUser(){
        return daftarUser;
    }

    public ArrayList<String> ambilDaftarPassword(){
        return daftarPassword;
    }
    public void tambahUser(String x){
        daftarUser.add(x);
    }

    public void tambahPassword(String x){
        daftarPassword.add(x);
    }


}
