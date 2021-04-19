package edu.xcdq;

import java.util.Scanner;

/**
 * @author xujinwei
 * @date 2021/3/17 15:02
 */
public class demo02 {
    public static void main(String[] args) {
        System.out.println("请输入小明的考试成绩:");
        Scanner input = new Scanner(System.in);

        int score = input.nextInt();
        if(score >= 90 && score < 95) {
            System.out.println("去游乐场玩");
        }else if (score >= 95 && score <=100){
            System.out.println("奖励一辆自行车");
        }else if (score >=80 && score <90){
            System.out.println("奖励变形金刚");
        }else if (score >100 || score <0){
            System.out.println("错误数据");
        }else{
            System.out.println("等着挨揍");
        }
     }
}
