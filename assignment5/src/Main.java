//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Customer Ali=new Customer("Ali",20,010,4,1000);
        Admin Ahmed=new Admin("Ahmed",21,011,50,100,"23124gsd");
        Ali.placeOrder("123gb");
        Ali.placeOrder("1234567",4);
        Ali.getUserDetails();
        Ahmed.getUserDetails();
        Payment payment1=new CreditCardPayment("1234567891245678","Ali");
        Payment payment2=new PaypalPayment("Ahmed@gmial.com");


        payment1.processPayment(500.0);
        payment2.processPayment(999);
        ///Bad payments
        Payment badPayment1 = new CreditCardPayment("123", "Invalid");
        Payment badPayment2 = new PaypalPayment("AhmedGmail");

        badPayment1.processPayment(200);
        badPayment2.processPayment(60);
    }
    }
