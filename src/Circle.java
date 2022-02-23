public class Circle {
    private double radius;

    public Circle(double radius) throws RuntimeException{
        if(radius < 0){
            throw new RuntimeException("sorry rad cant be negative");
        }
        if(radius > 10){
            throw new IllegalArgumentException("bad bad you are a hacker");
        }
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
}
