public class Admin extends User{
    double money;
    int adminProducts;
    String productId;
    public Admin(String name,int age,int phoneNumber,double money,int adminProducts,String productId){
        super(name,age,phoneNumber);
        this.money=money;
        this.adminProducts=adminProducts;
        this.productId=productId;

    }
    public void getUserDetails(){
        System.out.println("Admin Name: "+name);
        System.out.println("Admin Age: "+age);
        System.out.println("Admin Amount of Money: "+money);
        System.out.println("Admin Amount of Money: "+adminProducts);
        System.out.println("Product ID: "+productId);
    }
}
