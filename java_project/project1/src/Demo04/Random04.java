package Demo04;

import java.util.Random;
import java.util.Scanner;

/*
猜数字小游戏；
1，首先需要产生一个随机数字，一旦产生不能变化；
用Random的nextInt方法
2，需要键盘输入
用Scananer；当中的nextInt 方法；
3，判断（if）
    如果太大，提示太大，并且重试
    如果太小，提示太小，并且重试
    猜中了，游戏结束；
4，重试就是在来一次，循环次数不确定，用while（true），//死循环；
 */
public class Random04 {
    public static void main(String[] args) {
        Random r=new Random();
        int randomNum=r.nextInt(100)+1;//[1~100]

        Scanner sc=new Scanner(System.in);
        //可以猜无数次；；；
//        while (true){
//            System.out.println("请输入你猜的数字；");
//            int guessNum = sc.nextInt();//键盘输入的数字 ；
//
//            if (guessNum>randomNum){
//                System.out.println("太大了，请重试；");
//            }else if (guessNum<randomNum){
//                System.out.println("太小了，请重试；");
//            }else{
//                System.out.println("恭喜你，猜中了；");
//                break;//如果猜中，不在重试；
//            }
//        }
//        System.out.println("游戏结束；");

        //只有5次机会；；；；
        int cnt=0;
        for (int i = 0; i < 5; i++) {
            cnt++;
            if(cnt==5){
                System.out.println("你猜了几："+cnt+"次；");
                System.out.println("5次机会已用完；游戏结束；");
            }

            System.out.println("请输入你猜的数字；");
            int guessNum = sc.nextInt();//键盘输入的数字 ；

            if (guessNum>randomNum){
                System.out.println("太大了，请重试；");
            }else if (guessNum<randomNum){
                System.out.println("太小了，请重试；");
            }else{
                System.out.println("恭喜你，猜中了；");
                break;//如果猜中，不在重试；
            }

        }
        System.out.println("游戏结束；");

//        int guessNum = 0;
//        if(guessNum==randomNum){
//            System.out.println("游戏结束；");
//        }else {
//            System.out.println("5次机会已用完；游戏结束；");
//        }





//        System.out.println("请输入你猜的数字；");
//        int guessNum = sc.nextInt();//键盘输入的数字 ；
//
//        if (guessNum>randomNum){
//            System.out.println("太大了，请重试；");
//        }else if (guessNum<randomNum){
//            System.out.println("太小了，请重试；");
//        }else{
//            System.out.println("恭喜你，猜中了；");
//        }


    }
}
