public class Product {
    private String productId;
    private String name;
    private double  price;
    private int stock;

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setStock(int stock) {
        if(stock>=0){
            this.stock=stock;
        }else{
            System.out.println("This stock value is invalid");
        }
    }
    public  void setPrice(double price){
        if(price>=0){
            this.price=price;
        }else{
            System.out.println("This price value is invalid");
        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductId() {
        return productId;
    }

    public int getStock() {
        return stock;
    }

    public String getName() {
        return name;
    }
}
