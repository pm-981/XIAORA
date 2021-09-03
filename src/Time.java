import java.text.SimpleDateFormat;
import java.util.Date;

public class Time {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);
        SimpleDateFormat F = new SimpleDateFormat("yyyy-MM-dd' 'HH:mm:ss");
        System.out.println("标准的日期"+F.format(date));
    }
}
