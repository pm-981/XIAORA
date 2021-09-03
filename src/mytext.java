import java.util.Scanner;

public class mytext {
    public static void main(String[] args) {
        System.out.println("请输入行数");
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        displayPattern(n);
    }

    public static void displayPattern(int n){
        for (int j = 1; j <=n ; j++) {//控制行数。且行数从1开始
            for (int i = 0;  i< n-j; i++) {
                System.out.print(" ");//控制每一行空格的个数
            }
            for (int i = 1; i <=j; i++) {//控制每一行数字的输出
                System.out.print(i);
            }
            System.out.println("");//一行输出结束，回车换行
        }

    }

}
