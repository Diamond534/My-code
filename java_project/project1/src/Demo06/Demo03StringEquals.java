package Demo06;
/*
==是进行对象的地址比较，
如果要比较字符串内容，可以使用两个方法；
public boolean equals(Object obj)；
参数可以是任何对象，只有参数是一个字符串并且内容相同的返回true；否则返回false。
备注；任何对象都可以用Object进行接收；
 */
public class Demo03StringEquals {
    public static void main(String[] args) {
        String str1="hello";
        String str2="hello";
        char[] charArray={'h','e','l','l','0'};
        String str3=new String(charArray);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));
    }
}
