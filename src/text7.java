import java.text.SimpleDateFormat;
import java.util.Date;

public class text7 {
    public static void main(String[] args) {
        //获取当前时间
        Date nowTime = new Date(System.currentTimeMillis());
        SimpleDateFormat sdFormatter = new SimpleDateFormat("yyyy-MM-dd");
        String now = sdFormatter.format(nowTime);
        System.out.println(now);
        // 时间的输出
    }
}
