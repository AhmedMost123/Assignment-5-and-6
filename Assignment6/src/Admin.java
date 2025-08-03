public class Admin extends User{
    Admin(String userId, String name, String email) {
        super(userId, name, email);
    }
    public void updateProduct(String productId,int amount){
        System.out.println("Admin " + name + " is updating product: " + productId);
        System.out.println("New stock/quantity amount: " + amount);
        System.out.println("Update performed by Admin ID: " + userId);
        System.out.println("Product " + productId + " updated successfully.");
    }
}
