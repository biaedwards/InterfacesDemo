public class Rectangle extends Object implements Movable, Selectable {
    Point topLeftCorner;
    double width, height;

    public Rectangle(String color, Point topLeftCorner, double width, double height) {
        super(color);
        this.topLeftCorner = topLeftCorner;
        this.width = width;
        this.height = height;
    }

    @Override
    public void move(double x, double y) {
        topLeftCorner.move(x,y);
    }

    @Override
    public void draw() {
        System.out.printf("%s rectangle with top left corner at %s and width and height %.2f and %.2f respectively.\n", getColor(), topLeftCorner, width, height);
    }

    @Override
    public Point locate() {
        return topLeftCorner;
    }
}
