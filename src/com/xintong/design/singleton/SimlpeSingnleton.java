package com.xintong.design.singleton;

/**
 * @ClassName SimlpeSingnleton
 * @Description 饿汉式  类在加载的时候就已经实例化了
 * @Author zsk
 * @Date 2019/10/11 11:26
 * @Version 1.0
 */
public class SimlpeSingnleton {
    //内部是实例化
    private static  SimlpeSingnleton ss = new SimlpeSingnleton();
    public SimlpeSingnleton(){}
    //对外提供获取的方法
    public static SimlpeSingnleton getInstance(){
        return ss;
    }
}
