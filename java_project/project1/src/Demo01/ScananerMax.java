package Demo01;

import java.util.Scanner;

public class ScananerMax {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);

        System.out.println("请输入第一个数字；");
        int a=SC.nextInt();

        System.out.println("请输入第二个数字；");
        int b=SC.nextInt();

        System.out.println("请输入第三个数字；");
        int c=SC.nextInt();

        int temp=a>b?a:b;
        int max=temp>c?temp:c;
        System.out.println("最大值为："+max);
    }
}
