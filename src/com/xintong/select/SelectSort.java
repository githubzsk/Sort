package com.xintong.select;

/**
 * @ClassName SelectSort
 * @Author Administrator
 * @Date 2019/9/9 16:27
 * @Comment
 */
public class SelectSort {
    public static void main(String[] args) {

        Integer [] arr = {5,2,4,3,1,6,9,7,8};
        selectSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void selectSort(Integer [] arr){
        for (int i = 1; i < arr.length; i++) {
            int minIndex = i-1;
            for (int j = i; j <arr.length ; j++) {
                    if (arr[minIndex] > arr[j]){
                        minIndex = j;
                    }
            }//
            int temp = arr[minIndex];
            arr[minIndex] = arr[i-1];
            arr[i-1] = temp;
        }

//        for (int i = 1; i < arr.length; i++) {
//            int minIndex = i-1;
//            for (int j = i; j < arr.length; j++) {
//                if(arr[minIndex] > arr[j]){
//                    minIndex = j;
//                }
//            }
//            int temp = arr[minIndex];
//            arr[minIndex] = arr[i-1];
//            arr[i-1] = temp;
//       }


    }
}
