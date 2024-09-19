class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(double side) {
        this.length = side;
        this.width = side;
    }

    public void calculateArea() {
        double area = length * width;
        System.out.println("Area of the rectangle = " + area);
    }

    public void calculatePerimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of the rectangle = " + perimeter);
    }

    public void printDimensions() {
        System.out.println("Length = " + length);
        System.out.println("Width = " + width);
    }
}