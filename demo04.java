package edu.xcdq;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

/**
 * @author xujinwei
 * @date 2021/3/18 8:22
 */
public class demo04 {
    public static void main(String[] args) {
        System.out.println("输入星期几");
        Scanner scanner = new Scanner(System.in);
        String xingqi = scanner.next();
        System.out.println("请输入性别:");


        switch(xingqi){
            case "星期一":
                System.out.println("要上班了");
                break;




        }

        char set = '中';    //set  是字符类型
        switch(set){
            case'男':
                System.out.println("纯爷们");
                break;
        }
    }
}
