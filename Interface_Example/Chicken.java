public class Chicken extends Bird implements Flyable{

    public Chicken(int age, int weight, String gender){
        super(age, weight, gender);
    }

    public void fly(){
        System.out.println("Not flying...");
    }
}
