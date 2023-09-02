public class Product {
    private String name;
    private double price;

    public String getName() {
        return name;
    }
    public String productToString(){
        return String.format("%s: %.2f ", name, price) + FormatChecker.getRubleFormat(price) + "\n";
    }
    public double getPrice() {
        return price;
    }
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

}
