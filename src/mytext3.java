/*
算法入门
 */
/*1.鸡兔同笼问题
已知鸡和兔的总数量为n，总腿数为m。输入n和m，依次输出鸡的数目和兔的数目。如 果无解，则输出No answer。
 */
/*
public class mytext3 {
    public static void main(String[] args) {
              jt(14,32);
    }
    public static void jt(int n, int m) {
        int x=0,y=0;
        x = (4*n-m)/2;
        y = n-x;
        if(m % 2 !=0|| x < 0 || y< 0){
            System.out.println("不符合");
        }
        System.out.println(x);
        System.out.println(y);
    }
}

 */

/*
三个数排序,三个数可能出现abc,acd,bac,bca,cab,cba这6种组合，写六个判断就行，注意可能出现相等的情况
 */
/*
public class mytext3 {
    public static void main(String[] args) {
        paixu(12,111,15);
    }
    public static void paixu(int a,int b,int c ){
        if (a>=b&&b>=c){
            System.out.println(a+","+b+","+c);;
        }
        if(a>c&&c>b){
            System.out.println(a+","+c+","+b);
        }
        if (b>a&&a>c){
            System.out.println(b+","+a+","+","+c);
        }
        if (b>c&&c>a){
            System.out.println(b+","+c+","+","+a);
        }
        if (c>a&&a>b){
            System.out.println(c+","+a+","+b);
        }
        if (c>b&&b>a){
            System.out.println(c+","+b+","+a);
        }
    }

}

 */
/*
：对于任意大于1的自然数n，若n为奇数，则将n变为3n＋1，否则变为n的一半。 经过若干次这样的变换，一定会使n变为1。例如，3→10→5→16→8→4→2→1。
 */

/*

public class mytext3{
    public static void main(String[] args) {
        int i = 3;
        int c=0;
        System.out.print(3+"->");
        while (c<7) {
            System.out.print(jisu(i) + "->");
            i=jisu(i);
                  c++;
        }
    }
     public static int jisu(int i){
            //int result = 0;
               if (i % 2 == 1) {
                   i=3*i+1;

               } else {
                   i=i/2;
               }
            return i;
        }

}

 */
/*
计算 ,PI/4=1-1/3+1/5-1/7----,算到最后位小于10^-6
 */
/*
public class mytext3{
    public static void main(String[] args) {
            System.out.println(sum());//本程序的sum()函数已经计算出具体的最终结果，所以直接调用方法即可
    }
    public static double sum(){//sum()函数里不带参数，调用的时候也不带，sum()带参数时，调用的时候要带
        double n=0;
        double s1=0;
        double s2=0;
        for (n = 1; ; n++) {
            double r = 1.0 / (2 * n - 1);
            if (n % 2 == 0) {
                s2 = s2 - r;
            } else {
                s1 = s1 + r;
            }
            if (1/(2*n-1)<1e-6){
                break;
            }

        }
        return s1+s2;
    }
}

 */
/*
public class mytext3{
    public static void main(String[] args) {
        for (int n = 1; ; n++) {
            if (n%10==0){
                System.out.println("");
            }
            System.out.print("汪冲是伞兵"+"****");
        }
    }
}

 */
/*
输入n，计算S＝1！＋2！＋3！＋…＋n！的末6位（不含前导0）。n≤10^6，n！表示 前n个正整数之积。

 */
public class mytext3 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(sum(3));
    }
    //思路：一层循环求各项的和，两层循环求每一项的阶乘，第二层循环和求和嵌套在第一层循环中
    public static int sum(int n) {
        int result = 0;
        int s = 0;
        for (int i = 1; i <= n; i++) {
            int s1 = 1;//s1的作用范围是从第一层循环开始，直到结束
            for (int j = 1; j <= i; j++) {
                s1 = s1 * j;
            }
            s += s1;
            result = s;
        }
        return result;
    }
}

