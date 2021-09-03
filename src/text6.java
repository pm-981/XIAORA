public class text6 {
    public static void main(String[] args) {
        int[] arr=new int [64*1024*1024];
        long start=System.currentTimeMillis();
        for (int  i= 0;  i< arr.length; i++) {
            arr[i]*=3;
        }
        System.out.println("循环时间"+System.currentTimeMillis());
        System.out.println("循环时间"+(System.currentTimeMillis()-start)+"毫秒");//System.currentTimeMillis()-start显示的为毫秒
        for (int i = 0; i < arr.length; i+=16) {
            arr[i]*=3;
        }
        System.out.println("循环时间"+(System.currentTimeMillis()-start)+"毫秒");
    }
}
