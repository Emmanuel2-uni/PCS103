// Attempt to try put a scanner/input function insde the constructor
import java.util.Scanner;

public class Human_Input {

    String name;
    int age = 0;
    int height = 0;
    String eyecolor;


    public Human_Input(){
        Scanner input = new Scanner(System.in);

        System.out.print("Input name: ");
        name = input.nextLine();

        System.out.print("Input age: ");
        age = input.nextInt();

        System.out.print("Input height: ");
        height = input.nextInt();
            
        // This next line is to "clear" the scanner input stream of any remaining newlines/whitespaces.
        // Use this after nextInt and if the next input is going to be a String variable.
        input.nextLine();

        System.out.print("Input name: ");
        eyecolor = input.nextLine();

        input.close();
    } 

    public void Speak(){
        System.out.println("Hello, my name is " + name + ".");
        System.out.println("I am " + age + " years old.");
        System.out.println("I am " + height + " inches tall.");
        System.out.println("My eye color is " + eyecolor + ".");


    }

}
