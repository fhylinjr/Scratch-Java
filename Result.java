public class Result {
    public static void main(String[] args) {
        double radius = 6;
        Sphere n = new Sphere(radius);
        System.out.println(n.getArea() + " is the area of your sphere");
        System.out.println(n.getVolume() + " is the volume of your sphere");
        System.out.println(n.getRadius() + " is the radius of your sphere");

    }
}