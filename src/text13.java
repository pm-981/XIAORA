/*
(对三个數排序）使用下面的方法头编写方法，按升序显示三个数：
public static void displaySortedNumbers(
double numl, double num2, double num3)
编写测试程序，提示用户输人三个数字，调用方法以升序显示他们。(对三个數排序）使用下面的方法头编写方法，按升序显示三个数：
public static void displaySortedNumbers(double numl, double num2, double num3)
编写测试程序，提示用户输人三个数字，调用方法以升序显示他们。
 b0n 0 vn,

 */
/*
( 显示图案）编写方法显示如下图案：
s i i
n n-1 ... 3 2 1
该方法头为：
public static void displayPattern(int n)
 */
/*
public class text13{
    public static void main(String[] args) {
        System.out.println("please input n");
        Scanner Input=new Scanner(System.in);
        int n= Input.nextInt();
        displayPattern(n);
    }
    public static void displayPattern(int n){
        for(int line = 1;line <= n;line++)//控制行数
        {

            for(int i = 1;i <= 2 * (n - line);i++)//每行的空格数
                System.out.print(" ");//输出空格

            for(int i = line;i >= 1;i--)
                System.out.printf("%d ",i);
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}

 */

/*
编写一个方法，计算按照给定的年数和利率计算未来投资
值，未来投资是用编程练习题 2.21 中的公式计算得到的。
使用下面的方法头：
public static double futurelnvestmentValue(double investmentAmount, double month!ylnterestRate, int years)
例如：futurelnvestmentValue(10000,0.05/12,5)返回 12833.59
 */
/*
public class text13 {
    public static void main(String[] args) {//注意变量的作用范围，定义一次后不用在定义
        System.out.println("请输入本金");
        Scanner input=new Scanner(System.in);
        double investmentAmount=input.nextDouble();
        System.out.println("请输入利率");
        Scanner input1=new Scanner(System.in);
        double monthlylnterestRate=input1.nextDouble();
        System.out.println("请输入年限");
        Scanner input2=new Scanner(System.in);
        int years= input.nextInt() ;
        System.out.println(futurelnvestmentValue(investmentAmount,  monthlylnterestRate,years));
    }
    public static double futurelnvestmentValue (double investmentAmount, double monthlylnterestRate, int years){
        double futurelnvestmentValue = 0;
        for (int i = 0; i < years; i++) {
            for (int j = 0; j < 12; j++) {
                futurelnvestmentValue =investmentAmount*(1+monthlylnterestRate) ;

            }
        }
       return futurelnvestmentValue;
    }
}

 */

/*
编写一个类，包含下面两个方法： Convert from Celsius to Fahrenheit
public static double celsiusToFahrenheit(double Celsius) /** Convert from Fahrenheit to Celsius
public static double fahrenheitToCelsius(double fahrenheit)
        转换公式如下：
        华氏度 =(9.0 / S)* 摄氏度 + 32
        摄氏度 = (5.0 / 9)* ( 华氏度 - 32)
 */
/*
public class text13 {
    public static void main(String[] args) {
        System.out.println("what celsius is ？ ");
        Scanner input =new Scanner(System.in);
        double celsius=input.nextDouble();
        System.out.println(celsiusToFahrenheit(celsius));
        System.out.println("what  is fahrenheit？ ");
        Scanner input1 =new Scanner(System.in);
        double fahrenheit=input.nextDouble();
        System.out.println(fahrenheitToCelsius(fahrenheit));
    }
    public static double celsiusToFahrenheit(double Celsius){
        return (9.0 / 5)* fahrenheit + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0 / 9)* (Celsius - 32);
    }

}

 */

/*
编写一个类，包含如下两个方法: /** Convert from feet to meters
public static double footToMeter(double foot) /** Convert from meters to feet
public static double meterToFoot(double meter)
转换公式如下： 米 = 0.305 * 英尺
        英尺= 3.279 * 米
 */
/*
public class text13 {
    public static void main(String[] args) {
        System.out.println("please input meter ");
        Scanner input =new Scanner(System.in);
        double meter= input.nextDouble();
        System.out.println(meterToFoot(meter));
        System.out.println("please input foot ");
        Scanner input1 =new Scanner(System.in);
        double foot=input.nextDouble();
        System.out.println(footToMeter(foot));
    }
    public static double footToMeter(double foot){
        double meter;
        meter=3.279 *foot;
        return meter;//3.279 *foot;
    }
    public static double meterToFoot(double meter){
        return   3.279* meter;
    }
}

 */

/*
程 序 清 单 6-7 提 供 了 测 试 某 个 数 字 是 否 是 素 数 的 方 法 isPrime(intnumber)。使用这个方法求小于 10000 的素数个数。
 */

/*
public class text13 {
    public static void main(String[] args) {
        for (int i = 0,j=0; i < 1000; i++) {
            if ( isPrime(i)== true) {
                j++;
                System.out.println(j);

            }

        }
    }
    public static final boolean isPrime(int number){

            if (number % 2 != 0) {
                return true;
            }
            return false;
    }
}

 */

/*
使用下面的方法头，编写一个打印字符的方法：
public static void printChars(char ch1, char ch2, int numberPerLine)
该方法打印 chi到 ch2 之间的字符，每行按指定个数打印。编写一个测试程序，打印
从'1’ 到 V 的字符，每行打印 10 个。字符之间使用一个空格字符隔开
 */
/*
public class text13 {
    public static void main(String[] args) {
        printChars('i','z',10);
    }
    public static void printChars(char ch1, char ch2, int numberPerLine){
        for (int i = (int)ch1; i < (int)ch2; i++) {//(int)char将字符转换成对应ASCII值
            System.out.print((char)i+" ");
            if (i %numberPerLine== 0) {
                System.out.println("");
            }
        }
    }
}

 */

/*
编写一个方法计算下列级数：m(i)=1/2+2/3+ ---- i/i+1
 */

/*
public class text13 {
    public static void main(String[] args) {
        System.out.println("please input ");
        Scanner input =new Scanner(System.in);
        int Input= input.nextInt();
        System.out.println("i" + "             " + "m(i)");
        System.out.println("--------------------");

        for (int i = 1; i < Input; i++) {
            System.out.println(i+"               "+sum(i));
        }
    }
    public static final double sum(double i){
        double sum = 0;
        for (int j = 1; j <= i; j++) {
            sum = sum + ((double) j / ((double) j + 1));
        }
        return sum;
    }
}

 */

/*
 (估算 PI ) PI 可以使用下面的数列进行计算
编写一个方法，对于给定的彳返回 m(i), 并且编写一个測试程序，显示如下表格:
 */
/*
public class text13 {
    public static void main(String[] args) {
        System.out.println("please input ");
        Scanner input =new Scanner(System.in);
        int i= input.nextInt();
        System.out.println("i" + "             " + "m(i)");
        System.out.println("--------------------");
        for (int j = 0; j < i; j++) {
            System.out.println(j+"          "+ sum(j));
        }
    }
    public static final double sum(double i){
        double sum=0;
        for (int j = 0; j <=i; j++) {
           sum = sum + Math.pow(-1, j + 1) / (2 * j - 1);
           sum=sum*4;
        }
        return sum;
    }
}

 */
/*
(检测密码）一些网站对于密码具有一些规则。编写一个方法，检测字符串是否是一个有效密码。
假定密码规则如下：
密码必须至少 8 位字符。
密码仅能包含字母和数字。
密码必须包含至少两个数字。
编写一个程序，提示用户输入一个密码，如果符合规则，则显示 Valid Password, 否则
显示 Invalid Password。
 */
/*
public class text13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入密码：");
        String str = scanner.nextLine();
        switch (checkPassword(str)) {
            case 0:
                System.out.print("密码必须是8位以上！");
                break;
            case 1:
                System.out.print("密码必须只包含字符和数字！");
                break;
            case 2:
                System.out.print("密码必须包含至少两个数字！");
                break;
            default:
                System.out.print("密码检验通过！");
                break;
        }

    }

    public static int checkPassword(String pwd) {
        int numDigit = 0;
        int numLetter = 0;
        if (pwd.length() >= 8) {
            for (int i = 0; i < pwd.length(); i++) {
                if (Character.isDigit(pwd.substring(i, i + 1).charAt(0)) ||
                        Character.isLetter(pwd.substring(i, i + 1).charAt(0))) {
                    if (Character.isDigit(pwd.substring(i, i + 1).charAt(0))) {
                        numDigit++;
                    }
                    if (Character.isLetter(pwd.substring(i, i + 1).charAt(0))) {
                        numLetter++;
                    }
                } else {
                    return 1;
                }
            }
            if (numDigit >= 2 && numLetter > 0) {
                return 3;
            } else if (numDigit >= 2 && numLetter == 0) {
                return 1;
            } else if (numDigit == 0 && numLetter > 0) {
                return 1;
            } else return 2;
        } else {
            return 0;
        }
    }
}

 */

/*
使用下面的方法头编写一个方法，返回一年的天数：
public static int numberOfDaysInAYear(int year)
编写一个测试程序，显示从 2000 年到 2020 年每年的天数。
 */
/*
public class text13 {
    public static void main(String[] args) {
        System.out.println("年份"+"         "+  "天数");
        System.out.println("---------------");
        for (int i = 2000; i <=2020; i++) {
            System.out.println( i + "        "+numberOfDaysInAYear(i));
        }
    }
    public static int numberOfDaysInAYear(int year){
        if (year%4==0){
            return 366;
        }
        return 365;
    }
}
 */
/*
编写一个方法，使用下面的方法头显示 n x /i 的矩阵：
public static void printMatrix(int n)
每个元素都是随机产生的 0 或1。编写一个测试程序，提示用户输入 n , 显示如下所示的
n x n 矩阵：
 */
/*
public class text13 {
    public static void main(String[] args) {
        System.out.println("请输入行数");
        Scanner input=new Scanner(System.in);
        int n= input.nextInt();
        printMatrix(n);
    }
    public static void  printMatrix(int n) {
        int k = 0;
        while (k < n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(Math.round(Math.random()) + " ");//Math.random()：得到0-1之间的随机数,Math.round()：四舍五入结合一起就随机产生0和1
                    break;
                }
            }
            System.out.println("");
            k++;
        }
    }

}
 */
/*
*6.20 (计算一个字符串中字母的个数）编写一个方法，使用下面的方法头计算字符串中的字母个数：
public static int countLetters(String s)
编写一个测试程序，提示用户输人字符串，然后显示字符串中的字母个数。
 */
/*
public  class text13 {
    public static void main(String[] args) {
        System.out.println("please input ");
        Scanner input =new Scanner(System.in);
        String S= input.nextLine();
        System.out.println(countLetters(S));
    }
    public static int countLetters(String s){
        String S;
        int count=0;
        int k=0;
        int sum=0;
        for (int i = 0; i < s.length(); i++)//遍历s中的元素
        {
           char  c = s.charAt(i);//赋值给从，注意c的类型为char
           if (c>='a'&& c<='z'){//注意c不需要加''符号

               count++;
           }
           if (c>='A'&&c<='Z'){
             k++;
           }
           sum=count+k;
        }
        return sum;
    }

}

 */
/*
*6.21
(电话按键盘）国际标准的字母 / 数字匹配图如编程练习题 4.15 所示，编写一个方法，返回给定
大写宇母的数字，如下所示：
int  getNumber(char uppercaseLetter)
编写一个测试程序，提示用户输人字符串形式的电话号码。输人的数字可能会包含字母。
程序将字母（大写或者小写）翻译成一个数字，然后保持其他宇符不变。
 */
/*
import java.util.Scanner;

public  class text13 {
    public static void main(String[] args) {
        System.out.println("please input ");
        Scanner input =new Scanner(System.in);
        String S= input.nextLine();
        System.out.println(getNumber(S));
    }

    public  static StringBuffer getNumber(String uppercaseLetter) {
        StringBuffer stringBuffer = new StringBuffer();//必须创建这个字符串 stringBuffer.append()方法才能用
        for (int i = 0; i < uppercaseLetter.length(); i++)//遍历s中的元素
        {
            char c = uppercaseLetter.charAt(i);//赋值给从，注意c的类型为char
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {//注意c不需要加''符号
                stringBuffer.append((int)c);
            } else {
                stringBuffer.append(uppercaseLetter.charAt(i));
            }
        }
        return stringBuffer;
    }
}

 */
/*
**6.22
(數学：平方根的近似求法）有几种实现 Math 类中 sqrt 方法的技术。其中一个称为巴比伦法。
它通过使用下面公式的反复计算近似地得到：
nextCuess =(lastCuess + n / lastCuess) / 2
当 nextGuess 和 lastGuess 几乎相同时，nextGuess 就是平方根的近似值。最初的猜
测值可以是任意一个正值（例如1)。这个值就是 lastCuess的初始值。如果 nextGUess 和
lastGuess 的差小于一个很小的数，比如 0.0001, 就可以认为 nextGuess 是 n 的平方根的近
似值；否则，nextGuess 就成为 lastGuess, 近似过程继续执行。实现下面的方法，返回 n 的
平方根。
public static double sqrt(long n)
 */


/*
public class text13{
    public static void main(String[] args) {
        System.out.println(sqrt(2));
    }
    public static double sqrt(double n){
        double sqrtValue=n/2.0;
        while(sqrtValue*sqrtValue-n>0.001||sqrtValue*sqrtValue-n<-0.001)
        {
            sqrtValue=(sqrtValue+n/sqrtValue)/2;
        }
        return sqrtValue;
    }
  }

 */
/*
*6.23
(指定字符的出现次数）使用下面的方法头编写一个方法，找到一个宇符串中指定字符的出现次数。
public static int count(String str, char a)
例如，count("Welcome",
返回 2.编写一个测试程序，提示用户输人一个字符串以及
一个字符，显示该字符在字符串中出现的次数。
 */
/*
public class text13{
    public static void main(String[] args) {
        System.out.println("plesae input");
        Scanner input =new Scanner(System.in);
        String str= input.nextLine();
        char a=input.next().charAt(0);//经典，一行的录入第一个字符
        System.out.println(count(str,a));

    }
    public static int count(String str,char a){
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if (a==str.charAt(i)){
                count++;
            }
        }
        return count;
    }
}

 */
/*
6.24 (显示当前日期和时间）程序清单 2-7 显示当前时间。改进这个例子，显示当前的日期和时间。
在程序清单 6-12 中的日历例子，可以提供一些如何求年、月和日的思路
 */
/*
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class text13{
    public static void main(String[] args) throws ParseException {
        show();
    }
    public static void show() throws ParseException {
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH) + 1;//注意月份
        int day = now.get(Calendar.DAY_OF_MONTH);
        int hour = now.get(Calendar.HOUR_OF_DAY);
        int minute = now.get(Calendar.MINUTE);
        int second = now.get(Calendar.SECOND);
        long millis = now.getTimeInMillis();
        System.out.println(now.getTime());
        System.out.println(year + month + day + hour + minute + second + millis);
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateNowStr = sdf.format(d);
        System.out.println("格式化后的日期：" + dateNowStr);
        String str = "2021-7-24 4:08:37";
        Date today = sdf.parse(str);
        System.out.println("字符串转成日期：" + today);
    }

}

 */
/*
6.26 (田文索數）®文素教是指一个数同时为素数和回文数。例如：131是一个素数，同时也是一个
回文素数。数字 313 和 757 也是如此。编写程序，显示前 100 个回文素数。每行显示 10 个数
并且准确对齐，数字中间，空格隔开。如下所示： 2 3 S 7 11 101 131 151 181 191
313 3SB 373 383 727 7S7 787 797 919 929
 */
import java.util.ArrayList;
import java.util.List;
/*
public class text13 {

    public static void main(String[] args) {
        int num = 2;
        int count = 0;
        while (count < 100) {
            if (isPalindrome(num) && isPrime(num)) {
                count++;
                System.out.printf(String.valueOf(num)+" ");
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            num++;
        }
    }

    private static boolean isPalindrome(int num) {
        int reNum = 0;
        int numTmp = num;
        while (numTmp != 0) {
            reNum = numTmp % 10 + (reNum * 10);
            numTmp = numTmp / 10;
        }
        return num == reNum;
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;

    }
}

 */

//java中的随机生成数
/*
public class text13 {
    public static void main(String[] args) {
       int a= (int) (Math.random() * (6553 + 1));
        System.out.println(a);
    }
}

 */
/*
public class text13 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int a=(int)( (int)'a'+Math.random() * ((int)'z' - (int)'a' + 1));
            System.out.print(a+",");
        }

    }
}

 */



public  class text13 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            char ch = (char) ((char)'a'+ Math.random() * ('z' + 'a' + 1));
            System.out.println(ch);
        }
    }
}

















