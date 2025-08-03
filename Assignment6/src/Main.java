//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Customer customer=new Customer("1234","Ahmed","Ahmed@gmail");
        customer.placeOrder("A004",4);
        Admin admin = new Admin("A001", "Sara", "sara@admin.com");
        admin.updateProduct("P456", 100);
        }
    }
