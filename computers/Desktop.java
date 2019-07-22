package computers;

public class Desktop extends Computer{

    public Desktop(double price) {
        super(price);
    }
    
    public Desktop(double price, String brand){
        super(brand, price);
    }

    @Override
    protected void setPrice(double price) {
        super.price = price;
    }
    
}
