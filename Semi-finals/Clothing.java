public class Clothing extends Product{
    
    //As per instruction, a unique variable for this class.
    String size;
    double size_mod;

    //We inherit the Product superclass through super(id, desc, price)
    public Clothing(String desc, String id, double price, String size){
        super(id, desc, price);
        this.size = size;
    }

        //What the hell did the Professor mean by this????????????????????
        public double calculateCost(){
            if(size == "XL"){
                size_mod = 1.10;
            }
            return size_mod * 1.10;
        }
}