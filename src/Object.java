public abstract class Object {
    private String color;

    public Object(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract void draw();
}
