public class App {

    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");



        Circle circ = new Circle();

        Rectangle rect = new Rectangle();

        Triangle tri = new Triangle();



        System.out.println("Area of Circle is " + circ.calculateArea(4));

        System.out.println("Area of Rectangle is " + rect.calculateArea(12, 34));

        System.out.println("Area of Triangle is " + tri.calculateArea(5, 9));

    }

}
