package com.xintong.bubble;

/**
 * @ClassName Bubble
 * @Author Administrator
 * @Date 2019/9/9 15:43
 * @Comment
 */
public class Bubble {
    public static void main(String[] args) {
        Integer arr[] = {1,2,3,5,8,7,4,9,6};
        BubbleSort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void BubbleSort(Integer [] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            //
            boolean flag = false;
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag){
                break;
            }
        }
    }
}
