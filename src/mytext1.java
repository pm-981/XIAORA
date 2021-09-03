public class mytext1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(panduan( arr));
    }
    public static boolean panduan(int[] arr){
        boolean result = true;
        int count =0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] < arr[i + 1]) {
                count++;
            }
            if (count< arr.length-1){
                result=false;
                return result;
            }
        }
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]>arr[i+1]){
                count++;
            }
            if (count< arr.length){
                result= false;
                return  result;
            }
        }
        return result;
    }
}

