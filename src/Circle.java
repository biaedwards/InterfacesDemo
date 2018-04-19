public class Circle extends Object implements Movable, Selectable {

    private Point center;
    private double radius;

    public Circle(String color, Point center, double radius) {
        super(color);
        this.center = center;
        this.radius = radius;
    }

    @Override
    public void move(double x, double y) {
        center.move(x,y);
    }

    @Override
    public void draw() {
        System.out.printf("%s circle with center at %s and radius of %.2f.\n", getColor(), center, radius);
    }

    @Override
    public Point locate() {
        return center;
    }
}
