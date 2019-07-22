package computers;

public class Laptop extends Computer{

    public Laptop(double price) {
        super(price);
    }
    
    public Laptop(double price, String brand){
        super(brand, price);
    }

    @Override
    protected void setPrice(double price) {
        super.price = price;
        
    }
    
    
    
    
}
