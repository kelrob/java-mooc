public class YourFirstAccount {


    public static void main(String[] args) {
        Account robertAccount = new Account("Robert's account", 100.00);
        robertAccount.deposit(20.0);
        System.out.println(robertAccount.toString());
    }
}
