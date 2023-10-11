public class Vehicle {
    String name;
    public Vehicle(String name){
        this.name = name;

    }

    public void displayVehicle(){
        System.out.printf("\n%s is a Vehicle with 4 wheels.", name);
    }
}
