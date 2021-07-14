package com.kenstech.singleton;

/**
 * @Author ken_xing
 * @Date 2021/7/14--9:31
 * @Version 1.0
 * @Description 恶汉模式下的几种模式
 */
public class HungrySingleton {

    //设置一个静态私有的最终属性，并实例化当前类
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance()
    {
        return instance;
    }
}
