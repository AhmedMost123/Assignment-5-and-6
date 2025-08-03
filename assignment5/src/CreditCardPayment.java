public class CreditCardPayment implements Payment {

    private String cardNumber;
    private String cardHolder;
    private double amount;

    public CreditCardPayment(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void processPayment(double amount) {
    if(validateCard(cardNumber)){
        System.out.println("Processing card payment of $"+amount+" for "+cardHolder);
        this.amount+=amount;

    }else{
        System.out.println("Card validation failed");
    }

    }

    @Override
    public boolean validateCard(String cardNumber) {
        return cardNumber!=null&&cardNumber.length()==16;
    }
}
