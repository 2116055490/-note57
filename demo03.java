package edu.xcdq;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * @author xujinwei
 * @date 2021/3/18 8:04
 */
public class demo03 {
    public static void main(String[] args) {
        System.out.println("请输入名次：");
        Scanner scanner = new Scanner(System.in);
        int mingci = scanner.nextInt();

        if(mingci == 1){
            System.out.println("参加夏令营");
        }
        if(mingci == 2){
            System.out.println("笔记本电脑");
        }
        if(mingci == 3){
            System.out.println("硬盘一个");
        }else{
            System.out.println("没有奖品");
        }

        switch (mingci){
            case 1:
                System.out.println("参加夏令营");
                break;
            case 2:
                System.out.println("笔记本电脑");
                break;
            case 3:
                System.out.println("硬盘一个");
                break;
            default:
                System.out.println("没有奖品");
                break;
        }
    }
}
