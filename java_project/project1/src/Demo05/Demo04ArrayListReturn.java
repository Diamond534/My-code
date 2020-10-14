package Demo05;

import java.util.ArrayList;
import java.util.Random;

/*
用一个大集合，存入20个随机数，然后筛选其中的偶元素，放到小集合中，

1，创建一个大集合，存储int数字<Integer>
2，随机数 Random nextInt
3，循环20次，随机数放入大集合中，for循环，add方法；
4，定义一个方法，来筛选；
返回类型；ArrayList 小集合（里边元素不确定；）
方法名称；getSmallList
方法列表；ArrayList(大集合) 20个随机数；
5，判断（if）偶数；num%2==0
6，如果是偶数，放到小集合中，否则不放入；

**集合可以当作参数，也可以当作返回值；
 */
public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> bigList=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100)+1;//1~100
            bigList.add(num);
        }

        ArrayList<Integer> smallList=getSmallList(bigList);

        System.out.println("偶数共有："+smallList.size()+"个");
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));
        }
    }

    //这个方法，接收在集合的参数，返回小集合结果；
    public  static  ArrayList<Integer> getSmallList(ArrayList<Integer> bigList){
        //创建一个小集合，装偶数；
        ArrayList<Integer> smallList=new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            Integer num = bigList.get(i);
            if (num%2==0){
                smallList.add(num);
            }
        }
        return smallList;
    }
}
