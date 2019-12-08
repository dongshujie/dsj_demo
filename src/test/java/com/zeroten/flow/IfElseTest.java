package com.zeroten.flow;

import org.testng.annotations.Test;

import java.util.Random;

/**
 * 作者：dsj
 * 描述：课堂练习
 * 时间：2019-12-08 13:53:58
 */
public class IfElseTest {

    //代码块练习
    @Test
    public void test() {
        int n1 = 100;
        System.out.println(n1);
        {
            //int n1=101;
            int n2 = 200;
            System.out.println(n1);
        }
        //System.out.println(n2);
        int n2 = 201;
        System.out.println(n2);
    }

    //年龄段练习 0-6儿童 7-17 少年 18-40 青年 41-59 中年  60岁及以上 老年
    @Test
    public void testIfElse() {
        int age = 40;
        if (age < 7) {
            System.out.println(age + "岁,属于儿童");
        } else if (age < 18) {
            System.out.println(age + "岁,属于少年");
        } else if (age < 41) {
            System.out.println(age + "岁,属于青年");
        } else if (age < 60) {
            System.out.println(age + "岁,属于中年");
        } else {
            System.out.println(age + "岁,属于老年");
        }
    }


    //随机生成一个0-1000的数 ，如果不能被30整除，打印数字，否则退出循环
    @Test
    public void testCircle() {
        boolean isContinue = true;
        int times = 0;
        while (isContinue) {
            //生成0-1000范围内的整数
            int num = new Random().nextInt(1000);
            if (num % 30 == 0) {
                System.out.println(num + "能被30整除，退出循环");
                isContinue = false;
            } else {
                System.out.println("随机数" + num);
                times++;
            }
        }
        System.out.println("随机产生了" + times + "各不能被30整除的数字");
    }

    @Test
    public void testDoWhile() {
        boolean isContinue = true;
        int times = 0;
        do {
            //生成0-1000范围内的整数
            int num = new Random().nextInt(1000);
            if (num % 30 == 0) {
                System.out.println(num + "能被30整除，退出循环");
                isContinue = false;
            } else {
                System.out.println("随机数" + num);
                times++;
            }
        } while (isContinue);
        System.out.println("随机产生了" + times + "各不能被30整除的数字");
    }

    @Test
    public void testFor() {
        //打印01--范围内单数并计算范围内单数的总数
        int count = 0;
        for (int i = 0; i < 101; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("单数总个数" + count);
    }


    @Test
    public void testSwitch() {
        int num = 3;
        switch (num) {
            case 1:
                System.out.println("1扫地");
                break;
            case 2:
                System.out.println("2开灯");
                break;
            case 3:
                System.out.println("3关灯");
                break;
            case 4:
                System.out.println("4播放音乐");
                break;
            case 5:
                System.out.println("5关闭音乐");
                break;
            default:
                System.out.println("不能识别");
        }
    }


    @Test
    public void testBreak() {
        int times = 0;
        while (true) {
            //生成0-1000范围内的整数
            int num = new Random().nextInt(1000);
            if (num % 30 == 0) {
                System.out.println(num + "能被30整除，退出循环");
                break;
            } else {
                System.out.println(num + "不能被30整除，继续");
                times++;
            }
        }
        System.out.println("随机产生了" + times + "各不能被30整除的数字");
    }


    //找出0-n2范围内除以n1余7的最大的数，找到则返回,否则返回-1
    int getMaxNumRem7(int n1, int n2) {
        for (int n = n2; n >= 0; n--) {
            if (n % n1 == 7) {
                return n;
            }
        }
        return -1;
    }

    @Test
    public void testReturn(){
        int n=getMaxNumRem7(3,10);
        System.out.println(n);
    }

    @Test
    public void testContinue(){
        int count=0;
        for(int i=0;i<100;i++){
            if(i%7!=0){
                continue;
            }
            System.out.println(i+"能被7整除");
            count++;
        }
        System.out.println("0-100内总共有"+count+"个数能被7整除");
    }
}
