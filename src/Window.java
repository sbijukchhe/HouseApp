import java.util.ArrayList;
import java.util.Collections;

public class Window {

    private String color;
    private String shape;
    private int numWindow;
    private int area;


    private String winDesign;

    public Window(){

    }

//    // getter for window designs which returns arrayList of designs
//    public ArrayList<String> getWinDesigns() {
//        return winDesigns;
//    }
//
//    // setter for window designs
//    public void setWinDesigns(ArrayList<String> winDesigns) {
//        this.winDesigns = winDesigns;
////        winDesigns.add("awning window");
////        Collections.addAll(winDesigns, "Casement window", "Single hung window", "Double hung window",
////                            "Bay window");
//    }


    public String getWinDesign() {
        return winDesign;
    }

    public void setWinDesign(String winDesign) {
        this.winDesign = winDesign;
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

    public int getNumWindow() {
        return numWindow;
    }

    public void setNumWindow(int numWindow) {
        this.numWindow = numWindow;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Window{" +
                "color='" + color + '\'' +
                ", shape='" + shape + '\'' +
                ", numWindow=" + numWindow +
                ", area=" + area +
                ", winDesign='" + winDesign + '\'' +
                '}';
    }
}
