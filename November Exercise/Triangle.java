public class Triangle extends Shape implements Calc{
  
    public double calculateArea(double base, double height){
        double area = 0.5 * base * height;
        return area;
    }

}
