package computers;

public class Tablet extends Computer{

    public Tablet(double price) {
        super(price);
    }
    
    public Tablet(double price, String brand){
        super(brand, price);
    }

    @Override
    protected void setPrice(double price) {
        super.price = price;
    }
    
}
