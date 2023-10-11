public class App {
    public static void main(String[] args) throws Exception {
        Sedan vios = new Sedan("Toyota Vios");

        vios.displayVehicle();
        vios.displaySedan();
        vios.displayCar();
      }
  }


public class Car extends Vehicle{
    public Car(String name){
        super(name);
    }


    public void displayCar(){
        System.out.printf("\n%s is a Car.", name);
    }
}



public class Sedan extends Car {
    public Sedan(String name){
        super(name);
    }

        public void displaySedan(){
            System.out.printf("\n%s is a Car of the type Sedan.", name);
        }
}



public class Vehicle {
    String name;
    public Vehicle(String name){
        this.name = name;

    }

    public void displayVehicle(){
        System.out.printf("\n%s is a Vehicle with 4 wheels.", name);
    }
}
