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
        SimlpeSingnleton singnleton = SimlpeSingnleton.getInstance();
        SimlpeSingnleton singnleton1 = SimlpeSingnleton.getInstance();
        System.out.println(singnleton .equals(singnleton1) );
    }
}
