import java.util.Scanner;

public class MyTriangle {
    public static void main(String[] args) {
        System.out.println("please input ");
        Scanner input =new Scanner(System.in);
        double side1=input.nextDouble();
        double side2=input.nextDouble();
        double side3=input.nextDouble();
        if (isValid( side1,  side2, side3)==true){
            System.out.println(area( side1,  side2, side3));
        }
        else{
            System.out.println("不符合规则");
        }
    }
    public static boolean isValid(double side1, double side2,double side3){
         if (side1<side2+side3||side2<side1+side3||side3<side1+side2){
             return true;
         }
         return false;
    }
    public static double area(double side1, double side2, double side3){
        double p=(side2+side1+side3)/2;
          return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3)) ;
    }
}
