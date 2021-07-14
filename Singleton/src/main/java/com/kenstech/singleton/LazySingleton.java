package com.kenstech.singleton;

/**
 * @Author ken_xing
 * @Date 2021/7/14--9:29
 * @Version 1.0
 * @Description 懒汉单例模式
 * 单例模式涉及到一个单一的类，他自己实例化自己，同时保证只有单个对象被创建。该类提供一种访问其唯一对象的方法，可以直接访问不需要实例化
 * 因为该类中有同步锁（synchronized），所以该类是线程安全的。主要用于系统首次运行时，加载的配置和一些属性时，因为这些配置和属性在整个
 * 生命周期中都存在，所以只需要运行一份就行。
 */
public class LazySingleton {
    private static LazySingleton instance;

    public LazySingleton(){}

    public static LazySingleton getInstance()
    {
        if (instance==null)
        {
            instance=new LazySingleton();
        }
        return instance;
    }

}

public class LazySingleton1{
    private static LazySingleton1 instance;

    public LazySingleton1(){}

    public static LazySingleton1 getInstance()
    {
        if (instance==null)
        {
            //加入同步锁
            synchronized (LazySingleton1.class)
            {
                if(instance==null)
                {
                    instance=new LazySingleton1();
                }
            }
        }
        return instance;
    }
}
