package com.zeroten.flow;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：dsj
 * 描述：课后作业
 * 时间：2019-12-08 16:14:03
 */
public class HomeWork {

    //吸血鬼数字练习
    @Test
    public void test1(){
        for(int i=1000;i<10000;i++){
            //千位数字
            int num4=i/1000;
            //百位数字
            int num3=i%1000/100;
            //十位数字
            int num2=i%100/10;
            //个位数字
            int num1=i%10;
            //四位数排雷的所有可能性
            List<Integer> result=new ArrayList<>();
            int[] nums={num4,num3,num2,num1};
            int a,b;
            for(int j=0;j<nums.length;j++){
                for(int k=0;k<nums.length;k++){
                    if(j==k){
                        continue;
                    }
                    a=nums[j]*10+nums[k];
                    List<Integer> list=new ArrayList<>();
                    for(int x=0;x<nums.length;x++){
                        if(x==j||x==k){
                            continue;
                        }
                        list.add(nums[x]);
                    }
                    for(int y=0;y<list.size();y++){
                        for(int z=0;z<list.size();z++){
                            if(y==z){
                                continue;
                            }
                            b=list.get(y)*10+list.get(z);
                            if(a>9&&b>9){
                                if(i==a*b){
                                    if(!result.contains(i)){
                                        result.add(i);
                                        System.out.println(i+"="+a+"*"+b);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
