/*
插入排序
 */
public class mytext2 {
    public static void main(String[] args) {
        int[] arr={1,4,3,2,55,12,67,8};
        paixu(arr);
    }
    public static void paixu(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length -i-1 ; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
