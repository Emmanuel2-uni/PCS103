public class Circle{
    private double radius;
    private double pi = Math.PI;


    public double getRadius()
    {
        return radius;
    }



    public void setRadius(double val)
    {
        radius = val;
    }

    public double calculateArea()
    {
        double area = pi * (radius * radius);
        return area;       
    }



    public double calculatePerimeter()
    {
        double perimeter = 2 * pi * (radius);
        return perimeter;       
     }
  
}
