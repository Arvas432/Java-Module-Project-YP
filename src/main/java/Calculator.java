public class Calculator {
    private String products = "";

    private int numberOfPeople;
    private double totalPrice = 0.00;
    public void addProduct(Product product) {
        products += product.productToString();
        totalPrice += product.getPrice();
    }

    public void printReceipt() {
        System.out.println("Добавленные товары: " + "\n" + products);
        double paymentPerPerson = totalPrice / numberOfPeople;
        System.out.println(String.format("Общая сумма: %.2f", totalPrice) + " " + FormatChecker.getRubleFormat(totalPrice));
        System.out.println(String.format("Каждый должен заплатить: %.2f", + paymentPerPerson) + " " + FormatChecker.getRubleFormat(paymentPerPerson));
    }
    public Calculator(int numberOfPeople){
        this.numberOfPeople = numberOfPeople;
    }
}




