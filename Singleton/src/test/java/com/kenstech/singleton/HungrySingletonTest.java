package com.kenstech.singleton;

import org.junit.jupiter.api.Test;

/**
 * @Author ken_xing
 * @Date 2021/7/14--9:41
 * @Version 1.0
 * @Description
 */
public class HungrySingletonTest {
    @Test
    public void HungrySingleton()
    {
        System.out.println(HungrySingleton.getInstance());

        System.out.println(HungrySingleton.getInstance());
    }
}
