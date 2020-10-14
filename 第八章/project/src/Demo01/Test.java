package Demo01;

public class Test {
    public static void main(String[] args) {
        //处理异常；
        int s=0,m=0,b=0;
        //相当于监控的代码 ；；
        try{
            //可能会产生异常的代码；
//             s=10/0;
             s=10/10;
             m=Integer.valueOf("a123");
//             b=Integer.valueOf("a123");
            Class.forName("ABC");

        }catch (ArithmeticException e){
            //出现异常后，进行处理
            System.out.println("除数不难为0；");
        }catch (NumberFormatException e){
            System.out.println("被转换的字符串不是数字；");

        } catch (ClassNotFoundException e) {
            System.out.println("找不到ABC这个类；");
        }finally {
            //必需要执行的代码；
            System.out.println("这个代码一定会执行；");
        }
        System.out.println(s);//1
        System.out.println(m);//123
//        System.out.println(b);//0

//        try{
//            //可能会产生异常的代码；
//        } catch (){
//            //出现异常后，进行处理
//        } finally {
//            //必需要执行的代码；
//        }

//        int n=10/0;
        //异常；java.lang.包中的算术异常； / by zero被0除；
        //Exception in thread "main" java.lang.ArithmeticException: / by zero
        //	at Demo01.Test.main(Test.java:5)
    }
}
