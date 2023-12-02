public class Product {

    //Do NOT declare variables inside interfaces, they will be Constants instead of variables that can be modified.
    //The professor probably meant to superclass Product instead. 
    //We declare the fields we'll be using here: id, desc and price.
    String id;
    String desc;
    double price;

    //Constructor for the Product class.
    public Product(String id, String desc, double price)
    {
        this.id = id;
        this.desc = desc;
        this.price = price;
    }

    //What the hell did the Professor mean by this???????????
    public double calculateCost(){
        return price;
    }

    
}
