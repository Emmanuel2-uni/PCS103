public class Sparrow extends Bird implements Flyable{
 
    public Sparrow(int age, int weight, String gender){
        super(age, weight, gender);

    }

    public void fly(){
        System.out.println("Flying...");
    }
    // public void fly(){
    //     System.out.println("Flying...");
    // }
}
