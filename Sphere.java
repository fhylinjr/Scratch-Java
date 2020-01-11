import java.lang.Math;
public class Sphere {
    private double radius;
    public Sphere( double radius){ this.radius = radius; }
    public double getRadius(){ return this.radius; }

    public double getArea(){
        return Math.PI * 4 * this.radius * this.radius;
    }

    public double getVolume() {
        return Math.PI * (4 / 3) * Math.pow(this.radius, 3);
    }
}
