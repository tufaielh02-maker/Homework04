package Task1;
public class task1 {
    public static int calculateArea(int length, int width) {
        return length * width;
    }

    // double version - same name, different type = Overloading
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        System.out.println("Int area: " + calculateArea(5, 4));
        System.out.println("Double area: " + calculateArea(5.5, 4.2));
    }
}