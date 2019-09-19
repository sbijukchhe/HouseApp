public class Floor {

    private String flooringType;
    private int numFloor;

    public Floor() {
    }

    public String getFlooringType() {
        return flooringType;
    }

    public void setFlooringType(String flooringType) {
        this.flooringType = flooringType;
    }

    public int getNumFloor() {
        return numFloor;
    }

    public void setNumFloor(int numFloor) {
        this.numFloor = numFloor;
    }

    @Override
    public String toString() {
        return "Floor{" +
                "flooringType='" + flooringType + '\'' +
                ", numFloor=" + numFloor +
                '}';
    }
}
