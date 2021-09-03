/*
        public class text11 {
    public static void main(String[] args) {
        System.out.println(s(5));
    }
    public static boolean s(int i){
        int j=0;
        if (j%2==0) {
           return true ;
        }
        else{
            return false;
        }
    }
}
*/
/*
public class text11 {
    public static void main(String[] args) {
        System.out.println(s());
    }
    public static  double s(){
        double j=10;
        if (j<=0){
            return -1;
        }
        else {
            double c=j;
            return (j+c/j)/2.0;
        }
    }
}

 */

/*6-1输出五角数
public class text11 {
    public static void main(String[] args) {
        System.out.println(s());
    }
    public static final int s(){
        int result = 0;
        for (int i = 1; i < 100; i++) {
            result=i*(3*i-1)/2;
            if (i%10==0)
                System.out.println("");
            System.out.print(result );
            System.out.print(",");
        }
        return result;
    }

}
 */
/*求一个整数各位之和
public class text11 {
    public static void main(String[] args) {
        System.out.println(s());
    }
    public static final int s() {
        int i = 234;
        int a = 234 / 100;
        int b = (234 % 100) / 10;
        int c = 234 % 10;
         return a + b + c;
    }
}

 */

import java.util.Scanner;
//Java方法典例
public class text11 {
    public static void main(String[] args) {
        System.out.println("请输入一个三位数");
        Scanner input=new Scanner(System.in);
        int num= input.nextInt();
        System.out.println(text11.isPalindrome(num));
        System.out.println(text11.reverse(num));
    }
    public static int reverse(int number){

        int num=0;//定义返回值
        while (number>0){
            num=number%10+(num*10);
            number/=10;
        }

        return num;
    }
    public static boolean isPalindrome(int number){
        if (number==reverse(number)){
            return  true;
        }
        return false;
    }

}





































