
public class ReturnValues {    public static void main(String[] args) {
    double measure1 = measureRectangle(6, 6, "area");
    double measure2 = measureRectangle(3.2, 6.4, "perimeter");

    stringPrinter(3,6, measure1, "area");
    stringPrinter(3.2,6.4, measure2, "perimeter");
}

public static double measureRectangle(double length, double width, String option) {
    if(length < 0 || width < 0){
        System.out.println("length and width cannot be less than 0");
        System.exit(0);
    }
    switch (option){
        case "area": return length * width;
        case "perimeter": return 2*(length + width);
        default: return 404;
    }
}

public static void stringPrinter(double length, double width, double measure, String option) {
    System.out.println("The " + option + " of rectangle with length " + length + " and width " + width + " is equal to " + measure + "\n");
    
}
}
