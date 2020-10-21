package Demo05;

import java.util.ArrayList;

/*
ArrayLisr当中的常用方法；

public boolean add(E e);向集合中添加元素，参数的类型和泛型一致。返回值代表添加是否成功

public E get(int index);从集合当中获取元素，参数是索引编号，返回值是对应位置的元素

public E remove(int index);从集合当中删除元素，参数是索引编号，返回值是被删除的元素

public int size();获取集合的长度，返回值是集合中包含的元素个数
 */
public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list =new ArrayList<>();
        System.out.println(list);//[]

        //向集合中添加元素；
        boolean success= list.add("小艾");
        System.out.println(list);//[小艾]
        System.out.println("添加的动作是否成功："+success);//添加的动作是否成功：true

        list.add("小小");
        list.add("小一");
        list.add("小二");
        list.add("小三");
        System.out.println(list);//[小艾, 小小, 小一, 小二, 小三]

        //从集合中获取元素；get。索引值从0开始；
//        list.get(2);
        System.out.println("第二个索引："+list.get(2));//小一
        String name= list.get(3);
        System.out.println("第三个索引："+name);//小二

        //从集合中删除元素；remove。索引从0开始；
        String whoremove = list.remove(0);
        System.out.println("被删除的人是"+whoremove);//被删除的人是小艾
        System.out.println(list);//[小小, 小一, 小二, 小三]

        //获取长度；
        System.out.println("集合长度："+list.size());//集合长度：4
        int size = list.size();
        System.out.println("集合长度是："+size);//集合长度是：4

    }
}
