

public class Main {

    public static void main(String[] args) {

        BankApplication bankApplication = new BankApplication();
        bankApplication.processCheck("accountId000", 50, "USD");
        System.out.println("===============================");
        bankApplication.processCheck("accountId003", 250, "HRV");
        System.out.println("===============================");
        bankApplication.processCheck("accountId001", 50, "EUR");
        System.out.println("===============================");
        bankApplication.processCheck("accountId001", 850, "USD");
        System.out.println("===============================");
        bankApplication.processCheck("accountId001", 50, "USD");

    }
}
