public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 8.4);
        rectangle1.calculateArea();
        rectangle1.calculatePerimeter();
        rectangle1.printDimensions();

        Rectangle rectangle2 = new Rectangle();
        rectangle2.calculateArea();
        rectangle2.calculatePerimeter();
        rectangle2.printDimensions();

        Rectangle square = new Rectangle(5);
        square.calculateArea();
        square.calculatePerimeter();
        square.printDimensions();
    }
}