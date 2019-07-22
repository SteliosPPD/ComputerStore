package computerstore;

import computers.Tablet;
import computers.Computer;
import computers.Desktop;
import computers.Laptop;
import java.util.ArrayList;
import java.util.List;

public class ComputerStore {

    public static void main(String[] args) {

        String sony = "Sony";
        String dell = "Dell";
        String samsung = "Samsung";
        String lenovo = "Lenovo";
        //These variables came from keyboard
        double getPriceFromInput = 12;
        String getBrandFromInput = "Asus";

        List<Computer> computers = new ArrayList();
        //First Laptop details are from input
        computers.add(new Laptop(getPriceFromInput, getBrandFromInput));
        computers.add(new Laptop(15, dell));
        computers.add(new Desktop(20, samsung));
        computers.add(new Desktop(40, sony));
        computers.add(new Tablet(5, lenovo));
        computers.add(new Tablet(3, samsung));
        computers.add(new Desktop(50, lenovo));
        computers.add(new Laptop(15, sony));

        double priceOfSony = 0;
        double priceOfSamsung = 0;
        double priceOfLenovo = 0;
        double priceOfDell = 0;
        double multiComputers = 0;

        for (Computer c : computers) {
            if (c.getBrand().equals(sony)) {
                priceOfSony += c.getPrice();
            } else if (c.getBrand().equals(samsung)) {
                priceOfSamsung += c.getPrice();
            } else if (c.getBrand().equals(lenovo)) {
                priceOfLenovo += c.getPrice();
            } else if (c.getBrand().equals(dell)) {
                priceOfDell += c.getPrice();
            } else {
                multiComputers += c.getPrice();
            }
        }

        System.out.println("priceOfSony is " + priceOfSony);
        System.out.println("priceOfSamsung is " + priceOfSamsung);
        System.out.println("priceOfLenovo is " + priceOfLenovo);
        System.out.println("priceOfDell is " + priceOfDell);
        double total = priceOfDell + priceOfLenovo + priceOfSamsung + priceOfSony;
        System.out.println("total is " + total);
        
        //How to get price of computers according to object type
        double priceOfLaptop = 0.0;
        double priceOfDesktop = 0.0;
        double priceOfTablet = 0.0;
        
        for (Computer c : computers) {
            if(c instanceof Laptop){
                priceOfLaptop += c.getPrice();
            }else if(c instanceof Desktop){
                priceOfDesktop += c.getPrice();
            }else if(c instanceof Tablet){
                priceOfTablet += c.getPrice();
            }
        }
        System.out.println("Laptops cost:"+priceOfLaptop);
        System.out.println("Desktops cost:"+priceOfDesktop);
        System.out.println("Tablets cost:"+priceOfTablet);
        

    }

}
