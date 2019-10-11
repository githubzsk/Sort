package com.xintong.sort.bubble;

import java.util.Arrays;

/**
 * @ClassName Bubble
 * @Author Administrator
 * @Date 2019/9/9 15:43
 * @Comment
 */
public class Bubble {
    public static void main(String[] args) {
        Integer [] arr ={8,6,55,2,99,81,65,34,22,71,1,57};
        bubbleSort(arr);
        Arrays.stream(arr).forEach(System.out::print);
    }

    public static void bubbleSort(Integer [] arr){

        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    //如果有交换，说明还在排序
                    //如果没有交换 ,说明已经拍好了  flag =false       ！flag=true  跳出循环
                    flag = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if(!flag){
                break;
            }
        }
    }
}
