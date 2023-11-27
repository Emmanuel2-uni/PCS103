public class App {

    public static void main(String[] args) throws Exception {

        Circle circ = new Circle();



        circ.setRadius(7);

        System.out.println("Radius is " + circ.getRadius());



        System.out.println("Area is " + circ.calculateArea());

        System.out.println("Perimeter is " + circ.calculatePerimeter());



    }
