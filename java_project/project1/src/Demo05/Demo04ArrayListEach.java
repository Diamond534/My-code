package Demo05;

import java.util.ArrayList;

public class Demo04ArrayListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("小一号");
        list.add("小二号");
        list.add("小三号");
        list.add("小四号");
        list.add("小五号");
        list.add("小六号");
        list.add("小七号");
        list.add("小小四号");
        list.add("小小五号");
        list.add("小小六号");
        list.add("小小七号");

        //遍历；数组 ；；
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
        //集合；；
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
