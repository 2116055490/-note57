package edu.xcdq;

import java.util.Scanner;

/**
 * @author xujinwei
 * @date 2021/3/18 8:29
 */
public class demo05 {
    public static void main(String[] args) {
        System.out.println("请拨动快捷键:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number){
            case 1:
                System.out.println("拨爸爸的号码");
                break;
            case 2:
                System.out.println("拨妈妈的号码");
                break;
            case 3:
                System.out.println("拨爷爷的号码");
                break;
            case 4:
                System.out.println("拨奶奶的号码");
                break;
            default:
                System.out.println("没有录入快捷键");
                break;

        }
    }
}
