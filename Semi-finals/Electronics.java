public class Electronics extends Product{
    //As per instruction, a unique variable for this class.
    int warranty = 0;

    //We inherit the Product superclass through super(id, desc, price)
    //Adding a new this.warranty = warranty parameter in the constructor.
    public Electronics(String desc, String id, double price, int warranty){
        super(id, desc, price);
        this.warranty = warranty;
    }

    //What the hell did the Professor mean by this????????????????????
    public double calculateCost(){
        return warranty * 1.05;
    
    }
}
