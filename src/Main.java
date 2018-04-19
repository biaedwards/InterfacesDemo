public class Main {
    public static void main(String[] args){
        Canvas canvas = new Canvas();

        canvas.addObject(new Circle("Red", new Point(0, 0), 3));
        canvas.addObject(new Rectangle("Green", new Point(2, 3), 3, 4));
        canvas.addObject(new Curve("Black", 5));

        canvas.render();
        canvas.select(new Point(-1, 1), new Point(1, -1));
        canvas.move(-2, 0);
        canvas.render();

    }
}
