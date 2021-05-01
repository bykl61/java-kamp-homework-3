public class UserManager {

    public void register(User user){
        System.out.println(user.getUsername()+" kayıt yaptı");
    }

    public void login(User user){
        System.out.println(user.getUsername()+" giriş yaptı");
    }

    public void logout(User user){
        System.out.println(user.getUsername()+" çıkış yaptı");
    }

}
