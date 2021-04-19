package edu.xcdq;

import java.util.Scanner;

/**
 * @author xujinwei
 * @date 2021/3/17 15:32
 */
public class demo {
    public static void main(String[] args) {
        System.out.println("请输入月份:");
        Scanner scanner = new Scanner(System.in);
        int season = scanner.nextInt();

        switch (season) {
            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;
            case 4:
            case 3:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("输入月份错误");

        }
    }
}
