package edu.xcdq;

import java.util.Scanner;

/**
 * @author xujinwei
 * @date 2021/3/17 14:46
 */
public class demo01 {
    public static void main(String[] args) {
        System.out.println("开始");
        Scanner sr = new Scanner(System.in);

        System.out.println("请输入一个星期数（1-7）：");

        int week = sr.nextInt();

        if(week == 1){
            System.out.println("星期一");
        }else if (week == 2){
            System.out.println("星期二");
        }else{
            System.out.println("星期日");
        }
    }
}
