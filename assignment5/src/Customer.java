public class Customer extends User{
    int cartQuantity;
    double creditCardMoney;
    public Customer(String name, int age, int phoneNumber, int cartQuantity, double creditCardMoney) {
        super(name, age, phoneNumber); // Calls User constructor
        this.cartQuantity = cartQuantity;
        this.creditCardMoney = creditCardMoney;
    }
    public void getUserDetails(){
        System.out.println("Customer Name: "+name);
        System.out.println("Customer Age: "+age);
        System.out.println("Customer Amount of Money: "+creditCardMoney);
        System.out.println("Customer Amount of Money: "+cartQuantity);
    }
    public void placeOrder(String productId) {
        System.out.println("Placing order for product: " + productId);
    }

    public void placeOrder(String productId, int quantity) {
        System.out.println("Placing order for product: " + productId + ", Quantity: " + quantity);
    }
}
