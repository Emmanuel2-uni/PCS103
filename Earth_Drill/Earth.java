public class Earth {
    public static void main(String[] args) throws Exception {

        Human tom = new Human("Tom", 22, 177, "Blue");
        Human_Input tom_input = new Human_Input();


        System.out.println("\nNo user input: ");
        tom.Speak();

        System.out.println("\nWith user input: ");
        tom_input.Speak();

        System.out.println("\n\n");
    }
}
