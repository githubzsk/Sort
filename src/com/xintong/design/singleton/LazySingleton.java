package com.xintong.design.singleton;

/**
 * @ClassName LazySingleton
 * @Description TODO
 * @Author zsk
 * @Date 2019/10/11 11:43
 * @Version 1.0
 */
public class LazySingleton {
    private static LazySingleton ls = null;

    public static LazySingleton getInstance(){
        if(ls == null){
            System.out.println("初始化");
            ls = new LazySingleton();
        }
        return ls;
    }
}
