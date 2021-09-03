import java.util.Scanner;

public class Shape {
    private static String Circle;
    private static String Triangle;
    private static String Rectangle;
    public static void draw(){

        System.out.println("draw it");
    }
    public static void erase(){
        System.out.println("erase it");
    }

    public static void main(String[] args) {
        System.out.println("请输入图形形状");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        if (s.equals( "Circle") || s.equals( "Rectangle") || s.equals( "Triangle ")) {
            draw();
            erase();
        }

        else {
            System.out.println("UnsupportedShapeException");
        }
    }
}