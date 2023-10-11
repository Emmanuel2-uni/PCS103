public class Car extends Vehicle{
    public Car(String name){
        super(name);
    }


    public void displayCar(){
        System.out.printf("\n%s is a Car.", name);
    }
}
