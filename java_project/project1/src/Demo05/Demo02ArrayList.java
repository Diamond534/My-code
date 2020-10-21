package Demo05;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

/*
数组的长度不可以发生改变；
但ArrayList集合的长度是可以随意变化的。
对于    ArrayList来说，有一个尖括号<E>代表泛型。
泛型；也就是装在集合当中的所有元素，全都是统一的类型。
注意；泛型只能是引用类型，不能是基本类型

对于ArrayList集合来说，直接打印得到的不是地址值，而是内容，
如果内容是空的，得到的是空的中括号 []
 */
public class Demo02ArrayList {
    public static void main(String[] args) {
        //创建一个ArrayList集合，集合名称是List，里边装的全都是String字符串类型的数据；
        ArrayList<String> list =new ArrayList<>();
        System.out.println(list); //[]

        //向集合中添加数据，用add方法
        //对象名称.add();
        list.add("小向");
        System.out.println(list);//[小向]
        list.add("小舞");
        list.add("小艾");
        list.add("小罗");
        System.out.println(list);//[小向, 小舞, 小艾, 小罗]

    }


}
