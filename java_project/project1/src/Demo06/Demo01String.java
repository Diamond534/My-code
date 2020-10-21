package Demo06;

import javax.print.DocFlavor;

/*
字符串的特点 ；
1，字符串的内容不可改变；（字符串是可以共享使用的）
2，字符串效果上相当于是char【】字符数组，但底层原理是byte【】字节数组；

创建字符串的常见的3+1种方法；
三种构造方法；
public String();    创建一个空白字符串，不含任何内容；
public String(char[] array);    根据字符数组的内容，来创建对应的字符串；
public String(byte[] array);    根据字节数组的内容，来创建对应的字符串；
一种直接创建；
String str="hello";

//注意；直接写上双引号，就是字符串对象 ；
 */
public class Demo01String {
    public static void main(String[] args) {
        //使用空参构造；
        String str1=new String();
        System.out.println("第一个字符串："+str1);

        //根据字符数组创建字符串
        char[] charArray={'a','b','c'};
        String str2=new String(charArray);
        System.out.println("第二个字符串："+str2);

        //根据字节数组创建字符串；
        byte[] byteArray={65,66,67};
        String str3=new String(byteArray);
        System.out.println("第三个字符串："+str3);

        //直接创建；
        String str4="hello world";
        System.out.println("第四个字符串："+str4);
    }
}
