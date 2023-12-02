public class ShoppingCart{
    //We use an Array to store details and to access each record handily and readily. An ArrayList is better and ideal but it wasn't taught this semester for Java.
    String listdesc[] = new String[10];
    String listid[] = new String[10];
    String listtype[] = new String[10];
    Double listprice[] = new Double[10];

    //A counter/index to keep track of the number of items (and their positions) inside  the array.
    int index = 0;

    
    // We pass an object (book) to the function; it will then take the object's parameters and store it in the array.
    public void addProduct(Book book){
        listdesc[index] = book.desc;
        listid[index] = book.id;
        listtype[index] = "(Book)";
        listprice[index] = book.price;
        index++;
    }

    public void addProduct(Clothing clothing){
        listdesc[index] = clothing.desc;
        listid[index] = clothing.id;
        listtype[index] = "(Clothing)";
        listprice[index] = clothing.price;
        index++;

    }

    public void addProduct(Electronics electronics){
        listdesc[index] = electronics.desc;
        listid[index] = electronics.id;
        listtype[index] = "(Electronics)";
        listprice[index] = electronics.price;
        index++;

    }


    public void displayTotal(){
        double total = 0.0;
        for(int i = 0; i < index; i++){
            System.out.println("Product: " + listdesc[i] +  " " + listtype[i] + " Cost: " + listprice[i]);
            total += listprice[i];
        }

        System.out.println("Total: " + total);
    }

}