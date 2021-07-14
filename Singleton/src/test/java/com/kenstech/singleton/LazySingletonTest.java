package com.kenstech.singleton;

import org.junit.jupiter.api.Test;

/**
 * @Author ken_xing
 * @Date 2021/7/14--9:47
 * @Version 1.0
 * @Description
 */
public class LazySingletonTest {

    @Test
    public void LazySingleton()
    {
        System.out.println(LazySingleton.getInstance());
        System.out.println(LazySingleton.getInstance());
    }

}
