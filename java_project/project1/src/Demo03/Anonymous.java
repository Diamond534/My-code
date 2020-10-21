package Demo03;
/*
匿名对象作为方法的对数和返回值 ；；都 可以使用；
 */
import java.awt.*;
import java.util.Scanner;

public class Anonymous {
    public static void main(String[] args) {
        //普通使用方式 ；
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();

        //匿名对象方式；
//        int num=new Scanner(System.in).nextInt();
//        System.out.println("输入的是："+num);

        //使用一般方法传入参数；
//        Scanner sc=new Scanner(System.in);
//        methodParam(sc);

        //使用匿名对象来进行传参数；
        methodParam(new Scanner(System.in));

        //单独调用methodReturn();
        Scanner sc = methodReturn();
        int num=sc.nextInt();
        System.out.println("输入的是："+num);
    }
    public  static  void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入的是："+num);

    }

    public  static Scanner methodReturn(){
//        Scanner sc=new Scanner(System.in);
//        return sc;
        return new Scanner(System.in);
    }
}
