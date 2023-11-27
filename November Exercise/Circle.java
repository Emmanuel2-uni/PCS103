public class Circle extends Shape implements Calc{
    double pi = Math.PI;

    public double calculateArea(double radius){
        double area = pi * (radius * radius);
        return area;
    }

}
