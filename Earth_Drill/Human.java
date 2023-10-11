public class Human {

    String name;
    int age = 0;
    int height = 0;
    String eyecolor;


    public Human(String name, int age, int height, String eyecolor){
        this.name = name;
        this.age = age;
        this.height = height;
        this.eyecolor = eyecolor;
    } 

    public void Speak(){
        System.out.println("Hello, my name is " + name + ".");
        System.out.println("I am " + age + " years old.");
        System.out.println("I am " + height + " inches tall.");
        System.out.println("My eye color is " + eyecolor + ".");

    }

}
