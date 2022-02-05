public class Parameters {
    public static void main(String[] args) {
        measureRectangle(3, 6);
        measureRectangle(3.2, 6.4);
        measureRectangle(2.2, 4.5);
        measureRectangle(6.2, 6.1);
        measureRectangle(3.3, 6.9);
    }

    public static void measureRectangle(double length, double width) {
        double area = length * width;
        System.out.println("The area of the rectangle with length " + length + " and width " + width + " is " + area + "\n");
    }
}
