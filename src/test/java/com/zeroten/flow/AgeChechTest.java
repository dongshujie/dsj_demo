package com.zeroten.flow;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 作者：dsj
 * 描述：测试年龄
 * 时间：2019-12-08 15:32:49
 */
public class AgeChechTest {
  //String  AgeCheck.getAgeName(int age);

    @Test
    public void testAge(){
        //0-6儿童 7-17 少年 18-40 青年 41-59 中年  60岁及以上 老年
        Assert.assertEquals(AgeCheck.getAgeName(6),"儿童");
        Assert.assertEquals(AgeCheck.getAgeName(7),"少年");
        Assert.assertEquals(AgeCheck.getAgeName(20),"青年");
        Assert.assertEquals(AgeCheck.getAgeName(45),"中年");
        Assert.assertEquals(AgeCheck.getAgeName(60),"老年");
        Assert.assertEquals(AgeCheck.getAgeName(65),"老年");

    }
}

