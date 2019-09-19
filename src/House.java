
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class House {

    // house object contains floor objects, window objects and door objects
    private Floor floor;
    private Window window;
    private Door door;
    private int sqFt;
    private double salesPrice;

    //private ArrayList<String> houses;

    public House(){


    }

    public House(Floor floor, Window window, Door door, int sqFt, double salesPrice) {
        this.floor = floor;
        this.window = window;
        this.door = door;
        this.sqFt = sqFt;
        this.salesPrice = salesPrice;
    }




    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public int getSqFt() {
        return sqFt;
    }

    public void setSqFt(int sqFt) {
        this.sqFt = sqFt;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public String displayHouse(){
        return "My future home has " + this.getFloor().getNumFloor() + " floors,\t" +
                this.getFloor().getFlooringType() + " flooring type,\t" +
                this.getWindow().getNumWindow() + " windows,\t" +
                this.getWindow().getWinDesign() + "window design,\t" +
                this.getDoor().getNumDoor() +" doors,\t" +
                this.getSqFt()+" sq ft area and it is worth $ " + this.getSalesPrice();
    }
    @Override
    public String toString() {
        return "House{" +
                "floor=" + floor +
                ", window=" + window +
                ", door=" + door +
                ", sqFt=" + sqFt +
                ", salesPrice=" + salesPrice +
                '}';
    }
}