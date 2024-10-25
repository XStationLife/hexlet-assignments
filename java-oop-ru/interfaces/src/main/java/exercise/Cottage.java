package exercise;

// BEGIN
class Cottage implements Home {
     double area;
     int floor;

    public Cottage(double area, int floor) {
        this.area = area;
        this.floor = floor;
    }

    @Override
     public double getArea() {
         return area;
     }

     public String toString() {
         return floor + " этажный коттедж площадью " + getArea() + " метров";
     }

    @Override
    public int compareTo(Home another) {
        if (getArea() > another.getArea()) {
            return 1;
        } else if (getArea() < another.getArea()) {
            return -1;
        } else {
            return 0;
        }
     }
}
// END
