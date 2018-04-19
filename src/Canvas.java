import java.util.HashSet;

public class Canvas {
    private static HashSet<Object> objects;
    private static HashSet<Movable> selected;

    public Canvas() {
        objects = new HashSet<>();
        selected = new HashSet<>();
    }

    public void addObject(Object newObject) {
        objects.add(newObject);
    }

    public void render() {
        for (Object anObject : objects) {
            anObject.draw();
        }
    }

    public void select(Point a, Point b) {
        selected.clear();
        for(Object anObject:objects){
            if(!( anObject instanceof Selectable)) continue;
            if (Math.min(a.getX(), b.getX()) < ((Selectable) anObject).locate().getX() &&
                    Math.max(a.getX(), b.getX()) > ((Selectable) anObject).locate().getX() &&
                    Math.min(a.getY(), b.getY()) < ((Selectable) anObject).locate().getY() &&
                    Math.max(a.getY(), b.getY()) > ((Selectable) anObject).locate().getY()) {
                Canvas.selected.add((Movable) anObject);
            }
        }
    }

    public void move(double x, double y){
        for(Movable anObject:selected){
            anObject.move(x,y);
        }
    }
}
