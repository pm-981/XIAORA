import java.util.ArrayList;
import java.util.List;
public  class newtext {
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