package com.xintong.design.singleton;

/**
 * @ClassName test
 * @Description TODO
 * @Author zsk
 * @Date 2019/10/11 11:29
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        LazySingleton singnleton = LazySingleton.getInstance();
        LazySingleton singnleton1 = LazySingleton.getInstance();
        System.out.println(singnleton .equals(singnleton1) );
    }
}
