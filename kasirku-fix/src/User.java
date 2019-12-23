import java.util.Scanner;

public class User {
    protected String userName;
    protected String password;

    Scanner in = new Scanner(System.in);
    Menu menu = new Menu();
    DaftarUser dftrUser = new DaftarUser();

    User(){
        this.printLoginForm();
    }

    public void printLoginForm(){
        System.out.println("=========LOGIN=========");
        System.out.print("Username: ");
        String uname = in.nextLine();

        System.out.print("Password: ");
        String passwd = in.nextLine();

        this.login(uname,passwd);
    }

    public void login(String u,String p){
        for (int i = 0; i < dftrUser.ambilDaftarUser().size(); i++){
            String tempUname = dftrUser.ambilDaftarUser().get(i);
            String tempPassword = dftrUser.ambilDaftarPassword().get(i);
            if (u.equals(tempUname) && p.equals(tempPassword)){
                menu.pilihMenu();
                System.exit(0);
            } else{
                continue;
            }

        }

        System.out.println("Username Tidak Terdaftar");
        printLoginForm();
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
