public class YourFirstBankTransfer {

    public static void main(String[] args) {
        Account matthewAccount = new Account("Matthews account", 1000);
        Account myAccount = new Account("My account", 0);

        matthewAccount.withdrawal(100);
        myAccount.deposit(100);

        System.out.println(matthewAccount);
        System.out.println(myAccount);
    }
}
