public class Main {

    public static void main(String [] args){
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setAccountName("Saketh");
        checkingAccount.setAccountNumber(100);
        checkingAccount.setBalance(1000000);
        checkingAccount.limit = 1000;

        System.out.println(checkingAccount.limit);

    }
}
