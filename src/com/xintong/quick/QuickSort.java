package com.xintong.quick;

import java.util.stream.Stream;

/**
 * @ClassName QuickSort
 * @Description TODO
 * @Author zsk
 * @Date 2019/10/10 17:18
 * @Version 1.0
 */
public class QuickSort {
    public static void main(String[] args) {
        Integer [] arr = {5,7,4,6,2,9,8,11,9,0};
        sort(arr,0,arr.length-1);

        Stream.of(arr).map(x -> x+" ").forEach(System.out::print);
    }

    public static void sort(Integer [] arr,Integer left,Integer right) {
        if(left > right){
            return;
        }
        //定义变量保存基准数
        Integer base = arr[left];
        //定义变量i 指向最左边
        Integer i = left;
        //定义变量j 指向最右边
        Integer j = right;

        //当i和j不相遇的时候 在循环中进行检索
        while (i != j){
            //先由j由右向左检测比基准数小的，检测到了就停下来
            while (arr[j] >= base && i < j){
                j--;//j从右往左移
            }

            while (arr[i] <= base && i < j){
                i++;//i从左往右移
            }

            //执行到这里  i 和 j 都停下了 然后交换  i和j位置的元素
            Integer temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        //如果上面的while循环条件不成立，会跳出这个循环，往下执行
        //如果这个条件不成立，说明i和j相遇了
        //如果相遇，就停止检索，交换基准书和相遇位置的这个元素

        arr[left] = arr[i];

        arr[i] = base;

        //基准数已经归为，左边所有比他小，右边所有比他大

        sort(arr, left, i-1);
        sort(arr, j+1,right);

    }
}
