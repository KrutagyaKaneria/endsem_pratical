class Box {
    double length, breadth, height;

    Box() {
        length = breadth = height = 1;
    }
    Box(double side) {
        length = breadth = height = side;
    }
    Box(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    double volume() {
        return length * breadth * height;
    }

    void displayVolume() {
        System.out.println("Volume of box = " + volume());
    }

    public static void main(String[] args) {
        Box box1 = new Box();          
        Box box2 = new Box(5);         
        Box box3 = new Box(3, 4, 5);

        System.out.print("Box 1: ");
        box1.displayVolume();

        System.out.print("Box 2: ");
        box2.displayVolume();

        System.out.print("Box 3: ");
        box3.displayVolume();
    }
}
