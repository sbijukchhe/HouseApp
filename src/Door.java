public class Door {

    private String color;
    private String shape;
    private int numDoor;
    private int area;

    public Door(){

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getNumDoor() {
        return numDoor;
    }

    public void setNumDoor(int numDoor) {
        this.numDoor = numDoor;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Door{" +
                "color='" + color + '\'' +
                ", shape='" + shape + '\'' +
                ", numDoor=" + numDoor +
                ", area=" + area +
                '}';
    }
}
