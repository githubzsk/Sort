package com.xintong.select;

import java.util.Arrays;

/**
 * @ClassName SelectSort
 * @Author Administrator
 * @Date 2019/9/9 16:27
 * @Comment
 */
public class SelectSort {
    public static void main(String[] args) {
        Integer [] arr ={8,6,55,2,99,81,65,34,22,71,1,57};
        selectSort(arr);
        Arrays.stream(arr).map(integer -> integer+" ").forEach(System.out::print);
    }

    public static void selectSort(Integer [] arr){
        for (int i = 1; i < arr.length; i++) {
            //设最左边的数最小
            int minIndex = i-1;
            for (int j = i; j < arr.length; j++) {
                //如果左边大于右边  把右边小的数字的下标赋值给左边，一轮下来之后进行交换，最左边就是最小的数字
                if(arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            //交换元素   现在arr[minIndex]已经是最小的数字了，用arr[minIndex]和左边的数进行交换
            int temp  = arr[minIndex];
            arr[minIndex] = arr[i-1];
            arr[i-1] = temp;
        }
    }
}
