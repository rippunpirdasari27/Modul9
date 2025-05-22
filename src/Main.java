class PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Memproses pembayaran sebesar: " + amount);
    }

    public void processPayment(double amount, String currency) {
        System.out.println("Memproses pembayaran sebesar: " + amount + " dalam mata uang: " + currency);
    }
}

class CreditCard extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Pembayaran via CreditCard sebesar: " + amount);
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("Pembayaran via CreditCard sebesar: " + amount + " " + currency);
    }
}

class EWallet extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Pembayaran via EWallet sebesar: " + amount);
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("Pembayaran via EWallet sebesar: " + amount + " " + currency);
    }
}

class BankTransfer extends PaymentMethod {
    @Override
    public void processPayment(double amount) {
        System.out.println("Pembayaran via BankTransfer sebesar: " + amount);
    }

    @Override
    public void processPayment(double amount, String currency) {
        System.out.println("Pembayaran via BankTransfer sebesar: " + amount + " " + currency);
    }
}

public class Main {
    public static void main(String[] args) {
        PaymentMethod[] payments = {
            new CreditCard(),
            new EWallet(),
            new BankTransfer()
        };

        for (PaymentMethod payment : payments) {
            payment.processPayment(250000);                  
            payment.processPayment(250000, "RUPIAH");           
        }
    }
}
