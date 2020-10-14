package Demo05;
/*
生成6个 1~33的随机数，添加到集合，并遍历集合

1，需要存储6个数字，创建一个集合；<Integer>
2.产生随机，用Random
3，循环6次，产生6个随机。用for
4，循环内调用r.nextInt(int n)，参数是33.0~32；需整体加1；1~33；
5，数字添加到集合中；add
6，遍历；for,size,get.
 */
import java.util.ArrayList;
import java.util.Random;

public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 6; i++) {
            int num = r.nextInt(33)+1;//1~33
            list.add(num);
        }
        //遍历；
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
