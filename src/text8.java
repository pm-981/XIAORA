//判断100-200的素数，并输出
public class text8 {
    public static void main(String[] args) {
        for (int i = 100; i < 200; i++) {
            System.out.println(xy());
                break;
        }
    }
    public static int xy() {
        for (int j = 100; j < 200; j++) {
          if (j%2!= 0) {
              System.out.println(j);
          }
        }
        return 0;
    }
}
