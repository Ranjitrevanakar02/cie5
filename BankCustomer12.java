public class BankCustomer {
    private String name;
    private String accountNumber;
    private int age;

    public BankCustomer(String name, String accountNumber, int age) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.age = age;
        System.out.println("Customer Name: " + this.name);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Customer Age: " + this.age);
    }

    public static void main(String[] args) {
        BankCustomer customer1 = new BankCustomer("John Doe", "123456789", 30);
    }
}
