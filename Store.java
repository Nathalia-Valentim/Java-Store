public class Store {
    //instance field
    String productType; 
    double price = 0.5;
    
    //construtor method
    public Store(String product) {
        productType = product;
    }
    
    //metodo 1
    public void advertise(){
        System.out.println("Come spend some money!");
        System.out.println("Selling" + productType + "!");
    }
    //metodo 2
    public void greetCostumer(String costumer){
        System.out.println("Welcome to the store," + costumer + "!");
    }
    //metodo 3
    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
    }
    //metodo 4
    public double getPriceWithTax(){
         double totalPrice = price + price*0.08;
         return totalPrice;
    }
   
    //main method 
    public static void main(String[] args) {
    Store product = new Store(" book");
    product.advertise();
    
    Store greetCostumer = new Store(" Kali");
    product.greetCostumer(" Kali");
    
    Store lemonade = new Store("lemonade");
    lemonade.increasePrice(1);
    System.out.println(lemonade.price);
    
    double lemonadePrice = lemonade .getPriceWithTax();
    System.out.println(lemonadePrice);
    }
}