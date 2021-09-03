import java.util.Scanner;

public class text12 {
    public static void main(String[] args) {

        Scanner Input=new Scanner(System.in);
        System.out.println("请输入");
        int number= Input.nextInt();
        re(number);//void 的没有返回值，直接调用。有返回值的用soot(函数())调用

    }
    public static void re(int number) {
        int num=0;
        while (number>0){
            num=number%10+(num*10);
            number/=10;
        }
        System.out.println(num);
    }
}
