public class Customer extends User{
    Customer(String userId, String name, String email) {
        super(userId, name, email);
    }
    public void placeOrder(String productId,double amount){
        System.out.println("Placing order for product: " + productId);
        System.out.println("Order amount: $" + amount);
        System.out.println("Customer ID: " + userId);
    }
}
