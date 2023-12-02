public class Book extends Product {
    //As per instruction, a unique variable for this class.
    int pages = 0;

    //We inherit the Product superclass through super(id, desc, price)
    public Book(String desc, String id, double price, int pages){
        super(id, desc, price);
        this.pages = pages;

    }


    //What the hell did the Professor mean by this????
    public double calculateCost(){
        return pages * 1.05;

    }



}