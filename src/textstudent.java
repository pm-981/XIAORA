import java.util.Scanner;

/**
 * @author 1111
 */
public class textstudent {
    public static  void main(String[] args) {
            System.out.println("--------寝室个人信息查询--------");
            System.out.println(" ************************** ");
            System.out.println("    1.成员姓名");
            System.out.println("    2,成员年龄");
            System.out.println("    3,成员籍贯");
            System.out.println("    4，是否有女朋友");
            System.out.println("    5.成员性取向");
            System.out.println("    6，是否具有男性特征");
            System.out.println("    7，退出");
        System.out.println(" ************************** ");
            System.out.println("---------————————————-------");
            while (true) {
                Scanner INPUT = new Scanner(System.in);
                int i = INPUT.nextInt();
                m(i);
            }
    }
        public static void m(int i) {
                switch (i) {
                    case 1:
                        System.out.println("*** 成员姓名 ***");
                        System.out.println("   钱夫杰 ");
                        System.out.println("   饶春志 ");
                        System.out.println("   盛俊豪 ");
                        System.out.println("   唐雷  ");
                        System.out.println("   汪冲  ");
                        System.out.println("   汪沁  ");
                        System.out.println("***************");
                        System.out.println("      ");
                        break;
                    case 2:
                        System.out.println("*** 成员年龄 ***");
                        System.out.println("   钱夫杰 20");
                        System.out.println("   饶春志 20");
                        System.out.println("   盛俊豪 20");
                        System.out.println("   唐雷 20");
                        System.out.println("   汪冲 19");
                        System.out.println("   汪沁 20");
                        System.out.println("****************");
                        System.out.println("      ");
                        break;
                    case 3:
                        System.out.println("***** 成员籍贯 *****");
                        System.out.println("   钱夫杰 巢湖");
                        System.out.println("   饶春志 阜阳");
                        System.out.println("   盛俊豪 亳州");
                        System.out.println("   唐雷  蚌埠");
                        System.out.println("   汪冲  砀山");
                        System.out.println("   汪沁  六安");
                        System.out.println("*******************");
                        System.out.println("      ");
                        break;
                    case 4:
                        System.out.println("**** 是否有女朋友 ***");
                        System.out.println("   钱夫杰 否");
                        System.out.println("   饶春志 否");
                        System.out.println("   盛俊豪 曾经有过");
                        System.out.println("   唐雷  曾经有过");
                        System.out.println("   汪冲  曾经有过");
                        System.out.println("   汪沁  是");
                        System.out.println("********************");
                        System.out.println("      ");
                        break;
                    case 5:
                        System.out.println("****** 成员性取向 *******");
                        System.out.println("   钱夫杰性取向：>男<");
                        System.out.println("   饶春志性取向：>女<");
                        System.out.println("   盛俊豪性取向：>女<");
                        System.out.println("   唐雷性取向：<不详> ");
                        System.out.println("   汪冲性取向 ：<视情况而定>");
                        System.out.println("   汪沁性取向 ：>女< ");
                        System.out.println("**************************");
                        System.out.println("      ");
                        break;
                    case 6:
                        System.out.println("**** 是否具有男性特征 ****");
                        System.out.println("   钱夫杰 :>否<");
                        System.out.println("   饶春志 :>是<");
                        System.out.println("   盛俊豪：>是<");
                        System.out.println("   唐雷 :>是< ");
                        System.out.println("   汪冲:>是<  ");
                        System.out.println("   汪沁 : >是<");
                        System.out.println("**********************8");
                        System.out.println("      ");
                        break;

                    case 7:
                        System.out.println("**** 退出 ****");
                        System.out.println("      ");

                        break;
                }

            //}
        }

}
