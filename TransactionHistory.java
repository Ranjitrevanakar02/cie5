public class TransactionHistory {
    private String senderName;
    private String receiverName;
    private String transactionId;
    private String accountStatus;
    private long transactionDate;

    public TransactionHistory(String senderName, String receiverName, String transactionId, String accountStatus,
            long transactionDate) {
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.transactionId = transactionId;
        this.accountStatus = accountStatus;
        this.transactionDate = transactionDate;

        System.out.println("Sender Name: " + this.senderName);
        System.out.println("Receiver Name: " + this.receiverName);
        System.out.println("Transaction ID: " + this.transactionId);
        System.out.println("Account Status: " + this.accountStatus);
        System.out.println("Transaction Date: " + this.transactionDate);
    }

    public static void main(String[] args) {
        long date = System.currentTimeMillis();
        TransactionHistory transaction = new TransactionHistory("John Doe", "Jane Smith", "TXN12345", "Successful",
                date);
    }
}
