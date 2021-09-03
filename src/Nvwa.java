
import java.util.Scanner;

public class Nvwa {
    private static String Man;
    private static String Won;
    private static String Robot;
    private static String W;
    public static void main(String[] args) {
        System.out.println("请输入");
        Scanner input=new Scanner(System.in);
        String str = input.nextLine();
        S(str);
    }
    public static void S( String str){
        String s="W,R,M";
        if (str.equals("W")){
            System.out.println("Wom");
        }
        if (str.equals("M")){
            System.out.println("Man");
        }
        if (str.equals("R")){
            System.out.println("Robot");
        }

    }
}

