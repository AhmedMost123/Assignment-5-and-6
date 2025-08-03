public class PaypalPayment implements Payment {
    private String email;
    private double amount;
    public PaypalPayment(String email){
        this.email=email;
    }
    @Override
    public void processPayment(double amount) {
    if(validateCard(email)){
        System.out.println("Processing paypal payment of $"+amount+" for "+email);
        this.amount+=amount;
    }else{
        System.out.println("Account validation failed");
    }
    }

    @Override
    public boolean validateCard(String cardNumber) {
        return false;
    }
}
